package com.gamelist.domain.repository;

import com.gamelist.domain.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
