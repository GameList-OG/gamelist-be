package com.gamelist.game_service.scraper.models.game;

// https://api-docs.igdb.com/#game

import com.gamelist.game_service.scraper.models.Genre;
import com.gamelist.game_service.scraper.models.Keyword;
import com.gamelist.game_service.scraper.models.PlayerPerspective;
import com.gamelist.game_service.scraper.models.Theme;
import com.gamelist.game_service.scraper.models.age_rating.AgeRating;
import com.gamelist.game_service.scraper.models.artwork.Artwork;
import com.gamelist.game_service.scraper.models.characters.Character;
import com.gamelist.game_service.scraper.models.website.Website;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "games")
public class Game {

    @Id
    private int id;

    private double aggregatedRating;
    private int aggregatedRatingCount;

    private double rating;
    private int ratingCount;

    private double totalRating;
    private int totalRatingCount;

    private String name;
    private String slug;
    private String storyline;
    private String summary;

    private Integer hypes;
    private String url;
    private String versionTitle;

    private Instant firstReleaseDate;

    @OneToMany(
            mappedBy = "game",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<AgeRating> ageRatings;

    @OneToMany(
            mappedBy = "game",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Artwork> artworks;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_genres",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_themes",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "theme_id")
    )
    private Set<Theme> themes;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_keywords",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "keyword_id")
    )
    private Set<Keyword> keywords;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_player_perspectives",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "player_perspective_id")
    )
    private Set<PlayerPerspective> playerPerspectives;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_characters",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private Set<Character> characters;

    @OneToMany(
            mappedBy = "game",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Website> websites;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}