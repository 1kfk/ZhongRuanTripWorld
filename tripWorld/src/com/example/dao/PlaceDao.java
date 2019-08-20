package com.example.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Blog;
import com.example.model.Place;

@Component
public class PlaceDao implements Serializable{

	@Autowired
	SqlSessionFactory sqlSessionFactory;
	@Autowired
	private GetSession getsession;
	
	// 查询全部信息
	public List<Place> selectAllPlaces_DAO() {
		SqlSession session = null; 
		try {
			session = sqlSessionFactory.openSession();
			List<Place> places = session.selectList("com.example.mapper.PlaceMapper.selectAllPlace");
			return places;
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
		public List<Place> selectByProvince_Dao(String province) {
			SqlSession session = null;
			try {
				session = sqlSessionFactory.openSession();
				List<Place> places = session.selectList("com.example.mapper.PlaceMapper.selectProvinceLike",province);
				return places;
			} catch (Exception e) {
				e.printStackTrace(); 
				return null;
			} finally {
				if (session != null) {
					session.close();
				}
			}
		}
	public List<Place> selectlimit(int i){
		return getsession.getsession().selectList("com.example.mapper.PlaceMapper.selectplacelimit",i);
	}
	public int selectnum() {
		return getsession.getsession().selectOne("com.example.mapper.PlaceMapper.selectplacenum");
	}
	public int deleteplace(String placename) {
		return getsession.getsession().delete("com.example.mapper.PlaceMapper.deleteone",placename);
	}
	public int update(Place place) {
		return getsession.getsession().update("com.example.mapper.PlaceMapper.updateone",place);
	}
	public int insertpic(Place p) {
		return getsession.getsession().update("com.example.mapper.PlaceMapper.updatepic", p);
	}
	public int insertplace(Place p) {
		return getsession.getsession().insert("com.example.mapper.PlaceMapper.insertplace", p);
	}
}
