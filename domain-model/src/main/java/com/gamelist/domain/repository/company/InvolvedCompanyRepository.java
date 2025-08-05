package com.gamelist.domain.repository.company;

import com.gamelist.domain.models.company.InvolvedCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvolvedCompanyRepository extends JpaRepository<InvolvedCompany, Integer> {}
