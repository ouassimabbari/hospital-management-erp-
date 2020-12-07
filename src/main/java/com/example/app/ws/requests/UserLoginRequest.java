package com.example.app.ws.requests;

public class UserLoginRequest {

	private String emailString;
	
	private String password;
	
	public String getEmail() {
		return emailString;
	}
	public void setEmail(String emailString) {
		this.emailString = emailString;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
