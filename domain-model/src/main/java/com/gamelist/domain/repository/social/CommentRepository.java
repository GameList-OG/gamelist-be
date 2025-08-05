package com.gamelist.domain.repository.social;

import com.gamelist.domain.models.social.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByInteractiveEntityId(Long interactiveEntityId);
}
