package com.smartfingers.DAO;

import java.sql.Date;
import java.util.List;

import com.smartfingers.model.Message;
import com.smartfingers.model.User;
/*
 * 管理留言message数据表
 */
public interface MessageDAO {
	//获取message对象
	public Message get(int id);
	//保存message对象
	public void save(Message message);
	//更新留言信息
	public void update(Message message);
	//删除用户留言
	public void delete(Message message);
	//按id索引删除message
	public void delete(int id);
	//查找所有留言
	public List<Message> findAllMessage();
	//按user_name索引message
	public List<Message> findMessageByUser(User user );
	//按时间查找留言
	public List<Message> findMessageByDate(Date date);
	
}
