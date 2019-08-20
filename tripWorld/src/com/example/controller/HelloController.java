package com.example.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {
	
	@ModelAttribute
	public void msgAttr(Model model) {
		model.addAttribute("msg", "this is 一条消息");
		model.addAttribute("date", new Date());
	}
	
	@GetMapping("/hello")
	public String hello() {
		//model.addAttribute("msg", "this is a message");
		return "login";
	}
	
	@GetMapping("/world")
	public String welcome() {
		//model.addAttribute("msg", "this is a message");
		return "index";
	}
	
	
	@GetMapping("/hi/{name}")
	public String hi(@PathVariable("name") String name, Model model) {
		
		model.addAttribute("welcome", "hi " + name );
		return "hello";
		
	}
	
}
