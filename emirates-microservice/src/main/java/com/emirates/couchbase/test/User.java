package com.emirates.couchbase.test;

public class User {

	private String firtName;
	private String lastName;
	private String email;
	
	public User(String firstName, String lastName, String email) {
		this.firtName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [firtName=" + firtName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
}
