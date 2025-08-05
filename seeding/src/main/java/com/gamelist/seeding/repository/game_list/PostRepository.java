package com.gamelist.seeding.repository.game_list;

import com.gamelist.seeding.entity.game_list.Post;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("SELECT p FROM posts p LEFT JOIN FETCH p.likes l WHERE p.id = :postId")
    Optional<Post> findPostWithLikesById(@Param("postId") Long postId);
}
