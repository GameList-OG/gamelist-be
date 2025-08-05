package com.gamelist.seeding.entity.igdb.game;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#game-mode

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "game_modes")
public class GameMode {

    @Id
    private int id;

    private String name;
    private String slug;
    private String url;

    @ManyToMany(mappedBy = "gameModes", fetch = FetchType.LAZY)
    private Set<Game> games;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
