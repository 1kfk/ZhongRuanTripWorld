package com.example.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.dao.PiaoDao;
import com.example.model.Piao;
import com.example.model.User;

@Controller
@SessionAttributes("bigu")
public class WZQGoupiaoController {
	@Autowired
	PiaoDao piaodao;
	

	@RequestMapping(value="goupiao")
	public String goupiao(ModelMap map) {
		User u = (User)map.get("bigu");
		if(u==null) {
			return "redirect:/login";
		}else {
			return "goupiao";
		}
	}

	@RequestMapping("/contact")
	public String contact(Piao piao,String atshen,String atshi,String goshen,String goshi, ModelMap map) throws ParseException {
		User u = (User)map.get("bigu");
		if(u==null) {
			return "redirect:/login";
		}else {
			System.out.println(atshi);
			DateFormat bf = new SimpleDateFormat("yyyy-MM-dd");//∂‡Ã¨
	        String format = bf.format(piao.getTime());
	        piao.setTime(bf.parse(format));
	        String at = atshen+atshi;
	        String go = goshen+goshi;
	        piao.setAt(at);
	        piao.setGo(go);
	        piao.setUser_id(u.getId());
			System.out.println(piao.toString());
			piaodao.insert(piao);
			return "contact";
		}
	}
}
