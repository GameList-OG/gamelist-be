package com.gamelist.domain.repository.collection;

import com.gamelist.domain.models.collection.CollectionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionTypeRepository extends JpaRepository<CollectionType, Integer> {}
