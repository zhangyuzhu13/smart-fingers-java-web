package com.smartfingers.service;

import java.sql.Date;
import java.util.List;

import com.smartfingers.model.User;
import com.smartfingers.model.Message;
public interface MessageService {
	//添加留言
	public boolean addMessage(String message_text,String message_image_path ,String user_name);
	//按用户查找message
	public List<Message> findMessageByName(String user_name);
	//删除指定user的message
	public boolean deleteMessage(String user_name);
	//得到所有message
	public List<Message> findAll();
	//按message_id删除留言
	public boolean deleteMessage(int message_id);
}
