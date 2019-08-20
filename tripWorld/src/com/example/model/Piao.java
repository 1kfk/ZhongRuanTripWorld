package com.example.model;

import java.util.Date;

public class Piao {
	private Integer id;
	private String name;
	private Integer user_id;
	private String idcard;
	private String at;
	private String go;
	private Date time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	public String getGo() {
		return go;
	}
	public void setGo(String go) {
		this.go = go;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Piao [id=" + id + ", name=" + name + ", user_id=" + user_id + ", idcard=" + idcard + ", at=" + at
				+ ", go=" + go + ", time=" + time + "]";
	}
}
