<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
Hi ${name} !!<br/>
Your Todos are <br/>

	<div class="container">
		<table class="table table-striped">
			<caption>Your Todos are</caption>

			<thead>
				<tr>
					<th>Description</th>
					<th>Date</th>
					<%--<th>Completed</th>--%>
					<th><th/>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td>${todo.targetDate}</td>
						<%--<td>${todo.Done}</td>--%>
						<th><a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a><th/>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<div class="btn btn-success">
		<a class="button" href="/add-todo">Add Todo</a>
	</div>
	</div>
	
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html> 

