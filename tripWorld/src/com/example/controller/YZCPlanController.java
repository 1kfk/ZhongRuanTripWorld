package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.dao.PlanDao;
import com.example.model.Plan;
import com.example.model.User;

@Controller
@SessionAttributes("bigu")
public class YZCPlanController {

	@Autowired
	PlanDao planDao;

	
	
	@GetMapping("/pricings")
	public String selectAllPlans(@RequestParam("place_id") int place_id,  Model model ,ModelMap map) {
		User u = (User)map.get("bigu");
		if(u==null) {
			return "redirect:/login";
		}else {
			List<Plan> plans = planDao.selectByProvince_Dao(place_id);
			for (Plan plan: plans) {
				// console观察
				System.out.println(plan);
			}
			// Model对象将信息传送到jsp
			model.addAttribute("plans", plans);
			
			return "pricing";
		}
	}

}
