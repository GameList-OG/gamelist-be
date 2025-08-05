package com.gamelist.domain.repository.event;

import com.gamelist.domain.models.event.EventLogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventLogoRepository extends JpaRepository<EventLogo, Integer> {}
