package com.smartfingers.action;

import java.io.File;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
 





import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.smartfingers.service.MessageService;

public class UploadMessageAction extends ActionSupport {

	private File image; //�ϴ����ļ�
	private String imageFileName; //�ļ�����
	private String imageContentType; //�ļ�����
	private String message_text;//��������
	private String message_image_path;
	
	private MessageService messageService;
	
	
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}


	
	@Override
	public String execute() throws Exception {
		/*
		 * ��δʵ���ϴ��ļ���ʽ��⣬
		 * ��δʵ���û���¼���
		 * ��δʵ������ɾ������
		 */
		 
		Map session  = (Map) ActionContext.getContext().getSession(); 
		String user_name = (String) session.get("user_name");
		if(user_name==null)
			return LOGIN;
		Random random = new Random();
		String real_path = ServletActionContext.getServletContext().getRealPath("/images/messages")+"/"+user_name;
	         
	       if (image != null) {
	    	   imageFileName = user_name+random.nextInt(10000)+".jpg";
	           File savefile = new File(new File(real_path ), imageFileName);
	           if (!savefile.getParentFile().exists())
	               savefile.getParentFile().mkdirs();
	           FileUtils.copyFile(image, savefile);
	           message_image_path =user_name+"/"+imageFileName; 
	           if(messageService.addMessage(message_text, message_image_path, user_name)){
	        	   System.out.println("�����ﷵ��");
	        	   return SUCCESS;
	           }
	           else
	        	   return "reMessage";
	            
	       }
	       return SUCCESS;
	   }



	public File getImage() {
		return image;
	}



	public void setImage(File image) {
		this.image = image;
	}



	public String getImageFileName() {
		return imageFileName;
	}



	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}



	public String getImageContentType() {
		return imageContentType;
	}



	public String getMessage_text() {
		return message_text;
	}



	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}



	public String getMessage_image_path() {
		return message_image_path;
	}



	public void setMessage_image_path(String message_image_path) {
		this.message_image_path = message_image_path;
	}

}
