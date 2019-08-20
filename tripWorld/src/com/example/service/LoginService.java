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
			msg.setMsg("���û����ѱ�ע��");
		}else {
			msg.setNum(1);
			msg.setMsg("ע��ɹ�");
			userDao.insertNewUser(user);
		}
		return msg;
	}
	public Message login(User user) {
		Message msg = new Message();
		User u = userDao.selectUserByUsername(user.getUsername());
		if(u==null) {
			msg.setNum(-1);
			msg.setMsg("�����ڸ��û�");
		}else if(!user.getPassword().equals(u.getPassword())) {
			msg.setNum(0);
			msg.setMsg("�����������");
		}else {
			msg.setNum(1);
			msg.setMsg("��¼�ɹ�");
		}
		return msg;
	}
	public User getuser(User user) {
		User u = userDao.selectUserByUsername(user.getUsername());
		return u;
	}
}
