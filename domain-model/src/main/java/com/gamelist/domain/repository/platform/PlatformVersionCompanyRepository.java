package com.gamelist.domain.repository.platform;

import com.gamelist.domain.models.platform.PlatformVersionCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformVersionCompanyRepository extends JpaRepository<PlatformVersionCompany, Integer> {}
