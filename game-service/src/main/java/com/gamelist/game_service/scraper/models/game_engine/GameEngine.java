package com.gamelist.game_service.scraper.models.game_engine;

import com.gamelist.game_service.scraper.models.company.Company;
import com.gamelist.game_service.scraper.models.game.Game;
import com.gamelist.game_service.scraper.models.platform.Platform;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#game-engine

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "game_engines")
public class GameEngine {

    @Id
    private int id;

    private String name;
    private String description;
    private String slug;
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_engine_logo_id")
    private GameEngineLogo gameEngineLogo;

    @ManyToMany(mappedBy = "gameEngines")
    private Set<Game> games;

    @ManyToMany(
            mappedBy = "gameEngines",
            fetch = FetchType.LAZY
    )
    private Set<Company> companies;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "game_engines_platforms",
            joinColumns = @JoinColumn(name = "game_engine_id"),
            inverseJoinColumns = @JoinColumn(name = "platform_id")
    )
    private Set<Platform> platforms;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}