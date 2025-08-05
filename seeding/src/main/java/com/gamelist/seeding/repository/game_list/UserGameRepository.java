package com.gamelist.seeding.repository.game_list;

import com.gamelist.seeding.entity.game_list.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGameRepository extends JpaRepository<UserGame, Long> {}
