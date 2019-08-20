package com.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee implements Serializable {
	
	@NotNull
	@Min(0) 
	@Max(100)
	int age;
	
	@NotNull
	@Size(min=1, max=50)
	String name;
	
	@NotNull
	@Size(min=1, max=50)
	@Email
	String email;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date birth;

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
	
	//@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message="日期格式必须是yyyy-MM-dd")
	//@DateConstraint
	//String birth;
	
	
	
	

}
