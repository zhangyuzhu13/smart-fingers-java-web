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
		<tr>
			<td>����id</td>
			<td>�γ�����</td>
			<td>��ʦ����</td>
			<td>�γ̼۸�</td>
			<td>��֧��</td>
			
		</tr>
	<s:iterator id="orders" value="#request.orders">
    <s:if test="#orders.id!=null" >
    	<tr height=35px bgcolor=#eeeeee>
    		<td align=center><s:property value="#orders.id" /></td>
    		<td align=center><s:property value="#orders.course.course_name" /></td>
    		<td align=center><s:property value="#orders.course.teacher.user_name" /></td>
    		<td align=center><s:property value="#orders.course.course_price" /></td>
    		<td align=center><s:property value="#orders.is_pay" /></td>
    		<td><a href="<s:url action="deleteOrderAction" method="deleteOrder">
				<s:param name="order_id" value="#orders.id"></s:param>
				</s:url>"  >ɾ��</a>
    		</td>
    	</tr>
   	</s:if>
    </s:iterator>
    <tr>
    	<td><a href="<s:url action="PayOrderAction" method="payOrder">
				<s:param name="orders_id" value="#request.orders.id"></s:param>
				</s:url>"  >֧��</a></td>
    </tr>
    <tr><td><a href="./index.jsp">������ҳ</a></td></tr>
	</table>
</body>
</html>