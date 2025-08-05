package com.gamelist.domain.repository.collection;

import com.gamelist.domain.models.collection.CollectionRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRelationRepository extends JpaRepository<CollectionRelation, Integer> {}
