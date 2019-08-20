package com.example.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.dao.BlogDao;
import com.example.model.Blog;

import org.apache.ibatis.session.SqlSession;

@Controller
public class BlogController implements Serializable {

	@Autowired
	BlogDao blogDao;
	
	@GetMapping("/blogs/{id}")
	public void selectOneBlog(@PathVariable int id) {
		
		Blog blog = blogDao.selectOneBlog(1);
		System.out.println(blog);
		
	}
	@GetMapping("/lvyou")
	public String selectOneBlog() {
		return "indexs";
	}
	
	@GetMapping("/blogs")
	public void selectAllBlogs() {
		
		List<Blog> blogs = blogDao.selectAllBlogs();
		for(Blog b: blogs) {
			System.out.println(b);
		}

	}
	
	@GetMapping("/addblog")
	public void addOne(@PathVariable int id) {
		
	}
	
}
