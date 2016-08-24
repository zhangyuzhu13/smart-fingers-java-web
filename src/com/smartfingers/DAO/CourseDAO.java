package com.smartfingers.DAO;

import java.util.List;

import com.smartfingers.model.Course;
import com.smartfingers.model.User;

public interface CourseDAO {
	//获取course
	public Course get(int id);
	//保存course内容
	public void save(Course course);
	//更新course信息
	public void update(Course course);
	//按id删除course
	public void delete(int id);
	//删除course
	public void delete(Course course);
	//查找所有course
	public List<Course> findAllCourse();
	//按课程id查询course
	public List<Course> findCourseById(int id);
	//按课程名称查询course
	public List<Course> findCourseByName(String course_name);
	//按教师id查询course
	public List<Course> findCourseByTeacher(User teacher);
}
