package com.gamelist.domain.repository.langauge;

import com.gamelist.domain.models.langauge.LanguageSupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageSupportRepository extends JpaRepository<LanguageSupport, Integer> {}
