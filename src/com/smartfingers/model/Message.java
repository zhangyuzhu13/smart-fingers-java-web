package com.smartfingers.model;

import java.sql.Date;

public class Message {
	//����id
	private Integer id;
	//�û�-��� 
	private User user;
	//����ͼƬ·��
	private String message_image_path;
	//�������֣�������280�ַ�
	private String message_text;
	//����ʱ��
	private Date message_date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage_image_path() {
		return message_image_path;
	}
	public void setMessage_image_path(String message_image_path) {
		this.message_image_path = message_image_path;
	}
	public String getMessage_text() {
		return message_text;
	}
	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}
	public Date getMessage_date() {
		return message_date;
	}
	public void setMessage_date(Date message_date) {
		this.message_date = message_date;
	}
	
	
}
