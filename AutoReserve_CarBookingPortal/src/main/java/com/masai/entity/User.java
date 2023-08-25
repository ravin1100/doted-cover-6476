package com.masai.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Id")
	private int userId;
	
	@Column(name = "Full_Name", length = 50, nullable = false)
	private String fullName;
	
	@Column(name = "User_Name", length = 50, nullable = false)
	private String userName;
	
	@Column(name = "Password", length = 50, nullable = false)
	private String password;
	
	@Column(name = "E-mail", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "Phone_Number", length = 50, nullable = false)
	private String phoneNumber;
	

	public User() {
		super();
	}

	public User(String fullName, String userName, String password, String email, String phoneNumber) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fullName=" + fullName + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
