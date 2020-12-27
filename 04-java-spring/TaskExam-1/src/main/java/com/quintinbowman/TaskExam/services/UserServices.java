	package com.quintinbowman.TaskExam.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quintinbowman.TaskExam.models.User;
import com.quintinbowman.TaskExam.repositories.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository uRepo;
	
	// Registers the User
	public User registerUser(User user) {
		// Makes the hash
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		// Place the hash on the password
		user.setPassword(hash);
		// Save new password and user to database
		return this.uRepo.save(user);
	}
	
	// Login existing User
	public boolean authenticateUser(String email, String password) {
		// Make sure the person logging in is who they say they are
		// Step 1. try and query user by email
		User user = this.uRepo.findByEmail(email);
		if(user == null) {
			return false;
		}
		
		// Step 2. check email against database user email
		return BCrypt.checkpw(password, user.getPassword());
 	}
	
	public User getById(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
	public User getByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
}
