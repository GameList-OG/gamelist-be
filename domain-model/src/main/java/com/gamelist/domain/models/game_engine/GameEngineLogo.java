package com.gamelist.domain.models.game_engine;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#game-engine-logo

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "game_engine_logos")
public class GameEngineLogo {

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
