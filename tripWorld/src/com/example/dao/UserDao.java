package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.User;

@Component
public class UserDao {
	@Autowired
	private GetSession getsession;
	
	public void insertNewUser(User user) {
		getsession.getsession().insert("com.example.mapper.SmallUserMapper.insertNewUser", user);
	}
	public User selectUserByUsername(String username) {
		return getsession.getsession().selectOne("com.example.mapper.SmallUserMapper.selectUserByUsername", username);
	}
	public List<User> selectalluser(int i) {
		return getsession.getsession().selectList("com.example.mapper.SmallUserMapper.selectalluser",i);
	}
	public int deleteuser(String username) {
		SqlSession s = getsession.getsession();
		 int i=s.delete("com.example.mapper.SmallUserMapper.deleteuser", username);
		 s.rollback();
		 s.close();
		 return i;
	}
	public int selectusernum() {
		return getsession.getsession().selectOne("com.example.mapper.SmallUserMapper.selectusernum");
	}
	public int update(User user) {
		return getsession.getsession().update("com.example.mapper.SmallUserMapper.updateuser", user);
	}
}
