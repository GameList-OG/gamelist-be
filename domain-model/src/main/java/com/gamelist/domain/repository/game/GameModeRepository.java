package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.GameMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameModeRepository extends JpaRepository<GameMode, Integer> {}
