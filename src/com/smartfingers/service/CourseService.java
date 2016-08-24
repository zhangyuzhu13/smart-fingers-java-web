package com.smartfingers.service;

import java.util.List;
import com.smartfingers.model.Course;

public interface CourseService {
	//��ӿγ�
	public boolean addCourse(String course_name,int course_amount,String teacher_name,int course_price,String course_path);
	//����ʦ�����ҿγ�
	public List<Course> findCourseByTeacher(String teacher_name);
	//���γ������ҿγ�
	public List<Course> findCourseByName(String course_name);
	//ɾ����ʦ��ɾ���γ�
	public boolean deleteCourseByTeacher(String teacher_name);
	//���γ���ɾ���γ�
	public boolean deleteCourseByName(String course_name);
	//�õ�ȫ���γ�
	public List<Course> findAllCourse();
	//��idɾ���γ�
	public boolean deleteCourseById(int course_id);
	//��id�õ�course
	public Course get(int course_id);
	
}
