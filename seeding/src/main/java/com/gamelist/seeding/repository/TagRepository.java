package com.gamelist.seeding.repository;

import com.gamelist.seeding.old.Tag;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TagRepository extends JpaRepository<Tag, Long> {

    @Query("SELECT name FROM tags")
    List<String> getAllNames();

    Tag findByName(String tagName);
}
