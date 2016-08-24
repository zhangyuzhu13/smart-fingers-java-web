package com.smartfingers.DAO.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smartfingers.DAO.CourseDAO;
import com.smartfingers.DAO.UserDAO;
import com.smartfingers.model.Course;
import com.smartfingers.model.User;
 

public class CourseDAOImpl extends HibernateDaoSupport implements CourseDAO {


	@Override
	public Course get(int id) {
		// TODO Auto-generated method stub
		return (Course)getHibernateTemplate().get(Course.class, id);
	}

	@Override
	public void save(Course course) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(course);
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(course);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(Course.class, id));
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(course);
	}

	@Override
	public List<Course> findCourseById(int id) {
		// TODO Auto-generated method stub
		return (List<Course>)getHibernateTemplate().find("from Course a where a.id =?",id);
	}

	@Override
	public List<Course> findCourseByName(String course_name) {
		// TODO Auto-generated method stub
		return (List<Course>)getHibernateTemplate().find("from Course a where a.course_name =?",course_name);
	}

	@Override
	public List<Course> findCourseByTeacher(User teacher) {
		// TODO Auto-generated method stub
		
		return (List<Course>)getHibernateTemplate().find("from Course a where a.teacher =?",teacher);
	}

	@Override
	public List<Course> findAllCourse() {
		// TODO Auto-generated method stub
		return (List<Course>)getHibernateTemplate().find("from Course a where a.id !=?",0);
	}

}
