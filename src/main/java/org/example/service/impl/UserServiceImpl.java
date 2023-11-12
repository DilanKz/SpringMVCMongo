package org.example.service.impl;

import org.example.model.User;
import org.example.repo.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * `@authority Tharindu Dilan`
 * 10:52 AM
 * 2023-11-12 - 11 - 2023
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
    @Override
    public User find(String id) {
        return userRepository.findById(id).get();
    }

}
