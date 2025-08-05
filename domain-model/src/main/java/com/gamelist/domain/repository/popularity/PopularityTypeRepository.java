package com.gamelist.domain.repository.popularity;

import com.gamelist.domain.models.popularity.PopularityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopularityTypeRepository extends JpaRepository<PopularityType, Integer> {}
