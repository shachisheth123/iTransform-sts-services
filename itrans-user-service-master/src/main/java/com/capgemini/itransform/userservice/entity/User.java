package com.capgemini.itransform.userservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private String userName;
	private String name;
	private String email;
	private long contactNumber;
	private String password;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String name, String email, long contactNumber, String password) {
		super();
		this.userName = userName;
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
