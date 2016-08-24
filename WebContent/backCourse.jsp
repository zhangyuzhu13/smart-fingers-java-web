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
课程浏览：
	<table>
    <tr height=35px bgcolor=#eeeeee>
    	<td align=center>课程id</td>
    	<td align=center>课程名称</td>
    	<td align=center>课程课时</td>
    	<td align=center>课程价格</td>
    	<td align=center>教师姓名</td>
    	<td align=center>课程链接</td>
    </tr>
    <s:iterator id="courses" value="#request.courses">
    <s:if test="#courses.id!=null" >
    	<tr height=35px bgcolor=#eeeeee>
    		<td align=center><s:property value="#courses.id" /></td>
    		<td align=center><s:property value="#courses.course_name" /></td>
    		<td align=center><s:property value="#courses.course_amount" /></td>
    		<td align=center><s:property value="#courses.course_price" /></td>
    		<td align=center><s:property value="#courses.teacher.user_name" /></td>
    		<td align=center><s:property value="#courses.course_path" /></td>
    	</tr>
   	</s:if>
    </s:iterator>
    <s:if test="#session.user_level==1 || #session.user_level==2">
	<tr height=35px><td align=center> <s:a href="./addCourse.jsp">添加课程</s:a> </td></tr>
	 <s:form action="deleteCourse" method="deleteCourse">
	 	<s:textfield name="course_id" label="输入要删除课程id"/>
	 	<s:submit value="确认删除"/>
	 
	 </s:form>	
	</s:if>
    </table>
     
</body>
</html>