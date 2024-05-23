package com.example.clean_architecture.repository;

import com.example.clean_architecture.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends CrudRepository<User, Long> {

}
