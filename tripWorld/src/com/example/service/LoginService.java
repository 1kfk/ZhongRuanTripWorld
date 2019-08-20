package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Message;
import com.example.dao.UserDao;
import com.example.model.User;

@Service
public class LoginService {
	@Autowired
	private UserDao userDao;
	
	public Message register(User user) {
		Message msg = new Message();
		if(userDao.selectUserByUsername(user.getUsername())!=null) {
			msg.setNum(0);
			msg.setMsg("该用户名已被注册");
		}else {
			msg.setNum(1);
			msg.setMsg("注册成功");
			userDao.insertNewUser(user);
		}
		return msg;
	}
	public Message login(User user) {
		Message msg = new Message();
		User u = userDao.selectUserByUsername(user.getUsername());
		if(u==null) {
			msg.setNum(-1);
			msg.setMsg("不存在该用户");
		}else if(!user.getPassword().equals(u.getPassword())) {
			msg.setNum(0);
			msg.setMsg("密码输入错误");
		}else {
			msg.setNum(1);
			msg.setMsg("登录成功");
		}
		return msg;
	}
	public User getuser(User user) {
		User u = userDao.selectUserByUsername(user.getUsername());
		return u;
	}
}
