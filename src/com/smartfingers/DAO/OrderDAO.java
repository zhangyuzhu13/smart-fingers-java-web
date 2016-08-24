package com.smartfingers.DAO;

 
import java.util.List;

import com.smartfingers.model.Course;
import com.smartfingers.model.Order;
import com.smartfingers.model.User;

public interface OrderDAO {
	//��ȡorder
	public Order get(int id);
	//����order����
	public void save(Order order);
	//����order��Ϣ
	public void update(Order order);
	//��idɾ��order
	public void delete(int id);
	//ɾ��order
	public void delete(Order order);
	//�鿴user��order
	public List<Order> findOrderByUser(User user);
	//�鿴course��order
	public List<Order> findOrderByCourse(Course course);
	//�������order
	public List<Order> findAllOrder();
	//���ҵ���customerδ֧������֧���Ķ���
	public List<Order> findOnesUnpaidOrder(User customer);
	//�õ�������֧������
	public List<Order>  findAllPaidOrder();
}
