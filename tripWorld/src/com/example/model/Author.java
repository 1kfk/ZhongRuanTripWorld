package com.example.model;

import java.io.Serializable;

public class Author  implements Serializable {
	int id;
	String name;
	String password;
	String email;
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	

}
