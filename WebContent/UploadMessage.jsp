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
 
	<s:form action="${pageContext.request.contextPath }/UploadMessageAction.action" method="post" enctype="multipart/form-data">
 <tr>
    <s:file name="image"/>
    </tr>
    <tr>
    <s:textarea name="message_text" cols="70" rows="4"/>
    </tr>
    <tr>
    <s:submit value="ȷ������"/> 
	</tr>
 	</s:form>
 </table>
</body>
</html>