package com.yash.oas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * @author ankesh.patil
 */
/*
 * Model Class for user
 */

@Entity
public class User {

	@Column(name = "user_name")
	private String name;

	@Id
	@Column(name = "user_email")
	private String email;

	@Column(name = "user_password")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
