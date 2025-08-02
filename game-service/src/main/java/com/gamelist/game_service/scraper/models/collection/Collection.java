package com.gamelist.game_service.scraper.models.collection;

import com.gamelist.game_service.scraper.models.game.Game;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

// https://api-docs.igdb.com/#collection

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "collections")
public class Collection {

    @Id
    private int id;

    private String name;
    private String slug;
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_type_id")
    private CollectionType collectionType;

    @OneToMany(
            mappedBy = "collection",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<CollectionMembership> collectionMemberships;

    @OneToMany(mappedBy = "allowedChildType")
    private Set<CollectionRelationType> childCollectionRelationTypes;

    @OneToMany(mappedBy = "allowedParentType")
    private Set<CollectionRelationType> parentCollectionRelationTypes;

    @OneToMany(
            mappedBy = "childCollection",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<CollectionRelation> childCollectionRelations;

    @OneToMany(
            mappedBy = "parentCollection",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<CollectionRelation> parentCollectionRelations;

    @ManyToMany(
            mappedBy = "collections",
            fetch = FetchType.LAZY
    )
    private Set<Game> games;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}