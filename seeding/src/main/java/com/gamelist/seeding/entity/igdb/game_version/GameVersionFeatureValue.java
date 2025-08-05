package com.gamelist.seeding.entity.igdb.game_version;

import com.gamelist.seeding.entity.igdb.game.Game;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#game-version-feature-value

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "game_version_feature_values")
public class GameVersionFeatureValue {

    @Id
    private int id;

    private String note;

    @Enumerated(EnumType.STRING)
    @Column(name = "included_feature")
    private GameVersionFeatureValueType includedFeature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_version_feature_id")
    private GameVersionFeature gameVersionFeature;

    private UUID checksum;
}
