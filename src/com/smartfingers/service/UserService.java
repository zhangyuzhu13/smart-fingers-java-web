package com.smartfingers.service;

import java.util.List;

import com.smartfingers.model.User;

public interface UserService {
	/*
	 * user����ӿ�
	 */
	
	//���������û�ҵ���߼�
	public boolean add(String user_name,String user_password,String user_email,int user_level);
	//�ж��û���¼�Ƿ���Ч�߼�
	boolean loginValid(String user_name,String user_password) throws Exception;
	//�ж��û����Ƿ���Ч�߼�
	boolean validateName(String user_name) throws Exception;
	//����user_name����ɾ��user
	boolean delete(String user_name );
	//�޸��û���Ϣ
	boolean modiUser( String user_name,String user_password,String user_email);
	//�õ��û�Ȩ�޵ȼ�
	int getUserLevel(String user_name);
	//��user_name�����õ�user
	User getUser(String user_name);
	//��id��ȡuser
	User get(int id);
	//�õ������û�
	List<User> getAll();
}
