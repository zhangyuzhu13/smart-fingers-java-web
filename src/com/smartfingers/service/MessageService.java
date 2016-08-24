package com.smartfingers.service;

import java.sql.Date;
import java.util.List;

import com.smartfingers.model.User;
import com.smartfingers.model.Message;
public interface MessageService {
	//�������
	public boolean addMessage(String message_text,String message_image_path ,String user_name);
	//���û�����message
	public List<Message> findMessageByName(String user_name);
	//ɾ��ָ��user��message
	public boolean deleteMessage(String user_name);
	//�õ�����message
	public List<Message> findAll();
	//��message_idɾ������
	public boolean deleteMessage(int message_id);
}
