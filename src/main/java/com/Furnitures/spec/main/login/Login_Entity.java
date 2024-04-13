package com.Furnitures.spec.main.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login_Entity {
	@Id
	private String email;
	private String Password;
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Login_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login_Entity(String email, String password) {
		super();
		this.email = email;
		Password = password;
	}
	

}
