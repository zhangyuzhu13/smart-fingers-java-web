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
我的作品：
 
    <table>
    <tr height=35px bgcolor=#eeeeee>
    	<td align=center>作品id</td>
    	<td align=center>作品评论</td>
    	<td align=center>成果展示</td>
    	<td align=center>评论日期</td>
    </tr>
    <s:iterator id="messages" value="#request.messages">
    <s:if test="#messages.id!=null" >
    	<tr height=35px bgcolor=#eeeeee>
    		<td align=center><s:property value="#messages.id" /></td>
    		<td align=center><s:property value="#messages.message_text" /></td>
    		<td align=center>
    		<img src="${pageContext.request.contextPath}/images/messages/<s:property value='#messages.message_image_path'/>" height="200" width="200">
    		</td>
    		<td align=center><s:property value="#messages.message_date" /></td>
    	</tr>
   	</s:if>
    </s:iterator>
	<s:form action="deleteMessage" method="deleteMessage">
	 	<s:textfield name="message_id" label="输入要删除作品id"/>
	 	<s:submit value="确认删除"/>
	 
	 </s:form>
    </table>
    
   
</body>
</html>