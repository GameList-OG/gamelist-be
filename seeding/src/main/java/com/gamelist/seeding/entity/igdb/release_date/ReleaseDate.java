package com.gamelist.seeding.entity.igdb.release_date;

import com.gamelist.game_service.scraper.models.DateFormat;
import com.gamelist.game_service.scraper.models.game.Game;
import com.gamelist.game_service.scraper.models.platform.Platform;
import com.gamelist.game_service.scraper.models.release_date.ReleaseDateRegion;
import com.gamelist.game_service.scraper.models.release_date.ReleaseDateStatus;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

// https://api-docs.igdb.com/#release-date

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "release_dates")
public class ReleaseDate {

    @Id
    private int id;

    private Instant date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "date_format_id")
    private DateFormat format;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_id")
    private Platform platform;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "release_date_region_id")
    private ReleaseDateRegion region;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "release_date_status_id")
    private ReleaseDateStatus status;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
