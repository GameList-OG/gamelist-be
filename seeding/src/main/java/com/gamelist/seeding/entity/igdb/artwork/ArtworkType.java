package com.gamelist.seeding.entity.igdb.artwork;

import com.gamelist.game_service.scraper.models.artwork.Artwork;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

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
