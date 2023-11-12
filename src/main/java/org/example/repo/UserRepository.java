package org.example.repo;

import org.example.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * `@authority Tharindu Dilan`
 * 10:51 AM
 * 2023-11-12 - 11 - 2023
 */
public interface UserRepository extends MongoRepository<User, String> {
}