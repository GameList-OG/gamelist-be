package com.gamelist.domain.repository.game;

import com.gamelist.domain.models.game.AlternativeName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativeNameRepository extends JpaRepository<AlternativeName, Integer> {}
