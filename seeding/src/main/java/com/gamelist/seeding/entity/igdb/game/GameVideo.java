package com.gamelist.seeding.entity.igdb.game;

import com.gamelist.game_service.scraper.models.game.Game;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

// https://api-docs.igdb.com/#game_video

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "game_videos")
public class GameVideo {

    @Id
    private int id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    private UUID checksum;
}
