package com.gamelist.domain.repository.external_game;

import com.gamelist.domain.models.external_game.ExternalGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalGameRepository extends JpaRepository<ExternalGame, Integer> {}
