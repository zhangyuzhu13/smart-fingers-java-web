package com.smartfingers.model;

import java.sql.Date;

public class Order {
	//����id
	private int id;
	//������
	private User customer ;
	//����γ�
	private Course course ;
	//����γ�ʱ��
	private Date order_date;
	//�Ƿ����֧��
	private boolean is_pay;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	 
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public boolean isIs_pay() {
		return is_pay;
	}
	public void setIs_pay(boolean is_pay) {
		this.is_pay = is_pay;
	}
	
	
}
