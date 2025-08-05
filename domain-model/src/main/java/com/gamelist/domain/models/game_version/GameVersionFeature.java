package com.gamelist.domain.models.game_version;

import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#game-version-feature

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "game_version_features")
public class GameVersionFeature {

    @Id
    private int id;

    private String title;
    private String description;
    private int position;

    @Enumerated(EnumType.STRING)
    @Column(name = "game_version_feature_category")
    private GameVersionFeatureType category;

    @OneToMany(mappedBy = "gameVersionFeature", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GameVersionFeatureValue> values;

    @ManyToMany(mappedBy = "gameVersionFeatures")
    private Set<GameVersion> gameVersions;

    private UUID checksum;
}
