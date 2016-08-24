package com.smartfingers.DAO.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smartfingers.DAO.UserDAO;
import com.smartfingers.model.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	
	//根据id取得一个user
	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return (User)getHibernateTemplate().get(User.class, id);
	}

	//保存一个新用户
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}

	//更新用户信息
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
	}

	//按id索引删除一个user
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(User.class, id));
	}

	//删除一个user
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
	}

	//得到全部user
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>)getHibernateTemplate().find("from User a where a.user_name!=?","admin");
	}

	//按照用户名密码查询user是否存在
	@Override
	public User findUserByNameAndPassword(String user_name, String user_password) {
		// TODO Auto-generated method stub
		List  ul = getHibernateTemplate().find(
				"from User au where au.user_name=? and au.user_password=?", new String[]{user_name,user_password});
		if(ul!=null)
			return (User)ul.get(0);
		return null;
	}

	//按姓名查找user
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

	//按id查询user
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
