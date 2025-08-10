package com.logan.evaluation_java.repository;

import com.logan.evaluation_java.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}