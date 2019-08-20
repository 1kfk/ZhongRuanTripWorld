package com.example.model;

import java.io.Serializable;

public class Place implements Serializable {

	int id;
	String province; // ����ʡ
	String location; // �������λ��
	String assess; // ����
	String scene; // ͼƬ
	int price_low; // ��ͼ�
	int price_high; // ��߼�

	@Override
	public String toString() {
		return "Place [id=" + id + ", location=" + location + ", assess=" + assess + ", scene=" + scene + ", price_low="
				+ price_low + ", price_high=" + price_high + "]";
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAssess() {
		return assess;
	}

	public void setAssess(String assess) {
		this.assess = assess;
	}

	public String getScene() {
		return scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}

	public int getPrice_low() {
		return price_low;
	}

	public void setPrice_low(int price_low) {
		this.price_low = price_low;
	}

	public int getPrice_high() {
		return price_high;
	}

	public void setPrice_high(int price_high) {
		this.price_high = price_high;
	}

}
