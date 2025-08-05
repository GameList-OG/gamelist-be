package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.GameTimeToBeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameTimeToBeatRepository extends JpaRepository<GameTimeToBeat, Integer> {}
