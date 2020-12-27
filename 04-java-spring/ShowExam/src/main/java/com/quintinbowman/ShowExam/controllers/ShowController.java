package com.quintinbowman.ShowExam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quintinbowman.ShowExam.models.Show;
import com.quintinbowman.ShowExam.models.User;
import com.quintinbowman.ShowExam.services.ShowServices;

@Controller
@RequestMapping("/shows")
public class ShowController {
	@Autowired
	private ShowServices sService;

	
	@GetMapping("")
	private String home(Model viewmodel) {
		return "shows.jsp";
	}
	
	@GetMapping("/new")
	public String newShow(@ModelAttribute("show")Show show) {
		return "new.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid@ModelAttribute("show")Show show, BindingResult results, HttpSession session) {
		if(results.hasErrors()) {
			return "new.jsp";
		}
		this.sService.create(show);  
		return "redirect:/shows";
	}
	
	@GetMapping("{sId}")
	public String display(@PathVariable("sId") Long id, Model viewModel ) {
		viewModel.addAttribute("show", this.sService.getById(id));
		return "show.jsp";
	}
	
	
}
