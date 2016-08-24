package com.smartfingers.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.model.Message;
import com.smartfingers.service.MessageService;

public class ShowMessageAction extends ActionSupport {

	private int message_id;
	private MessageService messageService;
	
	
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

     
	@Override
	public String execute() throws Exception {
		/*
		 * 查询所有留言并加入request中返回
		 */
		Map request = (Map) ActionContext.getContext().get("request");
		List<Message> messages = messageService.findAll();
		request.put("messages", messages);
		return SUCCESS;
	}
	
	public String deleteMessage(){
		messageService.deleteMessage(message_id);
		return SUCCESS;
	}
	
	public String showMyMessage(){
		Map session = (Map) ActionContext.getContext().getSession();
		if(session.get("user_name")!=null){
			Map request = (Map) ActionContext.getContext().get("request");
			List<Message> messages = messageService.findMessageByName((String) session.get("user_name"));
			request.put("messages", messages);
			return SUCCESS;
		}
		else{
			return LOGIN;
		}
		 
	}

	public int getMessage_id() {
		return message_id;
	}


	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	
}
