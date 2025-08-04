package com.gamelist.game_service.scraper.models.game;

import com.gamelist.game_service.scraper.models.Genre;
import com.gamelist.game_service.scraper.models.Keyword;
import com.gamelist.game_service.scraper.models.PlayerPerspective;
import com.gamelist.game_service.scraper.models.Theme;
import com.gamelist.game_service.scraper.models.age_rating.AgeRating;
import com.gamelist.game_service.scraper.models.artwork.Artwork;
import com.gamelist.game_service.scraper.models.characters.Character;
import com.gamelist.game_service.scraper.models.collection.Collection;
import com.gamelist.game_service.scraper.models.collection.CollectionMembership;
import com.gamelist.game_service.scraper.models.company.InvolvedCompany;
import com.gamelist.game_service.scraper.models.external_game.ExternalGame;
import com.gamelist.game_service.scraper.models.game_engine.GameEngine;
import com.gamelist.game_service.scraper.models.game_version.GameVersion;
import com.gamelist.game_service.scraper.models.game_version.GameVersionFeatureValue;
import com.gamelist.game_service.scraper.models.langauge.LanguageSupport;
import com.gamelist.game_service.scraper.models.platform.Platform;
import com.gamelist.game_service.scraper.models.popularity.PopularityPrimitive;
import com.gamelist.game_service.scraper.models.release_date.ReleaseDate;
import com.gamelist.game_service.scraper.models.website.Website;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#game

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
    private String versionTitle;

    private Integer hypes;
    private String url;
    private Instant firstReleaseDate;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ReleaseDate> releaseDates;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AgeRating> ageRatings;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AlternativeName> alternativeNames;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Artwork> artworks;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Website> websites;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GameVideo> gameVideos;

    @OneToMany(mappedBy = "mainGame", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GameVersionFeatureValue> gameVersionFeatureValues;

    @OneToMany(mappedBy = "mainGame", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GameVersion> versions;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<LanguageSupport> languageSupports;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<InvolvedCompany> involvedCompanies;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CollectionMembership> collectionMemberships;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MultiplayerMode> multiplayerModes;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ExternalGame> externalGames;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Screenshot> screenshots;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GameLocalization> gameLocalizations;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PopularityPrimitive> popularityPrimitives;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cover_id")
    private Cover cover;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "primary_franchise_id")
    private Franchise primaryFranchise;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_game_id")
    private Game parentGame;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "version_parent_game_id")
    private Game versionParent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_status_id")
    private GameStatus gameStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_type_id")
    private GameType gameType;

    @ManyToMany(mappedBy = "featuredGames")
    private Set<GameVersion> featuredInVersions;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_ports",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "game_port_id"))
    private Set<Game> gamePorts;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_remakes",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "game_remake_id"))
    private Set<Game> remakes;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_remasters",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "remastered_game_id"))
    private Set<Game> remasters;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "similar_games",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "similar_game_id"))
    private Set<Game> similarGames;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "standalone_expansions",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "standalone_expansion_game_id"))
    private Set<Game> standaloneExpansions;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_platforms",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "platform_id"))
    private Set<Platform> platforms;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_to_game_engines",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "game_engine_id"))
    private Set<GameEngine> gameEngines;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_genres",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genres;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_themes",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "theme_id"))
    private Set<Theme> themes;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_keywords",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "keyword_id"))
    private Set<Keyword> keywords;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_collections",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "collection_id"))
    private Set<Collection> collections;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_game_modes",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "game_mode_id"))
    private Set<GameMode> gameModes;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_player_perspectives",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "player_perspective_id"))
    private Set<PlayerPerspective> playerPerspectives;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_characters",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id"))
    private Set<Character> characters;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_franchises",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "franchise_id"))
    private Set<Franchise> allFranchises;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
