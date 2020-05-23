<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
	<head>
		<title> WELCOME </title>
	</head>
	<body>
		Welcome to the website
	</body>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
	
		<input type="submit" value="Logout" />
	</form:form>
</html>