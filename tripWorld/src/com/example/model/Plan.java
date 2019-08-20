package com.example.model;

import java.io.Serializable;

public class Plan implements Serializable {
	int id;
	String place;
	int place_price;
	String play_time;
	int place_id;
	String hotel;
	int hotel_price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPlace_price() {
		return place_price;
	}
	public void setPlace_price(int place_price) {
		this.place_price = place_price;
	}
	
	public String getPlay_time() {
		return play_time;
	}
	public void setPlay_time(String play_time) {
		this.play_time = play_time;
	}
	public int getPlace_id() {
		return place_id;
	}
	public void setPlace_id(int place_id) {
		this.place_id = place_id;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getHotel_price() {
		return hotel_price;
	}
	public void setHotel_price(int hotel_price) {
		this.hotel_price = hotel_price;
	}
	
}
