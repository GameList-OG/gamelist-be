package com.gamelist.game_service.scraper.models.game;

// https://api-docs.igdb.com/#game

import com.gamelist.game_service.scraper.models.Genre;
import com.gamelist.game_service.scraper.models.age_rating.AgeRating;
import com.gamelist.game_service.scraper.models.artwork.Artwork;
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

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}