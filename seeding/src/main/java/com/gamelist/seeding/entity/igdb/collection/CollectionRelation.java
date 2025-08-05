package com.gamelist.seeding.entity.igdb.collection;

import com.gamelist.game_service.scraper.models.collection.Collection;
import com.gamelist.game_service.scraper.models.collection.CollectionRelationType;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

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
