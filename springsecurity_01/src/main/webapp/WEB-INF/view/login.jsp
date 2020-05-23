<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

	<head>
		<title> CUSTOM LOGIN PAGE</title>
	</head>

	<body>
		<h3> MY CUSTOM LOGIN PAGE</h3>
	
		<form:form action="${pageContext.request.contextPath}/authenticateUser"
				   method="POST">
				   
			<p>
				User name: <input type="text" name="username" />
			</p>
			<p>
				Password: <input type="password" name="password" />
			</p>
			<input type="submit" value="Login" />
		</form:form>
	
	</body>
</html>