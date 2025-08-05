package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.MultiplayerMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiplayerModeRepository extends JpaRepository<MultiplayerMode, Integer> {}
