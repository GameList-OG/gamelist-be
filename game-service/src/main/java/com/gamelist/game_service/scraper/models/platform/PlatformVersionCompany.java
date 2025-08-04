package com.gamelist.game_service.scraper.models.platform;

import com.gamelist.game_service.scraper.models.company.Company;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#platform-version-company

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "platform_version_companies")
public class PlatformVersionCompany {

    @Id
    private int id;

    private String comment;
    private boolean developer;
    private boolean manufacturer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platform_version_id")
    private PlatformVersion platformVersion;

    private UUID checksum;
}
