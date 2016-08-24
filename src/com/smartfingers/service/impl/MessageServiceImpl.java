package com.smartfingers.service.impl;

import java.sql.Date;
import java.util.List;

import com.smartfingers.DAO.MessageDAO;
import com.smartfingers.DAO.UserDAO;
import com.smartfingers.model.Message;
import com.smartfingers.model.User;
import com.smartfingers.service.MessageService;
 

public class MessageServiceImpl implements MessageService {

	private MessageDAO messageDAO;
	private UserDAO userDAO;
	public void setMessageDAO(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}
	
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


	@Override
	public boolean addMessage(String message_text, String message_image_path,
			 String user_name) {
		// TODO Auto-generated method stub
		Message message = new Message();
		java.sql.Date message_date = new java.sql.Date(System.currentTimeMillis());
		message.setMessage_date(message_date);
		message.setMessage_image_path(message_image_path);
		message.setMessage_text(message_text);
		User user = userDAO.findUserByName(user_name);
		message.setUser(user);
		messageDAO.save(message);
		return true;
	}
	
	@Override
	public List<Message> findMessageByName(String user_name) {
		// TODO Auto-generated method stub
		User user = userDAO.findUserByName(user_name);
		return  messageDAO.findMessageByUser(user);
	}

	@Override
	public boolean deleteMessage(String user_name) {
		// TODO Auto-generated method stub
		User user = userDAO.findUserByName(user_name);
		List<Message> message = messageDAO.findMessageByUser(user);
		for(Message m:message){
			messageDAO.delete(m);
		}
		return true;
	}

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		
		return messageDAO.findAllMessage();
	}


	@Override
	public boolean deleteMessage(int message_id) {
		// TODO Auto-generated method stub
		messageDAO.delete(message_id);
		return true;
	}

}
