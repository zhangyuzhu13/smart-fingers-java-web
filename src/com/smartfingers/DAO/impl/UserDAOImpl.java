package com.smartfingers.DAO.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smartfingers.DAO.UserDAO;
import com.smartfingers.model.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	
	//����idȡ��һ��user
	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return (User)getHibernateTemplate().get(User.class, id);
	}

	//����һ�����û�
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}

	//�����û���Ϣ
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
	}

	//��id����ɾ��һ��user
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(User.class, id));
	}

	//ɾ��һ��user
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
	}

	//�õ�ȫ��user
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>)getHibernateTemplate().find("from User a where a.user_name!=?","admin");
	}

	//�����û��������ѯuser�Ƿ����
	@Override
	public User findUserByNameAndPassword(String user_name, String user_password) {
		// TODO Auto-generated method stub
		List  ul = getHibernateTemplate().find(
				"from User au where au.user_name=? and au.user_password=?", new String[]{user_name,user_password});
		if(ul!=null)
			return (User)ul.get(0);
		return null;
	}

	//����������user
	@Override
	public User findUserByName(String user_name) {
		// TODO Auto-generated method stub
		List ul = getHibernateTemplate().find("from User au where au.user_name=? ", user_name);
		if(ul != null && ul.size()>=1)
		{
			return (User)ul.get(0);
		}
		return null;
	}

	//��id��ѯuser
	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		List ul = getHibernateTemplate().find("from User au where au.id=? ", id);
		if(ul != null && ul.size()>=1)
		{
			return (User)ul.get(0);
		}
		return null;
	}

}
