package com.gamelist.game_service.scraper.models.collection;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#collection-relation-type

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "collection_relation_types")
public class CollectionRelationType {

    @Id
    private int id;

    private String name;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "allowed_child_collection_id")
    private Collection allowedChildType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "allowed_parent_collection_id")
    private Collection allowedParentType;

    @OneToMany(mappedBy = "collectionRelationType")
    private Set<CollectionRelation> collectionRelations;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
