package com.sportsShoes.authentication;

import org.springframework.stereotype.Component;

@Component
public class UserAuthentication {
	
	private String username;
	private String password;
	public UserAuthentication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserAuthentication(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserAuthentication [username=" + username + ", password=" + password + "]";
	}
	
	

}
