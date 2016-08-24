package com.smartfingers.service.impl;

import java.util.List;

import com.smartfingers.DAO.UserDAO;
import com.smartfingers.model.User;
import com.smartfingers.service.UserService;

public class UserServiceImpl implements UserService {

	/*
	 * ʵ���û��߼�ҵ���ܣ�Ϊ����action�ṩ����
	 */
	//��Ҫע��userDAO��������applicationContext��xml��bean�����nameΪuserDAO�����ԡ�
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean add(String user_name, String user_password,
			String user_email, int user_level) {
		// TODO Auto-generated method stub
		/*
		 * ʵ������û����ܣ�
		 * 1�������û���
		 * 2�������Ը�ֵ
		 * 3���浽���ݿ�
		 * 4����Booleanֵ֪ͨ�Ƿ񱣴�
		 */
		try{
			//���ν�����set��user����Ӹ�user
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
		 * ʵ���û�����ĵ�¼��֤����
		 * �������ݷ��ʽӿ��ṩ��findUserByNameAndPassword��������֤���ݿ����Ƿ���ڴ��û�
		 * ���ڷ���true�������ڷ���false
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
		 * ��֤�û����Ƿ��ѱ�ע��
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
		 * ɾ��ָ���û������û�
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
		 * ʵ���û���Ϣ�ĸ���
		 * 1���Ȱ��û��������õ����û�
		 * 2��������Ϣ����
		 * 3�������ݿ���ʽӿ�update���������û���Ϣ
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
		 * ȡ��ָ���û������û�Ȩ��
		 */
		User user=userDAO.findUserByName(user_name);
		if(user==null){
			//0Ȩ�ޱ�ʾ������
			return 0;
		}
		int user_level=user.getUser_level();
		return user_level;
	}

	@Override
	public User getUser(String user_name) {
		// TODO Auto-generated method stub
		/*
		 * ����ָ���û����õ����û�����
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
