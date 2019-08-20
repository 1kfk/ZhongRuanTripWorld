package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dao.PlaceDao;
import com.example.model.Place;

@Controller
public class WZHPlaceController {

	@Autowired
	PlaceDao placeDao;

	// 从数据库获取信息，并将信息传送到jsp
//	@GetMapping("/destination")
//	public String selectAllPlaces(Model model) {
//
//		List<Place> places = placeDao.selectAllPlaces_DAO();
//		for (Place place: places) {
//			// console观察
//			System.out.println(place);
//		}
//		// Model对象将信息传送到jsp
//		model.addAttribute("places", places);
//		return "destination";
//	}
	
	@GetMapping("/destination")
	public String selectAllPlaces(@RequestParam("place") String province,  Model model) {
		List<Place> places=null;
		if(province.equals("all")) { 
			 places = placeDao.selectAllPlaces_DAO();
		}else {
			places = placeDao.selectByProvince_Dao(province);
		}
		// Model对象将信息传送到jsp
		model.addAttribute("places", places);
		return "destination";
	}

}
