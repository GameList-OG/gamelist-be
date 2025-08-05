package com.gamelist.domain.repository.platform;

import com.gamelist.domain.models.platform.PlatformWebsite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformWebsiteRepository extends JpaRepository<PlatformWebsite, Integer> {}
