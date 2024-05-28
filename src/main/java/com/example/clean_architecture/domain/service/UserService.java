package com.example.clean_architecture.domain.service;

import com.example.clean_architecture.domain.entity.User;
import com.example.clean_architecture.domain.repository.UserRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return  user.get();
    }
}
