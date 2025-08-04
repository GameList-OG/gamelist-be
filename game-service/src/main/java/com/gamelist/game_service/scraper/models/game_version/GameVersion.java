package com.gamelist.game_service.scraper.models.game_version;

import com.gamelist.game_service.scraper.models.game.Game;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#game-version

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "game_versions")
public class GameVersion {

    @Id
    private int id;

    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "main_game_id")
    private Game mainGame;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_version_associations",
            joinColumns = @JoinColumn(name = "game_version_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id"))
    private Set<Game> featuredGames;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_versions_game_version_features",
            joinColumns = @JoinColumn(name = "game_version_id"),
            inverseJoinColumns = @JoinColumn(name = "game_version_feature_id"))
    private Set<GameVersionFeature> gameVersionFeatures;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
