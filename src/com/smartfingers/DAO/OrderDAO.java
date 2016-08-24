package com.smartfingers.DAO;

 
import java.util.List;

import com.smartfingers.model.Course;
import com.smartfingers.model.Order;
import com.smartfingers.model.User;

public interface OrderDAO {
	//获取order
	public Order get(int id);
	//保存order内容
	public void save(Order order);
	//更新order信息
	public void update(Order order);
	//按id删除order
	public void delete(int id);
	//删除order
	public void delete(Order order);
	//查看user的order
	public List<Order> findOrderByUser(User user);
	//查看course的order
	public List<Order> findOrderByCourse(Course course);
	//获得所有order
	public List<Order> findAllOrder();
	//查找单个customer未支付或已支付的订单
	public List<Order> findOnesUnpaidOrder(User customer);
	//得到所有已支付订单
	public List<Order>  findAllPaidOrder();
}
