package com.gamelist.seeding.repository;

import com.gamelist.seeding.old.Platform;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlatformRepository extends JpaRepository<Platform, Long> {

    @Query("SELECT name FROM platforms")
    List<String> getAllNames();

    @Query("SELECT p FROM platforms p WHERE p.name = ?1")
    Platform findByName(String platformName);
}
