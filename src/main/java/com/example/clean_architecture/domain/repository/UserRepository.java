package com.example.clean_architecture.domain.repository;

import com.example.clean_architecture.domain.entity.User;
import java.util.Optional;

public interface UserRepository {

  Optional<User> findById(Long id);
}
