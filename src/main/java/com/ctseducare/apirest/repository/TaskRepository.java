package com.ctseducare.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctseducare.apirest.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}