package com.example.model;

import java.io.Serializable;

public class Contact implements Serializable {

	private int id;
	private String name;
	private String gowhere;
	private String emotion;
	private String talking;
	private int user_id;

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", gowhere=" + gowhere + ", emotion=" + emotion + ", talking="
				+ talking + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGowhere() {
		return gowhere;
	}

	public void setGowhere(String gowhere) {
		this.gowhere = gowhere;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public String getTalking() {
		return talking;
	}

	public void setTalking(String talking) {
		this.talking = talking;
	}

}
