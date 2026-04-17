package com.ecommerce.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.backend.entity.User;
import com.ecommerce.backend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Login
    public User loginUser(String email, String password) {

        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();

            if (user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
