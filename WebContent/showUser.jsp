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
�û������
	<table>
    <tr height=35px bgcolor=#eeeeee>
    	<td align=center>�û�id</td>
    	<td align=center>�û���</td>
    	<td align=center>�û�����</td>
    	<td align=center>�û�Ȩ��</td>
    	 
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
		<s:textfield name="deleteId" label="Ҫɾ���û���id"/>
		<s:submit label="ȷ��ɾ��"/>
	</s:form>
	</s:if>
    </table>
    <a href="./index.jsp">������ҳ</a>
</body>
</html>