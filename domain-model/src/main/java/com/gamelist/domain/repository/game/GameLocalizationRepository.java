package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.GameLocalization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameLocalizationRepository extends JpaRepository<GameLocalization, Integer> {}
