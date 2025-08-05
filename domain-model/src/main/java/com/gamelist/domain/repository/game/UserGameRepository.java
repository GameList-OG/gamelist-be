package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGameRepository extends JpaRepository<UserGame, Long> {
}
