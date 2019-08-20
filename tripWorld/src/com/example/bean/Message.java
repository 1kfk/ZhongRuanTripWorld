package com.example.bean;

public class Message {
	private int num;
	private String msg;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Message [num=" + num + ", msg=" + msg + "]";
	}
}
