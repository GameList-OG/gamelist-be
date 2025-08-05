package com.gamelist.domain.repository.collection;

import com.gamelist.domain.models.collection.CollectionRelationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRelationTypeRepository extends JpaRepository<CollectionRelationType, Integer> {}
