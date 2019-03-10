package com.jalizadeh.basa.configuration.model;

import org.hibernate.validator.constraints.Length;

public class Credentials {
	
	@Length(max=4, min=1)
	private String authMethod;
	private String username;
	private String password;

	public String getAuthMethod() {
		return authMethod;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
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
}
