package com.gamelist.seeding.repository;

import com.gamelist.seeding.old.Game;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface GameRepository extends JpaRepository<Game, Long>, JpaSpecificationExecutor<Game> {
    @Query("SELECT g FROM games g ORDER BY g.id ASC")
    List<Game> findAllGamesOrderedById();
}
