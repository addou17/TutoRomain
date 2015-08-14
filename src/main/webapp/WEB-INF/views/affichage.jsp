<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tout le monde</title>
</head>
<body>
<br/>
<table><tr>

<td><a class="btn btn-primary btn-lg" href="/ProjetTest" role="button">Home</a></td>
<td><a class="btn btn-primary btn-lg" href="/ProjetTest/lien/click" role="button">New Person</a></td>
<td><a class="btn btn-primary btn-lg" href="/ProjetTest/lien/affichage" role="button">Show All</a></td>
</tr>
</table>

<br/>
	
	
	
	
	<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">Les personnes présents sont:</div>

  <!-- Table -->
  <table class="table">
   		<tr>
			<th>ID</th>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Age</th>
			<th></th>
			
		</tr>
		<c:forEach var="item" items="${toutLeMonde}" varStatus="elm">
			<tr>
				<td>${elm.index + 1}</td>
				<td>${item.nom}</td>
				<td>${item.prenom}</td>
				<td>${item.age}</td>
				<td><a href='/ProjetTest/lien/update/<c:out value="${item.id}"/>'><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
				<a href='/ProjetTest/lien/delete/<c:out value="${item.id}"/>'><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></a></td>
			</tr>

		</c:forEach>
  </table>
</div>
	
	
	
	
</body>

</html>