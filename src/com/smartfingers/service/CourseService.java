package com.smartfingers.service;

import java.util.List;
import com.smartfingers.model.Course;

public interface CourseService {
	//添加课程
	public boolean addCourse(String course_name,int course_amount,String teacher_name,int course_price,String course_path);
	//按教师名查找课程
	public List<Course> findCourseByTeacher(String teacher_name);
	//按课程名查找课程
	public List<Course> findCourseByName(String course_name);
	//删按教师名删除课程
	public boolean deleteCourseByTeacher(String teacher_name);
	//按课程名删除课程
	public boolean deleteCourseByName(String course_name);
	//得到全部课程
	public List<Course> findAllCourse();
	//按id删除课程
	public boolean deleteCourseById(int course_id);
	//按id得到course
	public Course get(int course_id);
	
}
