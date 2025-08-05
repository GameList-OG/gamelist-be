package com.gamelist.domain.repository.collection;

import com.gamelist.domain.models.collection.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Integer> {}
