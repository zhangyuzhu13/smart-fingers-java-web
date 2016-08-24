package com.smartfingers.service.impl;

import java.util.List;

import com.smartfingers.DAO.UserDAO;
import com.smartfingers.model.User;
import com.smartfingers.service.UserService;

public class UserServiceImpl implements UserService {

	/*
	 * 实现用户逻辑业务功能，为动作action提供服务
	 */
	//需要注入userDAO，在配置applicationContext。xml中bean下添加name为userDAO的属性。
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean add(String user_name, String user_password,
			String user_email, int user_level) {
		// TODO Auto-generated method stub
		/*
		 * 实现添加用户功能，
		 * 1创建新用户，
		 * 2将各属性赋值
		 * 3保存到数据库
		 * 4返回Boolean值通知是否保存
		 */
		try{
			//依次将属性set进user并添加该user
			User user = new User();
			user.setUser_email(user_email);
			user.setUser_level(user_level);
			user.setUser_name(user_name);
			user.setUser_password(user_password);
			userDAO.save(user);
			return true;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean loginValid(String user_name, String user_password) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 实现用户密码的登录验证功能
		 * 利用数据访问接口提供的findUserByNameAndPassword方法，验证数据库中是否存在此用户
		 * 存在返回true，不存在返回false
		 */
		User user=userDAO.findUserByNameAndPassword(user_name, user_password);
		if(user!=null)
			return true;
		else 
			return false;
	}

	@Override
	public boolean validateName(String user_name) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 验证用户名是否已被注册
		 */
		if(userDAO.findUserByName(user_name)==null)
			return true;
		else 
			return false;
	}

	@Override
	public boolean delete(String user_name) {
		// TODO Auto-generated method stub
		/*
		 * 删除指定用户名的用户
		 */
		User user = userDAO.findUserByName(user_name);
		if(user!=null){
			userDAO.delete(user);
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean modiUser(String user_name, String user_password,
			String user_email) {
		// TODO Auto-generated method stub
		/*
		 * 实现用户信息的更新
		 * 1首先按用户名索引拿到该用户
		 * 2将更改信息置入
		 * 3利用数据库访问接口update方法更新用户信息
		 */
		User user=userDAO.findUserByName(user_name);
		if(user!=null){
			user.setUser_email(user_email);
			user.setUser_password(user_password);
			userDAO.update(user);
			return true;
		}
		else 
			return false;
	}

	@Override
	public int getUserLevel(String user_name) {
		// TODO Auto-generated method stub
		/*
		 * 取得指定用户名的用户权限
		 */
		User user=userDAO.findUserByName(user_name);
		if(user==null){
			//0权限表示不存在
			return 0;
		}
		int user_level=user.getUser_level();
		return user_level;
	}

	@Override
	public User getUser(String user_name) {
		// TODO Auto-generated method stub
		/*
		 * 按照指定用户名得到该用户对象
		 */
		User user = userDAO.findUserByName(user_name);
		return user;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		
		return userDAO.get(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

}
