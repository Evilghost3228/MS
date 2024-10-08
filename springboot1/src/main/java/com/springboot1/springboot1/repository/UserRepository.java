package com.springboot1.springboot1.repository;

import com.springboot1.springboot1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
