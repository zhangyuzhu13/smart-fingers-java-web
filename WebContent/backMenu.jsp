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
<table>
<s:if test="#session.user_level==1">
<tr>
<td> 
<a href="<s:url action='showUser' method='showUser'/>" style="color:#666" target="rightFrame">用户管理</a>
</td>
</tr>
<tr>
<td> 
<a href="<s:url action='ShowCourseAction' method='showCourse'/>"  target="rightFrame" style="color:#1c0756">课程管理</a>
 </td>
</tr>
<tr>
<td> 
<a href="./deleteMessage.jsp" target="rightFrame" style="color:#1c0756">留言管理</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='LogoutAction' method='logout'/>" target="_top" style="color:#1c0756">退出登录</a>
 </td>
</tr>
</s:if>
<s:if test="#session.user_level==2">
<tr>
<td> 
<a href="<s:url action='showUser' method='showUser'/>" style="color:#666" target="rightFrame">我的信息</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='showMyCourse' method='showMyCourse'/>" target="rightFrame" style="color:#1c0756">我的课程</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='LogoutAction' method='logout'/>" target="_top" style="color:#1c0756">退出登录</a>
 </td>
</tr>
</s:if>
<s:if test="#session.user_level==3">
<tr>
<td> 
<a href=" <s:url action='showUser' method='showUser'/>" style="color:#666" target="rightFrame"">我的信息</a>
 </td>
</tr>
<tr>
<td> 
<a href=" " style="color:#1c0756">我的订单</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='showMyMessageAction' method='showMyMessage'/>" target="rightFrame" style="color:#1c0756">我的作品</a>
 </td>
</tr>
<tr>
<td> 
<a href="<s:url action='LogoutAction' method='logout'/>" target="_top" style="color:#1c0756">退出登录</a>
 </td>
</tr>
</s:if>
</table>
</body>
</html>