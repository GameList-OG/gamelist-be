package com.gamelist.game_service.scraper.models.external_game;

import com.gamelist.game_service.scraper.models.game.Game;
import com.gamelist.game_service.scraper.models.game.GameReleaseFormat;
import com.gamelist.game_service.scraper.models.platform.Platform;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#external-game

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "external_games")
public class ExternalGame {

    @Id
    private int id;

    private String name;
    private String uid;
    private String url;
    private int year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "external_game_source_id")
    private ExternalGameSource externalGameSource;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_release_format_id")
    private GameReleaseFormat gameReleaseFormat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_id")
    private Platform platform;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
