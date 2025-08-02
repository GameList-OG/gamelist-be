package com.gamelist.game_service.scraper.models.platform;

import com.gamelist.game_service.scraper.models.game.Game;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#platform

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "platforms")
public class Platform {

    @Id
    private int id;

    private String name;
    private String slug;
    private String url;
    private String abbreviation;
    private String alternativeName;
    private String summary;
    private int generation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_family_id")
    private PlatformFamily platformFamily;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_logo_id")
    private PlatformLogo platformLogo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_type_id")
    private PlatformType platformType;

    @OneToMany(
            mappedBy = "platform",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<PlatformVersion> versions;

    @OneToMany(
            mappedBy = "platform",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<PlatformWebsite> websites;

    @ManyToMany(
            mappedBy = "platforms",
            fetch = FetchType.LAZY
    )
    private Set<Game> games;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}