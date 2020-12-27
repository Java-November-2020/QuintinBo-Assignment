	package com.quintinbowman.TaskExam.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	public User() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Primary key for the user model
	private long id;
	@NotBlank
	@Size(max=60)
	private String user_Name;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	@Size(min=8)
	private String password;
	@Transient
	// Doesn't show in the Database but validates the password
	private String confirmPassword;
	
	@OneToMany(mappedBy="taskCreator", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Task> task;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public List<Task> getTask() {
		return task;
	}
	public void setTask(List<Task> task) {
		this.task = task;
	}

}
