<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
<title>Welcome</title>
</head>
<body>
<div class="container">
	<h1>Add TODO</h1>
	<form method="post">
		<fieldset class="form-group">
			<label>Description</label>
			<input name = "desc" type="text" class="form-control" required="required"/>
		</fieldset>
		<input class ="btn btn-success"type = "submit" value="Add Todo" />
	</form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html> 