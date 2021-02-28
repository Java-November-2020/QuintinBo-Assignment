package com.quintinbowman.Relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quintinbowman.Relationships.models.License;
import com.quintinbowman.Relationships.models.Person;
import com.quintinbowman.Relationships.services.LicenseService;
import com.quintinbowman.Relationships.services.PersonService;

@Controller
public class BaseController {

	@Autowired
	private PersonService pService;
	
	@Autowired
	private LicenseService lService;
	
	@GetMapping("/person/new")
	public String newPerson(@ModelAttribute("person")Person person) {
		return "newPerson.jsp";
	}
	
	@PostMapping("/person/new")
	public String addPerson(@Valid @ModelAttribute("person")Person person, BindingResult result){
		if(result.hasErrors() ) {
			return "newPerson.jsp";
		}
		this.pService.createPerson(person);
		return "redirect:/license/new";
	}
	
	@GetMapping("/license/new")
	public String newLicense(@ModelAttribute("license")License license, Model viewModel) {
		viewModel.addAttribute("person", this.pService.getAllPerson());
		return "newLicense.jsp";
	}	

	@PostMapping("/license/new")
		public String addLicense(@Valid @ModelAttribute("license")License license, BindingResult result, Model viewModel){
		Long personid = license.getPerson().getId();
		if(result.hasErrors()) {
			viewModel.addAttribute("person", this.pService.getAllPerson());
			return "newLicense.jsp";
		}
		this.lService.createLicense(license);
		return "redirect:/person/" + personid;
	}
	
	@GetMapping("/person/{id}")
	public String showLicense(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("person", this.pService.getOnePerson(id));
		return "show.jsp";
	}
	
}