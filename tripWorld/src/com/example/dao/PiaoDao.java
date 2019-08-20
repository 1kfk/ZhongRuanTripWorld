package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Piao;

@Component
public class PiaoDao {
	@Autowired
	private GetSession getsession;
	
	public List<Piao> selectByUser_id(Integer id){
		SqlSession session  = getsession.getsession();
		List<Piao> p = session.selectList("PiaoMapper.selectByUser_id", id);
		return p;
	}
	
	public void insert(Piao piao) {
		getsession.getsession().insert("PiaoMapper.insertpiao", piao);
	}
}
