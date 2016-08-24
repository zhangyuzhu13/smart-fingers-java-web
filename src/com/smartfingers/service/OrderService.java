package com.smartfingers.service;

import java.util.List;

import com.smartfingers.model.Order;
import com.smartfingers.model.User;

public interface OrderService {
	//��Ӷ���
	public boolean addOrder(int user_id,int course_id);
	//֧������
	public boolean payOrder(int order_id);
	//��ѯ����
	public Order get(int id);
	//��ѯcustomer����
	public List<Order> getOrderByCustomer(User customer);
	//�õ�δ֧������
	public List<Order> getOnesUnpaidOrder(User customer);
	//ȡ������
	public boolean concelOrder(int id);
	//�õ����ж���
	public List<Order> getAllOrder();
	//�õ�����֧������
	public List<Order> getAllPaidOrder();
	//���¶�����Ϣ
	public boolean updateOrder(List<Order> orders);
}
