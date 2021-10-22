package com.ctseducare.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.apirest.model.Task;
import com.ctseducare.apirest.repository.TaskRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name="Task Endpoint", description="")
public class TaskController {
  
  @Autowired
  TaskRepository repository;
  
  @GetMapping("/status")
  public String status() {
    return "I am OK";
  }
  
  @PostMapping("/tasks")
  @Operation(summary="Insert a new task")
  public ResponseEntity<Task> save(@RequestBody Task task) {
    repository.save(task);
    return ResponseEntity.ok(task);
  }
  
  @GetMapping("/tasks")
  @Operation(summary="List all tasks")
  public ResponseEntity<List<Task>> findAll() {
    return ResponseEntity.ok(repository.findAll()); 
  }
  
  @PutMapping("/tasks")
  @Operation(summary="Update task data")
  public ResponseEntity<Task> update(@RequestBody Task task) {
    repository.save(task);
    return ResponseEntity.ok(task);
  }
  
  @DeleteMapping("/tasks/{id}")
  @Operation(summary="Delete a specific task")
  public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
    repository.deleteById(id);
    return ResponseEntity.ok("Item removed successful!");
  }

}