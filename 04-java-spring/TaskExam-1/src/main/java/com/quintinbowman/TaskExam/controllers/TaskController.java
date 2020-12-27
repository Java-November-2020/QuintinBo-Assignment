package com.quintinbowman.TaskExam.controllers;

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

import com.quintinbowman.TaskExam.models.Task;
import com.quintinbowman.TaskExam.models.User;
import com.quintinbowman.TaskExam.services.TaskServices;
import com.quintinbowman.TaskExam.services.UserServices;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	private TaskServices tService;
	@Autowired
	private UserServices uService;

	
	@GetMapping("")
	private String home(Model viewmodel, HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		Long userId = (Long)session.getAttribute("user_id");
		viewmodel.addAttribute("user", this.uService.getById(userId));
		viewmodel.addAttribute("task", this.tService.getTasks());
		return "tasks.jsp";
	}
	
	@GetMapping("/create")
	public String newTask(@ModelAttribute("task")Task task) {
		return "create.jsp";
	}
	
	@PostMapping("/create")
	public String newTask(@Valid@ModelAttribute("task")Task task, BindingResult results, HttpSession session) {
		if(results.hasErrors()) {
			return "create.jsp";
		}
		Long userID = (Long) session.getAttribute("user_id");
		User createdTask = this.uService.getById(userID);
		task.setTaskCreator(createdTask);
		this.tService.create(task);  
		return "redirect:/tasks";
	}
	
	@GetMapping("{taskId}")
	public String display(@PathVariable("taskId") Long id, Model viewModel ) {
		viewModel.addAttribute("task", this.tService.getById(id));
		return "task.jsp";
	}
}
