package com.logan.evaluation_java.repository;

import com.logan.evaluation_java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
