<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>������԰�մ������ ��ͯ�ֹ�DIY����</title>

					<!-- validateName���õ�Ajax�ȱ����������ͷ������ -->
<script language="JavaScript">
	function validateName() {
		 return true;
	}
	 
</script>

</head>
<body>
	<s:form  action="RegisterAction">
			    <s:textfield id="user" name="user_name" label="�� �� ��" onblur="validateName()" /> 
			    <s:password name="user_password" label="�� ��" />
			    <s:password name="re_password" label="ȷ������" />
			    <s:textfield name="user_email" label="�����ʼ�" />
			    <s:hidden  name="user_level" value="3"/>
			    
		        <s:submit value="ע��" /> 
		    </s:form>
<s:if test="hasErrors()">
 		<s:actionerror/>
 	</s:if>
</body>
</html>