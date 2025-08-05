package com.gamelist.domain.repository.character;

import com.gamelist.domain.models.characters.CharacterSpecie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterSpecieRepository extends JpaRepository<CharacterSpecie, Integer> {}
