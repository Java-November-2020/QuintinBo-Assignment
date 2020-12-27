package com.quintinbowman.ShowExam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.quintinbowman.ShowExam.models.User;
import com.quintinbowman.ShowExam.services.UserServices;
import com.quintinbowman.ShowExam.validations.UserValidator;


@Controller
//Send the views to the User
public class UserController {
	@Autowired
	private UserServices uService; 
	@Autowired
	private UserValidator validator;
	
	@GetMapping("/")
	//Home login/register page
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult results, HttpSession session) {
		//Checks to make sure all the inputs are valid
		validator.validate(user, results);
		if(results.hasErrors()) {
			return "index.jsp";
		}
		//Takes them to the show page after they register
		User newUser = this.uService.registerUser(user);
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/shows";
	}
	// Checks to see if the login credentials are correct
	@PostMapping("/login")
	public String login(@RequestParam("loginemail") String email, @RequestParam("loginpassword") String password, RedirectAttributes eMessage, HttpSession session) {
		if(!this.uService.authenticateUser(email, password)) {
			eMessage.addFlashAttribute("loginError", "Try again.");
			return "redirect:/";
		}
		User user = this.uService.getByEmail(email);
		session.setAttribute("user_id", user.getId());
		return "redirect:/shows";
	}
	// Logs the user out
	@GetMapping("/logout")
	public String logout(HttpSession session, RedirectAttributes redirectors) {
		session.invalidate();
		redirectors.addFlashAttribute("logout", "You successfully ended your session with us.");
		return "redirect:/index.jsp";
	}
}
