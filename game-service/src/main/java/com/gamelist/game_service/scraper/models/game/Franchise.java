package com.gamelist.game_service.scraper.models.game;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#franchise

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "franchises")
public class Franchise {

    @Id
    private int id;

    private String name;
    private String slug;
    private String url;

    @OneToMany(mappedBy = "primaryFranchise", fetch = FetchType.LAZY)
    private Set<Game> gamesAsPrimary;

    @ManyToMany(mappedBy = "allFranchises", fetch = FetchType.LAZY)
    private Set<Game> associatedGames;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
