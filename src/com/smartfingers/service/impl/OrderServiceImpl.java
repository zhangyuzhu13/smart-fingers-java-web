package com.smartfingers.service.impl;

import java.sql.Date;
import java.util.List;

import com.smartfingers.DAO.CourseDAO;
import com.smartfingers.DAO.OrderDAO;
import com.smartfingers.DAO.UserDAO;
import com.smartfingers.model.Order;
import com.smartfingers.model.User;
import com.smartfingers.service.OrderService;

public class OrderServiceImpl implements OrderService {

	private int user_id;
	private int course_id;
	private boolean isPay;
	
	
	
	private UserDAO userDAO;
	private CourseDAO courseDAO;
	private OrderDAO orderDAO;
	
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}
	
	
	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public boolean addOrder(int user_id, int course_id) {
		
		Order order = new Order();
		order.setCustomer(userDAO.get(user_id));
		order.setCourse(courseDAO.get(course_id));
		java.sql.Date order_date = new java.sql.Date(System.currentTimeMillis());
		order.setOrder_date(order_date);
		order.setIs_pay(false);
		orderDAO.save(order);
		return true;
	}

	@Override
	public boolean payOrder(int order_id) {
		// TODO Auto-generated method stub
		Order order = orderDAO.get(order_id);
		if(order!=null){
			order.setIs_pay(true);
			orderDAO.save(order);
			return true;
		}
		else
			return false;
	}

	@Override
	public Order get(int id) {
		// TODO Auto-generated method stub
		return orderDAO.get(id);
	}

	@Override
	public List<Order> getOrderByCustomer(User customer) {
		// TODO Auto-generated method stub
		return orderDAO.findOrderByUser(customer);
	}

	@Override
	public List<Order> getOnesUnpaidOrder(User customer) {
		// TODO Auto-generated method stub
		return orderDAO.findOnesUnpaidOrder(customer);
	}

	@Override
	public boolean concelOrder(int id) {
		// TODO Auto-generated method stub
		Order order = orderDAO.get(id);
		if(order==null){
			System.out.println("no order to concel");
			return false;
		}
		else{
			orderDAO.delete(order);
			System.out.println("success to concel order.");
			return true;
		}
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderDAO.findAllOrder();
	}

	@Override
	public List<Order> getAllPaidOrder() {
		// TODO Auto-generated method stub
		return orderDAO.findAllPaidOrder();
	}
	
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public boolean isPay() {
		return isPay;
	}

	public void setPay(boolean isPay) {
		this.isPay = isPay;
	}

	@Override
	public boolean updateOrder(List<Order> orders) {
		// TODO Auto-generated method stub
		for(Order o:orders){
			orderDAO.update(o);
		}
		return true;
	}
	
	
}
