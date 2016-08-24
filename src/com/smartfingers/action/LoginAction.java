package com.smartfingers.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.model.User;
import com.smartfingers.service.UserService;



public class LoginAction extends ActionSupport{

	//�û���
	private String user_name;
	//�û�����
	private String user_password;
	//��֤��
	private String user_random;
	//��Ҫע���ҵ���߼��ӿ�ʵ����
	protected UserService userService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		/*
		 * ʵ���û���¼��֤
		 * 1���Ƚ�����֤����֤������ȷ�ٽ����û���֤
		 * 2��ʹ��ҵ���߼��ӿ��ṩ�û���������֤����loginValid��������֤�Ƿ���ڵ�¼�û�
		 * 3�����ڣ��õ����û�����ȡ�ø�action��request��map�����������map
		 * 3���ص�ָ��ҳ�档
		 */
		//ȡ����֤���ַ���
		Map session  = (Map) ActionContext.getContext().getSession();
		String randomString=(String) session.get("random");
		//������֤���жϣ�����֤�����ֱ�ӷ���
		if(user_random.toUpperCase().equals(randomString)){
			boolean isuser=userService.loginValid(user_name, user_password);
			
			//�����û���¼��Ϣ��֤�������󷵻�
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
			System.out.println("��֤����������");
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
