package com.quintinbowman.ShowExam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quintinbowman.ShowExam.models.Show;
import com.quintinbowman.ShowExam.repositories.ShowRepository;

@Service
public class ShowServices {
	@Autowired
	private ShowRepository sRepo;
	
	// Get All
	public List<Show> getShows(){
		return this.sRepo.findAll();
	}
	
	// Get Single
	public Show getById(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
	// Create
	public Show create(Show show) {
		return this.sRepo.save(show);
	}
	
	// Delete
	public void delete(Show show) {
		this.sRepo.delete(show);
	}
}
