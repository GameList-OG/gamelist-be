package com.gamelist.game_service.scraper.models.platform;

import com.gamelist.game_service.scraper.models.DateFormat;
import com.gamelist.game_service.scraper.models.release_date.ReleaseDateRegion;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#platform-version-release-date

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "platform_version_release_dates")
public class PlatformVersionReleaseDate {

    @Id
    private int id;

    private Instant date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "date_format_id")
    private DateFormat dateFormat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_version_id")
    private PlatformVersion platformVersion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "release_region_id")
    private ReleaseDateRegion releaseDateRegion;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
