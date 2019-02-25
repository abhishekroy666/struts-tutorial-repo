<%@taglib uri="/struts-tags" prefix="s2"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s2:form action="login">
		<s2:textfield name="lb.name" label="Username"></s2:textfield><br>
		<s2:textfield name="lb.pass" label="Password"></s2:textfield><br>
		<s2:submit value="Login"></s2:submit>
	</s2:form>
</body>
</html>