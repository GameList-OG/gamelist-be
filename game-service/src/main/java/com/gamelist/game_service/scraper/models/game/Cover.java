package com.gamelist.game_service.scraper.models.game;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#cover

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "covers")
public class Cover {

    @Id
    private int id;

    private String url;
    private String imageId;
    private int height;
    private int width;
    private boolean animated;
    private boolean alphaChannel;

    @OneToMany(mappedBy = "cover", fetch = FetchType.LAZY)
    private Set<Game> games;

    @OneToMany(mappedBy = "cover", fetch = FetchType.LAZY)
    private Set<GameLocalization> gameLocalizations;
    
    private UUID checksum;
}