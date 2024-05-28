package com.example.clean_architecture.infra;

import com.example.clean_architecture.domain.entity.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface SpringDataUserRepository extends CrudRepository<User, Long> {
  Optional<User> findByID(Long id);
}
