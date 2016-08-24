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
用户浏览：
	<table>
    <tr height=35px bgcolor=#eeeeee>
    	<td align=center>用户id</td>
    	<td align=center>用户名</td>
    	<td align=center>用户邮箱</td>
    	<td align=center>用户权限</td>
    	 
    </tr>
    <s:iterator id="users" value="#request.users">
    <s:if test="#users.id!=null" >
    	<tr height=35px bgcolor=#eeeeee>
    		<td align=center><s:property value="#users.id" /></td>
    		<td align=center><s:property value="#users.user_name" /></td>
    		<td align=center><s:property value="#users.user_email" /></td>
    		<td align=center><s:property value="#users.user_level" /></td>
    		 
    		 
    	</tr>
   	</s:if>
    </s:iterator>
    <s:if test="#session.user_level.equals(1)">
	<s:form action="deleteUser.action" method="deleteUser">
		<s:textfield name="deleteId" label="要删除用户的id"/>
		<s:submit label="确认删除"/>
	</s:form>
	</s:if>
    </table>
    <a href="./index.jsp">返回首页</a>
</body>
</html>