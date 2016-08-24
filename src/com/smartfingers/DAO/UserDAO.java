package com.smartfingers.DAO;

import java.util.List;

import com.smartfingers.model.User;

public interface UserDAO {
	/*
	 * ����User�����һЩ���ݷ��ʽӿڷ���
	 */
	
	//��ȡuser����
	public User get(int id);
	//����user
	public void save(User user);
	//����user��Ϣ
	public void update(User user);
	//��id����ɾ��user
	public void delete(int id);
	//������ɾ��user
	public void delete(User user);
	//�õ�ȫ��user
	public List<User> findAll();
	//��user_name ��user_password���Ҳ��õ�user
	public  User findUserByNameAndPassword(String user_name,String user_password);
	//��user_name�������Ҳ��õ�user
	public User findUserByName(String user_name );
	//��id���Ҳ��õ�user
	public User findUserById(int id);
	
}
