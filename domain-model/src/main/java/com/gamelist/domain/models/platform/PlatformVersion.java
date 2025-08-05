package com.gamelist.domain.models.platform;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#platform-version

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "platform_versions")
public class PlatformVersion {

    @Id
    private int id;

    private String name;
    private String slug;
    private String url;
    private String summary;

    private String connectivity;
    private String cpu;
    private String graphics;
    private String media;
    private String memory;
    private String os;
    private String output;
    private String resolutions;
    private String sound;
    private String storage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_id")
    private Platform platform;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "main_manufacturer_platform_version_id")
    private PlatformVersion mainManufacturer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_logo_id")
    private PlatformLogo platformLogo;

    @OneToMany(mappedBy = "platformVersion", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlatformVersionCompany> platformVersionCompanies;

    @OneToMany(mappedBy = "platformVersion", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlatformVersionReleaseDate> platformVersionReleaseDates;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
