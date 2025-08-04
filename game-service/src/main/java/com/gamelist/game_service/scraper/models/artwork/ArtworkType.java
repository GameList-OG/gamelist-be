package com.gamelist.game_service.scraper.models.artwork;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#artwork-type

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "artwork_types")
public class ArtworkType {

    @Id
    private int id;

    private String url;
    private String slug;

    @OneToMany(mappedBy = "artworkType")
    private Set<Artwork> artworks;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
