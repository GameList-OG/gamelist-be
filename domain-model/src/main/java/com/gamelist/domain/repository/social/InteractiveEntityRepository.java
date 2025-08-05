package com.gamelist.domain.repository.social;

import com.gamelist.domain.models.social.InteractiveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractiveEntityRepository extends JpaRepository<InteractiveEntity, Long> {
}
