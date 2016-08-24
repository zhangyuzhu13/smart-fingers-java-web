package com.smartfingers.DAO;

import java.sql.Date;
import java.util.List;

import com.smartfingers.model.Message;
import com.smartfingers.model.User;
/*
 * ��������message���ݱ�
 */
public interface MessageDAO {
	//��ȡmessage����
	public Message get(int id);
	//����message����
	public void save(Message message);
	//����������Ϣ
	public void update(Message message);
	//ɾ���û�����
	public void delete(Message message);
	//��id����ɾ��message
	public void delete(int id);
	//������������
	public List<Message> findAllMessage();
	//��user_name����message
	public List<Message> findMessageByUser(User user );
	//��ʱ���������
	public List<Message> findMessageByDate(Date date);
	
}
