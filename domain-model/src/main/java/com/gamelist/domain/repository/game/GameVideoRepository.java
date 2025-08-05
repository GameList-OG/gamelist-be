package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.GameVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameVideoRepository extends JpaRepository<GameVideo, Integer> {}
