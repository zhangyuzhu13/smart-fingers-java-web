package com.smartfingers.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.service.UserService;

public class RegisterAction extends ActionSupport {

	private String user_name;
	private String user_password;
	private String re_password;
	private String user_email;
	private Integer user_level;
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(!re_password.equals(user_password)){
			addActionError("密码两次输入不一致，请重新输入");
			return "register";
		}
		 
		if(userService.validateName(user_name)){
			if(userService.add(user_name, user_password, user_email, user_level)){
				return LOGIN;
			}
		}
		return "register";
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Integer getUser_level() {
		return user_level;
	}

	public void setUser_level(Integer user_level) {
		this.user_level = user_level;
	}



	public String getRe_password() {
		return re_password;
	}



	public void setRe_password(String re_password) {
		this.re_password = re_password;
	}

}
