package com.gamelist.domain.repository.website;

import com.gamelist.domain.models.website.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsiteRepository extends JpaRepository<Website, Integer> {}
