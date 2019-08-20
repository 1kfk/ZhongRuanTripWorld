package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.dao.ContactDao;
import com.example.model.Contact;
import com.example.model.User;

@Controller
@SessionAttributes("bigu")
public class WZHContactController {

	@Autowired
	ContactDao contactDao;

	@RequestMapping("/con")
	public String contact(ModelMap map) {
		User u = (User) map.get("bigu");
		if (u == null) {
			return "redirect:/login";
		} else {
			return "contact";
		}
	}



	@PostMapping("/contact2")
	public String addContact(ModelMap map, Contact contact) {
		User u = (User) map.get("bigu");
		contact.setUser_id(u.getId());
		contactDao.insertOneContact_DAO(contact);
		return "contact";
	}

}
