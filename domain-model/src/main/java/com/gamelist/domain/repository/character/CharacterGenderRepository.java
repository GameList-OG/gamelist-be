package com.gamelist.domain.repository.character;

import com.gamelist.domain.models.characters.CharacterGender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterGenderRepository extends JpaRepository<CharacterGender, Integer> {}
