package com.quintinbowman.Relationships.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Licenses")
public class License {
	 	public License() {
		
	}
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@Future
		@DateTimeFormat(pattern = "MM-dd-yyyy")
	    private Date expiration_date;
	   
		@Size(min = 2, max = 2)
	    private String state;
	    
	    @Column(updatable=false)
	    @DateTimeFormat(pattern = "yyyy-MM-DD:mm:ss")
	    private Date createdAt;
	    
	    @DateTimeFormat(pattern = "yyyy-MM-DD:mm:ss")
	    private Date updatedAt;
	    
	    @OneToOne(fetch=FetchType.LAZY)
	    @JoinColumn(name="persons_id")
	    private Person person;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		public Date getExpiration_date() {
			return expiration_date;
		}
		public void setExpiration_date(Date expiration_date) {
			this.expiration_date = expiration_date;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
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
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
	    
	    
}
