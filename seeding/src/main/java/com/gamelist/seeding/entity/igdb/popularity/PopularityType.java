package com.gamelist.seeding.entity.igdb.popularity;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#popularity-type

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "popularity_types")
public class PopularityType {

    @Id
    private int id;

    private String name;

    @OneToMany(mappedBy = "popularityType")
    private Set<PopularityPrimitive> popularityPrimitives;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
