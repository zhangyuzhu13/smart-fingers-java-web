package com.smartfingers.action;

import java.io.ByteArrayInputStream;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.util.RandomImg;

public class RandomImgAction extends ActionSupport {

	/*
	 * 实现将随机生成的验证码放入前端，并将验证码字符串放入session的功能
	 */
	private ByteArrayInputStream inputStream;   
	
	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		RandomImg ri =  RandomImg.createImg();
		this.setInputStream(ri.getInput());
		ActionContext.getContext().getSession().put("random", ri.getCode());
		return "success";
	}

}
