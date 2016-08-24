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
	<s:form action="AddCourseAction.action">
	
    <s:textfield name="course_name" size="32" label="课程名"/>
    <s:textfield name="course_amount" size="32" label="课时"/>
    <s:textfield name="course_price" size="32" label="课程价格"/>    
    <s:textfield name="course_path" size="32" label="课程链接"/> 
     
    <s:submit value="添加课程"/> 
	 
 	</s:form>
</body>
</html>