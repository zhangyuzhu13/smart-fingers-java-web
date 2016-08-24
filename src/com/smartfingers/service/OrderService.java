package com.smartfingers.service;

import java.util.List;

import com.smartfingers.model.Order;
import com.smartfingers.model.User;

public interface OrderService {
	//添加订单
	public boolean addOrder(int user_id,int course_id);
	//支付订单
	public boolean payOrder(int order_id);
	//查询订单
	public Order get(int id);
	//查询customer订单
	public List<Order> getOrderByCustomer(User customer);
	//得到未支付订单
	public List<Order> getOnesUnpaidOrder(User customer);
	//取消订单
	public boolean concelOrder(int id);
	//得到所有订单
	public List<Order> getAllOrder();
	//得到所有支付订单
	public List<Order> getAllPaidOrder();
	//更新订单信息
	public boolean updateOrder(List<Order> orders);
}
