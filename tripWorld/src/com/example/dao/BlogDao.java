package com.example.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Blog;

@Component
public class BlogDao implements Serializable {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	public Blog selectOneBlog(int id) {
		SqlSession session= null;
		try {
			session  = sqlSessionFactory.openSession();
			Blog blog = 
					(Blog) session.selectOne("com.example.m"
							+ "apper.BlogMapper.selectBlogAuthor", id);
			return blog;
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	}
	
	public List<Blog> selectAllBlogs() {
		SqlSession session= null;
		try {
			session  = sqlSessionFactory.openSession();
			List<Blog> blogs = 
					 session.selectList("com.example.m"
							+ "apper.BlogMapper.selectAllBlogs");
			return blogs;
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	}

}
