package com.gamelist.domain.repository.company;

import com.gamelist.domain.models.company.CompanyStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyStatusRepository extends JpaRepository<CompanyStatus, Integer> {}
