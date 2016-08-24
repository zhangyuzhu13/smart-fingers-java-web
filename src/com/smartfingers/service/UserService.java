package com.smartfingers.service;

import java.util.List;

import com.smartfingers.model.User;

public interface UserService {
	/*
	 * user服务接口
	 */
	
	//处理新增用户业务逻辑
	public boolean add(String user_name,String user_password,String user_email,int user_level);
	//判断用户登录是否有效逻辑
	boolean loginValid(String user_name,String user_password) throws Exception;
	//判断用户名是否有效逻辑
	boolean validateName(String user_name) throws Exception;
	//按照user_name索引删除user
	boolean delete(String user_name );
	//修改用户信息
	boolean modiUser( String user_name,String user_password,String user_email);
	//得到用户权限等级
	int getUserLevel(String user_name);
	//按user_name索引得到user
	User getUser(String user_name);
	//按id获取user
	User get(int id);
	//得到所有用户
	List<User> getAll();
}
