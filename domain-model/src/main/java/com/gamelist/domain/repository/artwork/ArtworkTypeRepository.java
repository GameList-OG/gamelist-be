package com.gamelist.domain.repository.artwork;

import com.gamelist.domain.models.artwork.ArtworkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtworkTypeRepository extends JpaRepository<ArtworkType, Integer> {}
