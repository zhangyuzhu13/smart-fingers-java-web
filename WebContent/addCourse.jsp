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
	<s:form action="AddCourseAction.action">
	
    <s:textfield name="course_name" size="32" label="�γ���"/>
    <s:textfield name="course_amount" size="32" label="��ʱ"/>
    <s:textfield name="course_price" size="32" label="�γ̼۸�"/>    
    <s:textfield name="course_path" size="32" label="�γ�����"/> 
     
    <s:submit value="��ӿγ�"/> 
	 
 	</s:form>
</body>
</html>