package org.example.service;

import org.example.model.User;

/**
 * `@authority Tharindu Dilan`
 * 10:52 AM
 * 2023-11-12 - 11 - 2023
 */
public interface UserService {
    void saveUser(User user);

    User find(String id);
}
