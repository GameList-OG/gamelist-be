package com.gamelist.domain.repository.langauge;

import com.gamelist.domain.models.langauge.LanguageSupportType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageSupportTypeRepository extends JpaRepository<LanguageSupportType, Integer> {}
