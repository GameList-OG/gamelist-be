package com.gamelist.domain.repository.company;

import com.gamelist.domain.models.company.CompanyWebsite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyWebsiteRepository extends JpaRepository<CompanyWebsite, Integer> {}
