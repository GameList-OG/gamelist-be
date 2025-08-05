package com.gamelist.domain.repository.company;

import com.gamelist.domain.models.company.CompanyLogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyLogoRepository extends JpaRepository<CompanyLogo, Integer> {}
