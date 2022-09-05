<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>

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
						<td><fmt:formatDate pattern="dd/MM/yyyy"
									value="${todo.targetDate}" />
						</td>
						<%--<td>${todo.Done}</td>--%>
						<th><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a><th/>
						<th><a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a><th/>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<div class="btn btn-success">
		<a class="button" href="/add-todo">Add Todo</a>
		
	</div>
	</div>
	
<%@ include file="common/footer.jspf" %>
</body>
</html> 

