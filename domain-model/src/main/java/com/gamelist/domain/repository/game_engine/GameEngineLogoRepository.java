package com.gamelist.domain.repository.game_engine;

import com.gamelist.domain.models.game_engine.GameEngineLogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameEngineLogoRepository extends JpaRepository<GameEngineLogo, Integer> {}
