package com.gamelist.domain.repository.collection;

import com.gamelist.domain.models.collection.CollectionMembershipType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionMembershipTypeRepository extends JpaRepository<CollectionMembershipType, Integer> {}
