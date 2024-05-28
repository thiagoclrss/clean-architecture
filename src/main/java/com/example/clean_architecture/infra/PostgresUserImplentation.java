package com.example.clean_architecture.infra;

import com.example.clean_architecture.domain.entity.User;
import com.example.clean_architecture.domain.repository.UserRepository;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class PostgresUserImplentation implements UserRepository {

  private SpringDataUserRepository userRepository;

  public PostgresUserImplentation(SpringDataUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Optional<User> findById(Long id) {
    return userRepository.findByID(id);
  }
}

