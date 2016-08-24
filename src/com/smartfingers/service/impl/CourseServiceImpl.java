package com.smartfingers.service.impl;

import java.util.List;

import com.smartfingers.DAO.CourseDAO;
import com.smartfingers.DAO.UserDAO;
import com.smartfingers.model.Course;
import com.smartfingers.model.User;
import com.smartfingers.service.CourseService;

public class CourseServiceImpl implements CourseService {

	private UserDAO userDAO;
	private CourseDAO courseDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	
	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}


	@Override
	public boolean addCourse(String course_name, int course_amount,
			String teacher_name, int course_price, String course_path) {
		Course course = new Course();
		course.setCourse_amount(course_amount);
		course.setCourse_name(course_name);
		course.setCourse_price(course_price);
		course.setCourse_path(course_path);
		User teacher  = userDAO.findUserByName(teacher_name);
		course.setTeacher(teacher);
		courseDAO.save(course);
		return true;
	}

	@Override
	public List<Course> findCourseByTeacher(String teacher_name) {
		// TODO Auto-generated method stub
		User teacher = userDAO.findUserByName(teacher_name);
		return courseDAO.findCourseByTeacher(teacher);
	}

	@Override
	public List<Course> findCourseByName(String course_name) {
		// TODO Auto-generated method stub
		 return courseDAO.findCourseByName(course_name);
	}

	@Override
	public boolean deleteCourseByTeacher(String teacher_name) {
		User teacher = userDAO.findUserByName(teacher_name);
		List<Course> courses = courseDAO.findCourseByTeacher(teacher);
		for(Course course:courses){
			courseDAO.delete(course);
		}
		return true;
	}

	@Override
	public boolean deleteCourseByName(String course_name) {
		List<Course> courses = courseDAO.findCourseByName(course_name );
		for(Course course:courses){
			courseDAO.delete(course);
		}
		return true;
	}

	@Override
	public List<Course> findAllCourse() {
		// TODO Auto-generated method stub
		 return courseDAO.findAllCourse();
	}


	@Override
	public boolean deleteCourseById(int course_id) {
		// TODO Auto-generated method stub
		courseDAO.delete(course_id);
		return true;
	}


	@Override
	public Course get(int course_id) {
		// TODO Auto-generated method stub
		return courseDAO.get(course_id);
	}

}
