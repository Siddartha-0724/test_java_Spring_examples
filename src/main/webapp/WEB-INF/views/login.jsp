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
	My first JSP is out with ${name}
<%@ page import="java.io.*"%>
<% 
	
	int a = 5+10;
    out.println(a);
    Date date = new Date();
%>
<div>Current date is asdas <%=date %></div>
</body>
</html> 