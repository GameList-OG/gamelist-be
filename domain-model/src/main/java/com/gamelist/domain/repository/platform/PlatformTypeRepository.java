package com.gamelist.domain.repository.platform;

import com.gamelist.domain.models.platform.PlatformType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformTypeRepository extends JpaRepository<PlatformType, Integer> {}
