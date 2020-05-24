<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>WELCOME</title>
</head>
<body>
	Welcome to the web site


	<!--  Display the user name and role -->

	<hr>

	<p>
		User: <security:authentication property="principal.username" />
		<br> <br> 
		Role(s): <security:authentication property="principal.authorities" />
	</p>

	<hr>

	<p>
		<a href="${pageContext.request.contextPath}/leaders"> Leadership Meeting</a>
	</p>

	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">

		<input type="submit" value="Logout" />
	</form:form>

</body>
</html>