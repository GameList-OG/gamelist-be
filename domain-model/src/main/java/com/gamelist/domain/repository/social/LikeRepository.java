package com.gamelist.domain.repository.social;

import com.gamelist.domain.models.social.LikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<LikeEntity, Long> {}
