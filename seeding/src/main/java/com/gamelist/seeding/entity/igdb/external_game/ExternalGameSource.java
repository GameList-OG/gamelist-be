package com.gamelist.seeding.entity.igdb.external_game;

import com.gamelist.game_service.scraper.models.popularity.PopularityPrimitive;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#external-game-source

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "external_game_sources")
public class ExternalGameSource {

    @Id
    private int id;

    private String name;

    @OneToMany(mappedBy = "externalGameSource")
    private Set<ExternalGame> externalGames;

    @OneToMany(mappedBy = "externalGameSource")
    private Set<PopularityPrimitive> popularityPrimitives;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
