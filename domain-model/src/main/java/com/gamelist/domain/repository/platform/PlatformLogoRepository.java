package com.gamelist.domain.repository.platform;

import com.gamelist.domain.models.platform.PlatformLogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformLogoRepository extends JpaRepository<PlatformLogo, Integer> {}
