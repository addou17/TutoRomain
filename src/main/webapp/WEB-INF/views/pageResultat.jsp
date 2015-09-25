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
<br/>
<ul id="navigation" class="nav nav-pills">
	  <li role="presentation"><a href="/ProjetTest">Home</a></li>
	  <li role="presentation"><a href="/ProjetTest/lien/click">New Person</a></li>
	  <li role="presentation" class="active"><a href="/ProjetTest/lien/affichage">Show All</a></li>
	</ul>

<br/>
	
Salut <strong> <c:out value="${personne.prenom}"/> <c:out value="${personne.nom}"/> </strong> 


</body>
</html>