package com.gamelist.domain.repository.website;

import com.gamelist.domain.models.website.WebsiteType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsiteTypeRepository extends JpaRepository<WebsiteType, Integer> {}
