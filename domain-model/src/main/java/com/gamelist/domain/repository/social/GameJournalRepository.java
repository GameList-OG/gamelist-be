package com.gamelist.domain.repository.social;

import com.gamelist.domain.models.social.GameJournal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameJournalRepository extends JpaRepository<GameJournal, Long> {
}
