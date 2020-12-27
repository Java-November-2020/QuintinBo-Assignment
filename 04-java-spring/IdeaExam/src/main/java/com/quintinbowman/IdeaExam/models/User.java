package com.quintinbowman.IdeaExam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
//Login page that creates a user or logs them in, talks to the UserRepository
public class User {
	public User() {
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Primary key for the user model
	private long id;
	@NotBlank
	@Size(max=20)
	private String firstName;
	@NotBlank
	@Size(max=20)
	private String lastName;
	@Email
	private String email;
	@Size(min=8)
	private String password;
	@Transient
	// Doesn't show in the Database but validates the password
	private String confirmPassword;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
}
