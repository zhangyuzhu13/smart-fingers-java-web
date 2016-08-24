package com.smartfingers.DAO;

import java.util.List;

import com.smartfingers.model.User;

public interface UserDAO {
	/*
	 * 关于User表操作一些数据访问接口方法
	 */
	
	//获取user对象
	public User get(int id);
	//保存user
	public void save(User user);
	//更新user信息
	public void update(User user);
	//按id索引删除user
	public void delete(int id);
	//按对象删除user
	public void delete(User user);
	//得到全部user
	public List<User> findAll();
	//按user_name 和user_password查找并得到user
	public  User findUserByNameAndPassword(String user_name,String user_password);
	//按user_name索引查找并得到user
	public User findUserByName(String user_name );
	//按id查找并得到user
	public User findUserById(int id);
	
}
