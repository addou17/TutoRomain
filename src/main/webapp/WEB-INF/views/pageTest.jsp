<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My wonderful page</title>
</head>
<body>

You have clicked on the link


<form:form action="click" method="post" commandName="personne">

	<p>Nom : <form:input type="text" path="nom"/></p>
	<p>Prenom : <form:input path="prenom"/></p>
	<p>Age : <form:input path="age"/></p>
	
	<form:button>Submit</form:button>

</form:form>

</body>
</html>