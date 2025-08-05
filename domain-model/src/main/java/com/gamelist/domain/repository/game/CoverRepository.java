package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.Cover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoverRepository extends JpaRepository<Cover, Integer> {}
