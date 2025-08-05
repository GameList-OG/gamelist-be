package com.gamelist.domain.repository.platform;

import com.gamelist.domain.models.platform.PlatformFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformFamilyRepository extends JpaRepository<PlatformFamily, Integer> {}
