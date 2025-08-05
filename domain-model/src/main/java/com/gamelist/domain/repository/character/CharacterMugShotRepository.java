package com.gamelist.domain.repository.character;

import com.gamelist.domain.models.characters.CharacterMugShot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterMugShotRepository extends JpaRepository<CharacterMugShot, Integer> {}
