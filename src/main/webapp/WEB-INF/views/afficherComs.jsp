<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tout le monde</title>
</head>
<body>
	<br />
	<table>
		<tr>

			<td><a class="btn btn-primary btn-lg" href="/ProjetTest"
				role="button">Home</a></td>
			<td><a class="btn btn-primary btn-lg"
				href="/ProjetTest/lien/click" role="button">New Person</a></td>
			<td><a class="btn btn-primary btn-lg"
				href="/ProjetTest/lien/affichage" role="button">Show All</a></td>
		</tr>
	</table>

	<br />
	
	<div class="well well-lg col-md-offset-3 col-md-3">
		<h3><u>Information sur la personne</u></h3>
		<p><strong>Prénom :</strong> ${personne.prenom}</p>
		<p><strong>Nom :</strong> ${personne.nom}</p>
		<p><strong>Age :</strong> ${personne.age}</p>
	
	</div>
	<form class="col-md-12">
		<div class="form-group col-md-2 col-md-offset-3">
			<label for="pseudo">Pseudo</label> <input type="text"
				class="form-control" id="pseudo" placeholder="Pseudo">
		</div>
		<div class="form-group col-md-12 col-md-offset-4">
			<textarea class="col-md-4" rows="8"></textarea>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	
	


	<div class="list-group">

		<c:forEach var="item" items="${listeCommentaires}" varStatus="elm">

			<a href="#" class="list-group-item col-md-8 col-md-offset-2">

				<h4 class="list-group-item-heading">${item.pseudo}</h4>
				<p class="list-group-item-text">${item.commentaire}</p>
			</a>
		</c:forEach>

	</div>

</body>

</html>