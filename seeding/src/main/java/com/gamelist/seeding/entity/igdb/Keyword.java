package com.gamelist.seeding.entity.igdb;

import com.gamelist.game_service.scraper.models.game.Game;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#keyword

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "keywords")
public class Keyword {

    @Id
    private int id;

    private String name;
    private String slug;
    private String url;

    @ManyToMany(mappedBy = "keywords", fetch = FetchType.LAZY)
    private Set<Game> games;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
