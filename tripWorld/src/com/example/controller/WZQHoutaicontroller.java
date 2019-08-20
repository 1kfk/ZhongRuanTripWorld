package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.example.dao.PlaceDao;
import com.example.dao.UserDao;
import com.example.model.Place;
import com.example.model.User;
import com.example.service.HouTaiService;

@Controller
public class WZQHoutaicontroller {
	@Autowired
	UserDao userdao;
	@Autowired
	PlaceDao placedao;
	@Autowired
	HouTaiService houtaiservice;
	
	@RequestMapping(value="/allusermation")
	public String userlist(Model model,@RequestParam(value="ubegin",defaultValue = "0") int ubegin,
			@RequestParam(value="pbegin",defaultValue = "0") int pbegin) throws JSONException{
		model.addAttribute("users", userdao.selectalluser(ubegin));
		int n = userdao.selectusernum();
		if(n%20>0) {
			model.addAttribute("num", userdao.selectusernum()/20+1);
		}else {
			model.addAttribute("num", userdao.selectusernum()/20);
		}
		int pn = placedao.selectnum();
		if(pn%10>0) {
			model.addAttribute("pn", placedao.selectnum()/10+1);
		}else {
			model.addAttribute("pn", placedao.selectnum()/10);
		}
		model.addAttribute("places", placedao.selectlimit(pbegin));
//		User user = new User();
//		for(int i=1;i<11;i++) {
//			user.setId(i);
//			user.setUsername(""+i);
//			user.setPassword("111111");
//			user.setEmail("111@qq.com");
//			userdao.insertNewUser(user);
//		}
		return "houtai";
	}
	
	@RequestMapping(value="/deleteuser",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String deleteuser(HttpServletRequest request) throws JSONException {
		String username =request.getParameter("username");
		JSONObject j =new JSONObject(houtaiservice.deleteuser(username));
		return j.toString();
	}
	@RequestMapping(value="/deleteplace",method=RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String deleteplace(HttpServletRequest request) {
		String place =request.getParameter("placename");
		JSONObject j =new JSONObject(houtaiservice.deleteplace(place));
		return j.toString();
	}
	 @RequestMapping(value="fileUpload",method = RequestMethod.POST)
	    public String  fileUpload2(HttpServletRequest request,@RequestParam("filedata") CommonsMultipartFile file) throws IOException {
	        System.out.println("fileName："+file.getOriginalFilename());
	        String path=request.getSession().getServletContext().getRealPath("/") + "scene/"  
                    + file.getOriginalFilename();  
	         
	        File newFile=new File(path);
	        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
	        file.transferTo(newFile);
	        return "redirect:/allusermation"; 
	    }
	@RequestMapping(value="/changeuser")
	public String changeuser(User user) {
		userdao.update(user);
		return "redirect:/allusermation";
	}
	@RequestMapping(value="/changeplace")
	public String changeplace(Place place) {
		placedao.update(place);
		return "redirect:/allusermation";
	}
	@RequestMapping(value="addplace",method = RequestMethod.POST)
	public String addplace(Place place) {
		placedao.insertplace(place);
		return "redirect:/allusermation";
	}
}
