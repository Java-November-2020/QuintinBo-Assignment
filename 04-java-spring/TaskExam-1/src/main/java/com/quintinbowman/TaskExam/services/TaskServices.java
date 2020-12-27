package com.quintinbowman.TaskExam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quintinbowman.TaskExam.models.Task;
import com.quintinbowman.TaskExam.repositories.TaskRepository;
@Service
public class TaskServices {
	@Autowired
	private TaskRepository tRepo;
	
	// Get All
	public List<Task> getTasks(){
		return this.tRepo.findAll();
	}
	
	// Get Single
	public Task getById(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	
	// Create
	public Task create(Task task) {
		return this.tRepo.save(task);
	}
	
	// Delete
	public void delete(Task task) {
		this.tRepo.delete(task);
	}
}
