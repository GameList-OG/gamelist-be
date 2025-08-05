package com.gamelist.domain.repository.platform;

import com.gamelist.domain.models.platform.PlatformVersionReleaseDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformVersionReleaseDateRepository extends JpaRepository<PlatformVersionReleaseDate, Integer> {}
