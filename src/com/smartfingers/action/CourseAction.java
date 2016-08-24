package com.smartfingers.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.model.Course;
import com.smartfingers.service.CourseService;
import com.smartfingers.service.UserService;

public class CourseAction extends ActionSupport {
	private int course_id;
	private String course_name;
	private int course_price;
	private int course_amount;
	private String course_path;
	
	private CourseService courseService;
	private UserService userService;
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/*
	 * 添加课程
	 * 1.获取登陆用户名，检查是否为教师
	 * 2.将课程信息存入
	 */
	public String addCourse(){
		Map session  = (Map) ActionContext.getContext().getSession();
		if((int)session.get("user_level" )!=2)
			return LOGIN;
		String teacher_name = (String)session.get("user_name");
		if(courseService.addCourse(course_name, course_amount, teacher_name, course_price, course_path))
			return SUCCESS;
		else
			return "error";
	}
	/*
	 * 展示课程
	 * 1.获取当前课程
	 * 2.放入request里
	 */
	public String showCourse(){
		Map request = (Map) ActionContext.getContext().get("request");
		List<Course> courses = courseService.findAllCourse();
		request.put("courses", courses);
		return SUCCESS;
	}
	public String showMyCourse(){
		Map session = (Map) ActionContext.getContext().getSession();
		List<Course> courses = courseService.findCourseByTeacher((String)session.get("user_name"));
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("courses", courses);
		return SUCCESS;
	}
	public String deleteCourse(){
		courseService.deleteCourseById(course_id);
		return SUCCESS;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getCourse_price() {
		return course_price;
	}

	public void setCourse_price(int course_price) {
		this.course_price = course_price;
	}

	public int getCourse_amount() {
		return course_amount;
	}

	public void setCourse_amount(int course_amount) {
		this.course_amount = course_amount;
	}

	public String getCourse_path() {
		return course_path;
	}

	public void setCourse_path(String course_path) {
		this.course_path = course_path;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	
	
}
