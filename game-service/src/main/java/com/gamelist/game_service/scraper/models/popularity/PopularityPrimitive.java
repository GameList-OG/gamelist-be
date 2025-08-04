package com.gamelist.game_service.scraper.models.popularity;

import com.gamelist.game_service.scraper.models.external_game.ExternalGameSource;
import com.gamelist.game_service.scraper.models.game.Game;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#popularity-primitive

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "popularity_primitives")
public class PopularityPrimitive {

    @Id
    private int id;

    private BigDecimal value;
    private Instant calculatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "external_game_source_id")
    private ExternalGameSource externalGameSource;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "popularity_type_id")
    private PopularityType popularityType;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
