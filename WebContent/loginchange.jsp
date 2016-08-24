<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>银座·园艺创智天地 儿童手工DIY工坊</title>
</head>
<body>
 
 
	<s:form action="LoginAction.action">
 		  
 		<s:textfield name="user_name" size="32" label="用户名"/> 
 		  
 		<s:password name="user_password" size="32" label="密码"/> 
 		   
 		<s:textfield name="user_random" size="14" label="验证码"/> 
 		<tr><td>
 		<img src="RandomImgAction.action" alt="验证码" style="cursor:hand" title="看不清楚?换一张" />  
 		</td></tr>
 		<s:submit value="登陆"/><br/>
 		 
 		
 		
 	</s:form>
 	 
 	 
 	<p>若没有注册单击此处</p>><a href="register.jsp" style="color:#1c0756">注册</a>
  
 	<s:if test="hasFieldErrors()">
 		<s:fielderror/>
 	</s:if>
 
</body>
</html>