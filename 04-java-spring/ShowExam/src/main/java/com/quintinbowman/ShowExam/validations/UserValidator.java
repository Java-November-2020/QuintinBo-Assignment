package com.quintinbowman.ShowExam.validations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.quintinbowman.ShowExam.models.User;
import com.quintinbowman.ShowExam.repositories.UserRepository;



@Component
//checks the authenticity of certain parameters
public class UserValidator {
	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate (Object target, Errors errors) {
		User user = (User) target;
	
	//checks the password
	if(!user.getPassword().equals(user.getConfirmPassword())) {
		errors.rejectValue("password", "Match", "You do not know the way, try again!!!");
		}
		//checks the email
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Nice try, but you've already been here.");
		} 
	}
}
