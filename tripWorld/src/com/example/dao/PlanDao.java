package com.example.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Blog;
import com.example.model.Place;
import com.example.model.Plan;

@Component
public class PlanDao implements Serializable{

	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	
	// 查询全部信息
	public List<Plan> selectAllPlaces_DAO() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			List<Plan> plan = session.selectList("com.example.mapper.PlanMapper.selectAllPlace");
			return plan;
		} catch (Exception e) {
			e.printStackTrace(); 
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	// 依靠province查询全部信息
		public List<Plan> selectByProvince_Dao(int place_id) {
			SqlSession session = null;
			try {
				session = sqlSessionFactory.openSession();
				List<Plan> plan = session.selectList("com.example.mapper.PlanMapper.selectByProvince",place_id);
				return plan;
			} catch (Exception e) {
				e.printStackTrace(); 
				return null;
			} finally {
				if (session != null) {
					session.close();
				}
			}
		}
	
}
