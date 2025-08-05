package com.gamelist.domain.repository.social;

import com.gamelist.domain.models.social.StatusUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusUpdateRepository extends JpaRepository<StatusUpdate, Long> {
}
