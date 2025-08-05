package com.gamelist.seeding.entity.igdb.collection;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// https://api-docs.igdb.com/#collection-membership-type

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "collection_membership_types")
public class CollectionMembershipType {

    @Id
    private int id;

    private String name;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "allowed_collection_type_id")
    private CollectionType allowedCollectionType;

    @OneToMany(mappedBy = "collectionMembershipType")
    private Set<CollectionMembership> collectionMemberships;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    private UUID checksum;
}
