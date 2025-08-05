package com.gamelist.domain.repository.age_rating;

import com.gamelist.domain.models.age_rating.AgeRatingCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgeRatingCategoryRepository extends JpaRepository<AgeRatingCategory, Integer> {}
