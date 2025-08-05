package com.gamelist.domain.repository;

import com.gamelist.domain.models.PlayerPerspective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerPerspectiveRepository extends JpaRepository<PlayerPerspective, Integer> {}
