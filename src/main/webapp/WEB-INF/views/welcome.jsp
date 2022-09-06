<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<html>
<head>
<title>Todos Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
<div class="container">
	<spring:message code="welcome.caption"/> ${name}. You are now authenticated.
	
</div>

<%@ include file="common/footer.jspf"%>

</body>
</html>