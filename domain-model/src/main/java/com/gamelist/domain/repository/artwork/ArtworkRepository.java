package com.gamelist.domain.repository.artwork;

import com.gamelist.domain.models.artwork.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtworkRepository extends JpaRepository<Artwork, Integer> {}
