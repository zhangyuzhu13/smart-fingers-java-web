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
�γ������
	<table>
    <tr height=35px bgcolor=#eeeeee>
    	<td align=center>�γ�id</td>
    	<td align=center>�γ�����</td>
    	<td align=center>�γ̿�ʱ</td>
    	<td align=center>�γ̼۸�</td>
    	<td align=center>��ʦ����</td>
    	<td align=center>�γ�����</td>
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
	<tr height=35px><td align=center> <s:a href="./addCourse.jsp">��ӿγ�</s:a> </td></tr>
	 <s:form action="deleteCourse" method="deleteCourse">
	 	<s:textfield name="course_id" label="����Ҫɾ���γ�id"/>
	 	<s:submit value="ȷ��ɾ��"/>
	 
	 </s:form>	
	</s:if>
    </table>
     
</body>
</html>