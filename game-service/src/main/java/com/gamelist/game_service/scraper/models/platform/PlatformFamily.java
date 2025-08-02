package com.gamelist.game_service.scraper.models.platform;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

// https://api-docs.igdb.com/#platform-family

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "platform_families")
public class PlatformFamily {

    @Id
    private int id;

    private String name;
    private String slug;

    private UUID checksum;
}