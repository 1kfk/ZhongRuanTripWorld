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

	// �����ݿ��ȡ��Ϣ��������Ϣ���͵�jsp
//	@GetMapping("/destination")
//	public String selectAllPlaces(Model model) {
//
//		List<Place> places = placeDao.selectAllPlaces_DAO();
//		for (Place place: places) {
//			// console�۲�
//			System.out.println(place);
//		}
//		// Model������Ϣ���͵�jsp
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
		// Model������Ϣ���͵�jsp
		model.addAttribute("places", places);
		return "destination";
	}

}
