package com.gamelist.game_service.scraper.models.company;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

// https://api-docs.igdb.com/#company-logo

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "company_logos")
public class CompanyLogo {

    @Id
    private int id;

    private String url;
    private String imageId;
    private int height;
    private int width;
    private boolean animated;
    private boolean alphaChannel;

    private UUID checksum;
}