package com.quintinbowman.Relationships.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Persons")
public class Person {
	 	public Person() {
	
	}
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@Size(min = 5, max = 15)
	    private String firstName;
		
		@Size(min = 5, max = 15)
	    private String lastName;
		
	    @Column(updatable=false)
	    @DateTimeFormat(pattern = "yyyy-MM-DD:mm:ss")
	    private Date createdAt;
	    
	    @DateTimeFormat(pattern = "yyyy-MM-DD:mm:ss")
	    private Date updatedAt;
	    
	    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	    private License license;
	    
	    @PrePersist
	    protected void onCreate() {
	    	this.createdAt = new Date();
	    }
	    
	    @PreUpdate
	    protected void onUpdate() {
	    	this.updatedAt = new Date();
	    }
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
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
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public License getLicense() {
			return license;
		}
		public void setLicense(License license) {
			this.license = license;
		}
}
