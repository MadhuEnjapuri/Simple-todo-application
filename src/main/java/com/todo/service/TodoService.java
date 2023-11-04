package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.DTO.Todo;
import com.todo.repo.TodoRepo;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
	
	
	@Autowired
	private TodoRepo todorepo;
	
	
	public List<Todo> findByUsername(String username){
		return todorepo.findByUsername(username);
	}	
	
	public void addTodo(Todo todo) {
		todorepo.save(todo);
		}
	


	public Todo findById(int id) {
		
		return todorepo.findById(id).orElse(null);
	}

	public void updateTodo(@Valid Todo todo) {
		todorepo.save(todo);
	}

	public void deleteById(int id) {
		todorepo.deleteById(id);
	}
	
	
	
}