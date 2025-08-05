package com.gamelist.domain.repository.langauge;

import com.gamelist.domain.models.langauge.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {}
