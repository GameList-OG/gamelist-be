package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.GameType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameTypeRepository extends JpaRepository<GameType, Integer> {}
