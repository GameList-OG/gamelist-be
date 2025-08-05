package com.gamelist.seeding.repository;

import com.gamelist.seeding.entity.game_list.GameJournal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameJournalRepository extends JpaRepository<GameJournal, Long> {
}
