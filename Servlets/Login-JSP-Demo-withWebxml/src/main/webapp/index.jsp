<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	
	/* String configUserName = config.getInitParameter("username");
	out.println(configUserName);
	
	out.println(application.getInitParameter("username1")); */
	
	if (userName.equals("admin")) {
		out.println("Welcome Admin....");
	} else {
		out.println("Invalid user name....");
	}
	%>

</body>
</html>