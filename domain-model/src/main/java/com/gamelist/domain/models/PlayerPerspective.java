package com.gamelist.domain.models;

import com.gamelist.domain.models.game.Game;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#player-perspective

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "player_perspectives")
public class PlayerPerspective {

    @Id
    private int id;

    private String name;
    private String slug;
    private String url;

    @ManyToMany(mappedBy = "playerPerspectives", fetch = FetchType.LAZY)
    private Set<Game> games;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
