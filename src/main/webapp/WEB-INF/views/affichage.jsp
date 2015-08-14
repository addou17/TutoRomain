<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tout le monde</title>
</head>
<body>

	<h1>Les personnes présents sont:</h1>
	<table border=1>
		<tr>
			<td>ID</td>
			<td>Nom</td>
			<td>prénom</td>
			<td>Age</td>
		</tr>
		<c:forEach var="item" items="${toutLeMonde}" varStatus="elm">
			<tr>
				<td>${item.id}</td>
				<td>${item.nom}</td>
				<td>${item.prenom}</td>
				<td>${item.age}</td>
			</tr>

		</c:forEach>
	</table>
</body>

</html>