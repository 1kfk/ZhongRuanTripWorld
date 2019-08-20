package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Message;
import com.example.dao.PlaceDao;
import com.example.dao.UserDao;

@Service
public class HouTaiService {

	@Autowired
	UserDao userdao;
	@Autowired
	PlaceDao placedao;
	
	public Message deleteuser(String username) {
		Message msg= new Message();
		int i=userdao.deleteuser(username);
		if(i==1) {
			msg.setNum(1);
			msg.setMsg("É¾³ý³É¹¦");
		}else {
			msg.setNum(1);
			msg.setMsg("É¾³ýÊ§°Ü");
		}
		return msg;
	}
	public Message deleteplace(String place) {
		Message msg= new Message();
		int i=placedao.deleteplace(place);
		if(i==1) {
			msg.setNum(1);
			msg.setMsg("É¾³ý³É¹¦");
		}else {
			msg.setNum(1);
			msg.setMsg("É¾³ýÊ§°Ü");
		}
		return msg;
	}
}
