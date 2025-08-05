package com.gamelist.domain.repository.release_date;

import com.gamelist.domain.models.release_date.ReleaseDateStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseDateStatusRepository extends JpaRepository<ReleaseDateStatus, Integer> {}
