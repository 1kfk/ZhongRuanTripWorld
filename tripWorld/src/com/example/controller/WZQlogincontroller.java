package com.example.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.bean.Message;
import com.example.dao.PiaoDao;
import com.example.model.User;
import com.example.service.LoginService;
@Controller
@SessionAttributes("bigu")
public class WZQlogincontroller {
	@Autowired
	private LoginService loginService;
	@Autowired
	PiaoDao piaodao;
	@RequestMapping(value="/login")
	public String login(Model model,ModelMap map) {
		model.addAttribute("result", map.get("result"));
		model.addAttribute("user", map.get("user"));
		User u = (User)map.get("bigu");
		if(u==null) {
			return "login";
		}else {
			System.out.println("sucsess");
			return "redirect:/destination?place=all";
		}
	}
	
	@RequestMapping(value="/zhuce")
	public String zhuce(Model model,ModelMap map) {
		model.addAttribute("result", map.get("result"));
		model.addAttribute("user", map.get("user"));
		User u = (User)map.get("bigu");
		if(u==null) {
			return "register";
		}else {
			return "redirect:/destination?place=all";
		}
	}
	@RequestMapping(value="/mymation",produces = {"application/json;charset=UTF-8"} )
	@ResponseBody
	public String mation(ModelMap map) throws JSONException {
		User u = (User)map.get("bigu");
		if(u!=null) {
		JSONObject j = new JSONObject();
		j.put("个人信息", u);
		j.put("票", piaodao.selectByUser_id(u.getId()));
		return j.toString();
		}else {
			return " . ";
		}
	}
//	@RequestMapping(value="/beginZhuce1")
//	public void zhuce(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("email") String email) {
//		System.out.println(username);
//		System.out.println(password);
//		System.out.println(email);
//	}
	@RequestMapping(value="/index")
	public String index(ModelMap map) {
		User u = (User)map.get("bigu");
		if(u==null) {
			return "redirect:/login";
		}else {
			return "redirect:/destination?place=all";
		}
	}
	@RequestMapping(value="/setout")
	public String out(SessionStatus s) {
		s.setComplete();
		return "redirect:/login";
	}
	
	@RequestMapping(value="/beginZhuce",method = RequestMethod.POST)
	public String zhuce(User user,Model model,RedirectAttributes attr) {
		Message msg = loginService.register(user);
		JSONObject j = new JSONObject(msg);
		JSONObject u = new JSONObject(user);
		attr.addFlashAttribute("result", j);
		attr.addFlashAttribute("user", u);
		if(msg.getNum()==1) {
			return "redirect:/login";
		}else {
			return "redirect:/zhuce";
		}
	}
	
	@RequestMapping(value="/beginLogin",method = RequestMethod.POST)
	public String login(User user,RedirectAttributes attr,Model model) {
		Message msg = loginService.login(user);
		User bu = loginService.getuser(user);
		JSONObject j = new JSONObject(msg);
		if(user.getUsername().equals("admin")&&user.getPassword().equals("888888")) {
			return "redirect:/allusermation";
		}
		if(bu!=null) {
		JSONObject u = new JSONObject(bu);
		attr.addFlashAttribute("user", u);
		}else {
			attr.addFlashAttribute("user", null);
		}
//		model.addAttribute("result", j);
//		model.addAttribute("user", u);
		attr.addFlashAttribute("result", j);
		if(msg.getNum()<=0) {
			return "redirect:/login";
//			return "login";
		}else {
			model.addAttribute("bigu",bu);
			return "redirect:/index";
		}
	}
}
