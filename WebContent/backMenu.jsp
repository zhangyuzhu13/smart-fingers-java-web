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
<table>
<s:if test="#session.user_level==1">
<tr>
<td> 
<a href="<s:url action='showUser' method='showUser'/>" style="color:#666" target="rightFrame">�û�����</a>
</td>
</tr>
<tr>
<td> 
<a href="<s:url action='ShowCourseAction' method='showCourse'/>"  target="rightFrame" style="color:#1c0756">�γ̹���</a>
 </td>
</tr>
<tr>
<td> 
<a href="./deleteMessage.jsp" target="rightFrame" style="color:#1c0756">���Թ���</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='LogoutAction' method='logout'/>" target="_top" style="color:#1c0756">�˳���¼</a>
 </td>
</tr>
</s:if>
<s:if test="#session.user_level==2">
<tr>
<td> 
<a href="<s:url action='showUser' method='showUser'/>" style="color:#666" target="rightFrame">�ҵ���Ϣ</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='showMyCourse' method='showMyCourse'/>" target="rightFrame" style="color:#1c0756">�ҵĿγ�</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='LogoutAction' method='logout'/>" target="_top" style="color:#1c0756">�˳���¼</a>
 </td>
</tr>
</s:if>
<s:if test="#session.user_level==3">
<tr>
<td> 
<a href=" <s:url action='showUser' method='showUser'/>" style="color:#666" target="rightFrame"">�ҵ���Ϣ</a>
 </td>
</tr>
<tr>
<td> 
<a href=" " style="color:#1c0756">�ҵĶ���</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='showMyMessageAction' method='showMyMessage'/>" target="rightFrame" style="color:#1c0756">�ҵ���Ʒ</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='LogoutAction' method='logout'/>" target="_top" style="color:#1c0756">�˳���¼</a>
 </td>
</tr>
</s:if>
</table>
</body>
</html>