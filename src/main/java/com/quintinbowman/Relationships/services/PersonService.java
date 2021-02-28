package com.quintinbowman.Relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quintinbowman.Relationships.models.Person;
import com.quintinbowman.Relationships.repositories.PersonRepository;

@Service
public class PersonService {

	private PersonRepository pRepo;
	
	public PersonService(PersonRepository repo) {
		this.pRepo = repo;
	}
	
	//Get All
	public List<Person> getAllPerson(){
		return this.pRepo.findAll();
	}
	
	//Get One
	public Person getOnePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	//Create One
	public Person createPerson(Person newPerson) {
		return this.pRepo.save(newPerson);
	}
	
	//Delete One
	public void deletePerson(Long id) {
		this.pRepo.deleteById(id);
	}
	
	//Update Person
	
}
