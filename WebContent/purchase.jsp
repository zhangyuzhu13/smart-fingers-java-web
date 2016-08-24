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
		<tr>
			<td>订单id</td>
			<td>课程名称</td>
			<td>教师姓名</td>
			<td>课程价格</td>
			<td>已支付</td>
			
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
				</s:url>"  >删除</a>
    		</td>
    	</tr>
   	</s:if>
    </s:iterator>
    <tr>
    	<td><a href="<s:url action="PayOrderAction" method="payOrder">
				<s:param name="orders_id" value="#request.orders.id"></s:param>
				</s:url>"  >支付</a></td>
    </tr>
    <tr><td><a href="./index.jsp">返回首页</a></td></tr>
	</table>
</body>
</html>