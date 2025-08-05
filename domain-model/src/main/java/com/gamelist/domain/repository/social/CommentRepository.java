package com.gamelist.domain.repository.social;

import com.gamelist.domain.models.social.Comment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByInteractiveEntityId(Long interactiveEntityId);
}
