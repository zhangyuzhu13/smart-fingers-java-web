package com.smartfingers.test;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.model.User;

public class LoginActionTest extends ActionSupport{

	private String user_name;
	private int user_level;
	private String user_email;
	@Override
	public String execute() throws Exception {
		Map session = (Map) ActionContext.getContext().getSession();
		List<User> users = (List<User>) session.get("users");
		if(users!=null){
			User user=users.get(1);
			user_name= user.getUser_name();
			user_level= user.getUser_level();
			user_email = user.getUser_email();
			return "ok";
		}
		else{
			return "input";
		}
			
		 
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUser_level() {
		return user_level;
	}
	public void setUser_level(int user_level) {
		this.user_level = user_level;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
}
