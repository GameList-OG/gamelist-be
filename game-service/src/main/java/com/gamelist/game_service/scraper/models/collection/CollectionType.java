package com.gamelist.game_service.scraper.models.collection;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#collection-type

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "collection_types")
public class CollectionType {

    @Id
    private int id;

    @OneToMany(mappedBy = "collectionType")
    private Set<Collection> collections;

    @OneToMany(mappedBy = "allowedCollectionType")
    private Set<CollectionMembershipType> collectionMembershipTypes;

    private String name;
    private String description;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}