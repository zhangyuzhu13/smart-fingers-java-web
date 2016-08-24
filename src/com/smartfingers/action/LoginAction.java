package com.smartfingers.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.model.User;
import com.smartfingers.service.UserService;



public class LoginAction extends ActionSupport{

	//用户名
	private String user_name;
	//用户密码
	private String user_password;
	//验证码
	private String user_random;
	//需要注入的业务逻辑接口实现类
	protected UserService userService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 实现用户登录验证
		 * 1首先进行验证码验证，若正确再进行用户验证
		 * 2再使用业务逻辑接口提供用户名密码验证功能loginValid方法，验证是否存在登录用户
		 * 3若存在，得到该用户对象，取得该action的request的map，将结果放入map
		 * 3返回到指定页面。
		 */
		//取得验证码字符串
		Map session  = (Map) ActionContext.getContext().getSession();
		String randomString=(String) session.get("random");
		//进行验证码判断，若验证码错误直接返回
		if(user_random.toUpperCase().equals(randomString)){
			boolean isuser=userService.loginValid(user_name, user_password);
			
			//进行用户登录信息验证，若错误返回
			if(isuser){
				User user=userService.getUser(user_name);
				session.put("user_name", user.getUser_name());
				session.put("user_level", user.getUser_level());
				
				return SUCCESS;
			}
			else{
				return LOGIN;
			}
		}
		else{
			System.out.println("验证码输入有误");
			return LOGIN;
			
		}
		
		
		
	}
	public String logout(){
		Map session  = (Map) ActionContext.getContext().getSession();
		session.clear();
		return SUCCESS;
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

	
	public String getUser_random() {
		return user_random;
	}

	public void setUser_random(String user_random) {
		this.user_random = user_random;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
 
}
