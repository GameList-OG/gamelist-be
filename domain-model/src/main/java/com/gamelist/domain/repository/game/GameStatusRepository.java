package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.GameStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStatusRepository extends JpaRepository<GameStatus, Integer> {}
