package com.gamelist.domain.models.platform;

import com.gamelist.domain.models.website.WebsiteType;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#platform-website

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "platform_websites")
public class PlatformWebsite {

    @Id
    private int id;

    private String url;
    private boolean trusted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "website_type_id")
    private WebsiteType websiteType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_id")
    private Platform platform;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
