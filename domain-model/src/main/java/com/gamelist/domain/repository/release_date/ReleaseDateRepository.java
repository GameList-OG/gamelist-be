package com.gamelist.domain.repository.release_date;

import com.gamelist.domain.models.release_date.ReleaseDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseDateRepository extends JpaRepository<ReleaseDate, Integer> {}
