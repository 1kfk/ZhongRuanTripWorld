package com.example.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Employee;

@Controller
public class EmployeeController {

	@ModelAttribute("employee")
	public Employee setupEmployee() {
		return new Employee();
	}

	@GetMapping("/employee")
	public String employee() {
		
		return "employee";
	}
		
	@PostMapping("/employee")
	public String addEmployee(@Valid Employee employee, 
			BindingResult br) {
		
		if(br.hasErrors()) {
			return "employee";
		}
		
		return "hello";
		
	}
	
}
