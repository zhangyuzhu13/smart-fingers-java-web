package com.smartfingers.action;

import java.io.ByteArrayInputStream;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.util.RandomImg;

public class RandomImgAction extends ActionSupport {

	/*
	 * ʵ�ֽ�������ɵ���֤�����ǰ�ˣ�������֤���ַ�������session�Ĺ���
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
