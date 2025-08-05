package com.gamelist.domain.repository.external_game;

import com.gamelist.domain.models.external_game.ExternalGameSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalGameSourceRepository extends JpaRepository<ExternalGameSource, Integer> {}
