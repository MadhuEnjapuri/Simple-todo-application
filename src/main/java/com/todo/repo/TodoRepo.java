package com.todo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.DTO.Todo;

public interface TodoRepo extends JpaRepository<Todo, Integer> {

	public List<Todo> findByUsername(String username);
}
