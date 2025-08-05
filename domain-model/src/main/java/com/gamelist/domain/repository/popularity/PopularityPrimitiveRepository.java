package com.gamelist.domain.repository.popularity;

import com.gamelist.domain.models.popularity.PopularityPrimitive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopularityPrimitiveRepository extends JpaRepository<PopularityPrimitive, Integer> {}
