<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>������԰�մ������ ��ͯ�ֹ�DIY����</title>
</head>
<body>
 
 
	<s:form action="LoginAction.action">
 		  
 		<s:textfield name="user_name" size="32" label="�û���"/> 
 		  
 		<s:password name="user_password" size="32" label="����"/> 
 		   
 		<s:textfield name="user_random" size="14" label="��֤��"/> 
 		<tr><td>
 		<img src="RandomImgAction.action" alt="��֤��" style="cursor:hand" title="�������?��һ��" />  
 		</td></tr>
 		<s:submit value="��½"/><br/>
 		 
 		
 		
 	</s:form>
 	 
 	 
 	<p>��û��ע�ᵥ���˴�</p>><a href="register.jsp" style="color:#1c0756">ע��</a>
  
 	<s:if test="hasFieldErrors()">
 		<s:fielderror/>
 	</s:if>
 
</body>
</html>