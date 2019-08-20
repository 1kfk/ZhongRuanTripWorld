package com.example.model;

import java.io.Serializable;
import java.util.Date;

public class Post  implements Serializable {
	int id;
	String content;
	int blog_id;
	Date post_time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public Date getPost_time() {
		return post_time;
	}
	public void setPost_time(Date post_time) {
		this.post_time = post_time;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", content=" + content  + ", post_time=" + post_time + "]";
	}
	
	
	
}
