package com.smartfingers.DAO;

import java.util.List;

import com.smartfingers.model.Course;
import com.smartfingers.model.User;

public interface CourseDAO {
	//��ȡcourse
	public Course get(int id);
	//����course����
	public void save(Course course);
	//����course��Ϣ
	public void update(Course course);
	//��idɾ��course
	public void delete(int id);
	//ɾ��course
	public void delete(Course course);
	//��������course
	public List<Course> findAllCourse();
	//���γ�id��ѯcourse
	public List<Course> findCourseById(int id);
	//���γ����Ʋ�ѯcourse
	public List<Course> findCourseByName(String course_name);
	//����ʦid��ѯcourse
	public List<Course> findCourseByTeacher(User teacher);
}
