package com.gamelist.domain.repository.platform;

import com.gamelist.domain.models.platform.PlatformVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformVersionRepository extends JpaRepository<PlatformVersion, Integer> {}
