package com.in28minutes.basicAuth.entity;

public class AuthenticationBean {

	private String message;

	public AuthenticationBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=" + message + "]", message);
	}
	
	
}
