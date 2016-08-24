package com.smartfingers.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.model.User;
import com.smartfingers.service.UserService;

public class UserAction extends ActionSupport {
	private String user_name;
	private String user_password;
	private String re_password;
	private String user_email;
	private Integer user_level;
	private int deleteId;
	
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/*
	 * 添加教师账号
	 */
	public String addTeacher(){
		
		return SUCCESS;
	}
	/*
	 * 删除用户账号
	 */
	public String deleteUser(){
		User user = userService.get(deleteId);
		if(user==null)
			System.out.println("不存在该用户");
		else
			userService.delete(user.getUser_name());
		return SUCCESS;
		
	}
	/*
	 * 显示所有用户
	 */
	public String showUser(){
		Map session  = (Map) ActionContext.getContext().getSession();
		Map request  = (Map) ActionContext.getContext().get("request");
		
		 
		List<User> users = null;
		if(session.get("user_level").equals(1)){
			 users = userService.getAll();
			 request.put("users", users);
		}
		else{
			 User user = userService.getUser((String)session.get("user_name"));
			 request.put("users", user);
		}
		
		return SUCCESS;
	}
	public String showMyInfo(){
		
		
		return SUCCESS;
	}
	/*
	 * 修稿用户信息
	 */
	public String updateInfo(){
		userService.modiUser(user_name, user_password, user_email);
		
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
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getRe_password() {
		return re_password;
	}
	public void setRe_password(String re_password) {
		this.re_password = re_password;
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
	public int getDeleteId() {
		return deleteId;
	}
	public void setDeleteId(int deleteId) {
		this.deleteId = deleteId;
	}
	 
	
}
