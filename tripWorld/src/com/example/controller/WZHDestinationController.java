package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.model.User;

@Controller
@SessionAttributes("bigu")
public class WZHDestinationController {

	
	@GetMapping("/pricing")
	public String pricing(ModelMap map) {
		User u = (User)map.get("bigu");
		if(u==null) {
			return "redirect:/login";
		}else {
			return "pricing";
		}
	}
}
