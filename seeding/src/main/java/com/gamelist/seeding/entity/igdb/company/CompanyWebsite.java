package com.gamelist.seeding.entity.igdb.company;

import com.gamelist.seeding.entity.igdb.website.WebsiteType;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#company-website

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "company_websites")
public class CompanyWebsite {

    @Id
    private int id;

    private String url;
    private boolean trusted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "website_type_id")
    private WebsiteType websiteType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    private UUID checksum;
}
