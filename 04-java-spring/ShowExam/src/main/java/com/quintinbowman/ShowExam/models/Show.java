package com.quintinbowman.ShowExam.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name="shows")
//The show model that's linked to the user model for the database
public class Show {
	public Show() {
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Primary key for the show model
	private long sId;
	@NotBlank
	@Size(max=40)
	private String show_Name;
	@NotBlank
	@Size(max=40)
	private String network;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	//Shows how this one show has been rated by many users linked by their id#
	private List<User> audience;

	public String getShow_Name() {
		return show_Name;
	}

	public void setShow_Name(String show_Name) {
		this.show_Name = show_Name;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public List<User> getAudience() {
		return audience;
	}

	public void setAudience(List<User> audience) {
		this.audience = audience;
	}

	public long getsId() {
		return sId;
	}

	public void setsId(long sId) {
		this.sId = sId;
	}

}