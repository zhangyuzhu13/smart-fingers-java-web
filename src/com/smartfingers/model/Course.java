package com.smartfingers.model;

public class Course {
	//�γ�id
	private int id;
	//�γ���
	private String course_name;
	//�γ��ܿ�ʱ
	private int course_amount;
	//�γ̽�ʦ
	private User teacher;
	//�γ̼۸�
	private int course_price;
	//�γ̴洢·��
	private String course_path;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse_amount() {
		return course_amount;
	}
	public void setCourse_amount(int course_amount) {
		this.course_amount = course_amount;
	}
	 
	public int getCourse_price() {
		return course_price;
	}
	public void setCourse_price(int course_price) {
		this.course_price = course_price;
	}
	public String getCourse_path() {
		return course_path;
	}
	public void setCourse_path(String course_path) {
		this.course_path = course_path;
	}
	public User getTeacher() {
		return teacher;
	}
	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}
	
	
}
