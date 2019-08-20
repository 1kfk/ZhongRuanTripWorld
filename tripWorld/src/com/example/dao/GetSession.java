package com.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GetSession {
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	private SqlSession session = null;
	public SqlSession getsession() {
		session = sqlSessionFactory.openSession();
		return session;
	}
//	public void closesession(SqlSession s,int i) {
//		if(i>0) {
//			s.commit();
//		}else {
//			s.rollback();
//		}
//		s.close();
//	}
}
