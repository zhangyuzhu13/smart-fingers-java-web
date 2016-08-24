<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>银座·园艺创智天地 儿童手工DIY工坊</title>

					<!-- validateName中用到Ajax先保留在这里回头再完善 -->
<script language="JavaScript">
	function validateName() {
		 return true;
	}
	 
</script>

</head>
<body>
	<s:form  action="RegisterAction">
			    <s:textfield id="user" name="user_name" label="用 户 名" onblur="validateName()" /> 
			    <s:password name="user_password" label="密 码" />
			    <s:password name="re_password" label="确认密码" />
			    <s:textfield name="user_email" label="电子邮件" />
			    <s:hidden  name="user_level" value="3"/>
			    
		        <s:submit value="注册" /> 
		    </s:form>
<s:if test="hasErrors()">
 		<s:actionerror/>
 	</s:if>
</body>
</html>