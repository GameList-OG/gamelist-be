package com.gamelist.domain.models.artwork;

import com.gamelist.domain.models.game.Game;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#artwork

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "artworks")
public class Artwork {

    @Id
    private int id;

    private String url;
    private String imageId;
    private int height;
    private int width;
    private boolean animated;
    private boolean alphaChannel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artwork_type_id")
    private ArtworkType artworkType;

    private UUID checksum;
}
