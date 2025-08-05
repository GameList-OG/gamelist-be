package com.gamelist.domain.models.game;

import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
