package com.gamelist.seeding.entity.igdb.collection;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#collection-relation

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "collection_relations")
public class CollectionRelation {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "child_collection_id")
    private Collection childCollection;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_collection_id")
    private Collection parentCollection;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_relation_type_id")
    private CollectionRelationType collectionRelationType;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
