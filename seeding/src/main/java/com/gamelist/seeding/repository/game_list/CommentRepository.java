package com.gamelist.seeding.repository.game_list;

import com.gamelist.seeding.entity.game_list.Comment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByInteractiveEntityId(Long interactiveEntityId);
}
