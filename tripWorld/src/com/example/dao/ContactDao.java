package com.example.dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Contact;

@Component
public class ContactDao {

	@Autowired
	SqlSessionFactory sqlSessionFactory;

	//插入一条信息
	public void insertOneContact_DAO(Contact contact) {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			int i = session.insert("com.example.mapper.ContactMapper.insertOneContact",contact);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}
