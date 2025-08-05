package com.gamelist.seeding.entity.igdb.characters;

import com.gamelist.seeding.entity.igdb.game.Game;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#character

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "characters")
public class Character {

    @Id
    private int id;

    private String name;
    private String description;
    private String slug;
    private String url;
    private String countryName;

    @CollectionTable(name = "character_aliases", joinColumns = @JoinColumn(name = "character_id"))
    @ElementCollection(fetch = FetchType.LAZY)
    @Column(name = "alias")
    private Set<String> aliases;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_gender_id")
    private CharacterGender characterGender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_specie_id")
    private CharacterSpecie characterSpecie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_mug_shot_id")
    private CharacterMugShot characterMugShot;

    @ManyToMany(mappedBy = "characters", fetch = FetchType.LAZY)
    private Set<Game> games;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
