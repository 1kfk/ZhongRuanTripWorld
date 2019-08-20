package com.example.model;

import java.io.Serializable;
import java.util.List;

public class Blog implements Serializable {
	int id;
	String title;
	//int author_id;
	Author author;
	List<Post> posts;
	
	private String posts_toString() {
		StringBuffer sb = new StringBuffer();
		for(Post p: posts) {
			sb.append(p+"\n");
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + "\nauthor=" + author +
				"\nposts=" + posts_toString() + "]";
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
}
