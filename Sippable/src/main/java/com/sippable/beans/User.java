package com.sippable.beans;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.junit.experimental.theories.Theories;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName="session")
public class User implements Serializable{

	/**
	 * CLASSEXAMPLE
	 */
	private static final long serialVersionUID = 9075629692859076685L;
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@NotEmpty(message="Please enter a username")
	@Size(min=4, max=20)
	private String username;
	
	@NotEmpty
	private String password;

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
