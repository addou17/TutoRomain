<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<title>Resultat</title>
</head>
<body>
<table><tr>

<td><a class="btn btn-primary btn-lg" href="/ProjetTest" role="button">Home</a></td>
<td><a class="btn btn-primary btn-lg" href="/ProjetTest/lien/click" role="button">New Person</a></td>
<td><a class="btn btn-primary btn-lg" href="/ProjetTest/lien/affichage" role="button">Show All</a></td>
</tr>
</table>

<br/>
	
Salut <strong> <c:out value="${personne.prenom}"/> <c:out value="${personne.nom}"/> </strong> 


</body>
</html>