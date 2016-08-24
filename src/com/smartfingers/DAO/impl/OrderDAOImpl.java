package com.smartfingers.DAO.impl;

import java.util.List;

 

 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smartfingers.DAO.OrderDAO;
 
import com.smartfingers.model.Course;
import com.smartfingers.model.Order;
import com.smartfingers.model.User;

public class OrderDAOImpl extends HibernateDaoSupport implements OrderDAO {

	@Override
	public Order get(int id) {
		 
		return (Order)getHibernateTemplate().get(Order.class, id);
	}

	@Override
	public void save(Order order) {
		
		getHibernateTemplate().save(order);

	}

	@Override
	public void update(Order order) {
		getHibernateTemplate().update(order);

	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(getHibernateTemplate().get(Order.class, id));

	}

	@Override
	public void delete(Order order) {
		getHibernateTemplate().delete(order);

	}

	@Override
	public List<Order> findOrderByUser(User user) {
		 
		return (List<Order>)getHibernateTemplate().find("from Order a where a.customer =?",user);
	}

	@Override
	public List<Order> findOrderByCourse(Course course) {
		 
		return (List<Order>)getHibernateTemplate().find("from Order a where a.course =?",course);
	}

	@Override
	public List<Order> findAllOrder() {
		 
		return (List<Order>)getHibernateTemplate().find("from Order a where a.id !=?",0);
	}

	@Override
	public List<Order> findOnesUnpaidOrder(User customer) {
		// TODO Auto-generated method stub
		return  (List<Order>)getHibernateTemplate().find("from Order a where a.customer =? and a.is_pay =false",customer);
	}

	@Override
	public List<Order> findAllPaidOrder() {
		// TODO Auto-generated method stub
		return (List<Order>)getHibernateTemplate().find("from Order a where a.isPay=?",true);
	}
	
}
