package com.smartfingers.DAO.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smartfingers.DAO.MessageDAO;
import com.smartfingers.model.Message;
import com.smartfingers.model.User;

public class MessageDAOImpl extends HibernateDaoSupport implements MessageDAO {

	@Override
	public Message get(int id) {
		// TODO Auto-generated method stub
		return (Message)getHibernateTemplate().get(Message.class, id);
		 
	}

	@Override
	public void save(Message message) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(message);
	}

	@Override
	public void update(Message message) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(message);
	}

	@Override
	public void delete(Message message) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(message);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(Message.class, id));
	}

	 

	@Override
	public List<Message> findAllMessage() {
		// TODO Auto-generated method stub
		return (List<Message>)getHibernateTemplate().find("from Message a where a.id!=?",0);
		 
	}

	@Override
	public List<Message> findMessageByUser(User user ) {
		// TODO Auto-generated method stub
		return (List<Message>)getHibernateTemplate().find("from Message a where a.user=?",user);
		 
	}

	@Override
	public List<Message> findMessageByDate(Date date) {
		// TODO Auto-generated method stub
		return (List<Message>)getHibernateTemplate().find("from Message a where a.message_date=?",date);
	}

}
