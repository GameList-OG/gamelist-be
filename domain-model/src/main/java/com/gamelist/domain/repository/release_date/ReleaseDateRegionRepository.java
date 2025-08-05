package com.gamelist.domain.repository.release_date;

import com.gamelist.domain.models.release_date.ReleaseDateRegion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseDateRegionRepository extends JpaRepository<ReleaseDateRegion, Integer> {}
