<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo from JSP !!! Login Page</title>

</head>
<body>
${errorMessage}
<form action="/spring-mvc/login" method="POST">
Enter your name 
<input type="text" name="name"/>
Password
<input type="password" name="pass"/>

<input type="submit" value="Login"/>
</form>
</body>
</html> 