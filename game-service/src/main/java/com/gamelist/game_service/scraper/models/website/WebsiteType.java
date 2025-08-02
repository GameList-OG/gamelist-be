package com.gamelist.game_service.scraper.models.website;

import com.gamelist.game_service.scraper.models.company.CompanyWebsite;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#website-type

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "website_types")
public class WebsiteType {

    @Id
    private int id;

    private String type;

    @OneToMany(mappedBy = "websiteType", fetch = FetchType.LAZY)
    private Set<Website> websites;

    @OneToMany(mappedBy = "websiteType", fetch = FetchType.LAZY)
    private Set<CompanyWebsite> companyWebsites;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}