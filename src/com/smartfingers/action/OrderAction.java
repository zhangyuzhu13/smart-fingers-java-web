package com.smartfingers.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.model.Course;
import com.smartfingers.model.Order;
import com.smartfingers.model.User;
import com.smartfingers.service.CourseService;
import com.smartfingers.service.OrderService;
import com.smartfingers.service.UserService;

public class OrderAction extends ActionSupport {
	
	private int user_id;
	private int course_id;
	private int order_id;
	
	private OrderService orderService;
	private UserService userService;
	private CourseService courseService;
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}


	public String addOrder(){
		
		Map session = ActionContext.getContext().getSession();
		
		Map param = ActionContext.getContext().getParameters();
		String[] p = (String[]) param.get("course_id");
		course_id = Integer.parseInt(p[0]);
		
		User customer = userService.getUser((String)session.get("user_name"));
		user_id = customer.getId();
		orderService.addOrder(user_id, course_id);
		Map request = (Map) ActionContext.getContext().get("request");
		List<Order> unPaidOrders = orderService.getOnesUnpaidOrder(customer);
		request.put("orders", unPaidOrders);
		session.put("unPaidOrders", unPaidOrders);
		return SUCCESS;
	}
	public String deleteOrder(){
		
		Map session = ActionContext.getContext().getSession();
		Map param = ActionContext.getContext().getParameters();
		User customer = userService.getUser((String)session.get("user_name"));
		String[] p = (String[]) param.get("order_id");
		order_id = Integer.parseInt(p[0]);
		orderService.concelOrder(order_id);
		Map request = (Map) ActionContext.getContext().get("request");
		List<Order> unPaidOrders = orderService.getOnesUnpaidOrder(customer);
		request.put("orders", unPaidOrders);
		session.put("unPaidOrders", unPaidOrders);
		return SUCCESS;
	}
	public String payOrder(){
		Map session = ActionContext.getContext().getSession();
		Map param = ActionContext.getContext().getParameters();
		List<Order> unPaidOrders = (List<Order>) session.get("unPaidOrders");
		
		if(unPaidOrders==null){
			System.out.println("未穿过订单------");
		}
		else{
			System.out.println("已穿过=----");
		}
		
		for(Order o:unPaidOrders){
			o.setIs_pay(true);
			System.out.println(o.getId()+"号订单已支付");
		}
		
		orderService.updateOrder(unPaidOrders);
		session.remove("unPaidOrders");
		Map request = (Map) ActionContext.getContext().get("request");
		List<Course> courses = courseService.findAllCourse();
		request.put("courses", courses);
		
		return SUCCESS;
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


	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	
	
	
}
