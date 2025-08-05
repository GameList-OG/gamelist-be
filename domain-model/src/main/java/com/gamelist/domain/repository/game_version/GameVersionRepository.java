package com.gamelist.domain.repository.game_version;

import com.gamelist.domain.models.game_version.GameVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameVersionRepository extends JpaRepository<GameVersion, Integer> {}
