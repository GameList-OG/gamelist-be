package com.gamelist.seeding.repository;

import com.gamelist.seeding.entity.game_list.InteractiveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractiveEntityRepository extends JpaRepository<InteractiveEntity, Long> {
}
