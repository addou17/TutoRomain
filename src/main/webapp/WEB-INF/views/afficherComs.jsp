<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

	<style>
#navigation {
	text-align: center;
}
</style>
	<br />
	<ul id="navigation" class="nav nav-pills">
		<li role="presentation"><a href="/ProjetTest">Home</a></li>
		<li role="presentation"><a href="/ProjetTest/lien/click">New
				Person</a></li>
		<li role="presentation"><a href="/ProjetTest/lien/affichage">Show
				All</a></li>
	</ul>

	<br />

	<div class="well well-lg col-md-offset-3 col-md-3">
		<h3>
			<u>Information sur la personne</u>
		</h3>
		<p>
			<strong>Prénom :</strong> ${personne.prenom}
		</p>
		<p>
			<strong>Nom :</strong> ${personne.nom}
		</p>
		<p>
			<strong>Age :</strong> ${personne.age}
		</p>

	</div>
	<form:form action="/ProjetTest/ajoutcommentaire" method="post"
		commandName="commentaire" class="col-md-12">
		<div class="form-group col-md-2 col-md-offset-4">
			<label for="pseudo">Pseudo</label>
			<form:input type="text" class="form-control" id="pseudo"
				path="pseudo" placeholder="Pseudo" />
		</div>
		<div class="form-group col-md-12 col-md-offset-4">
			<form:textarea class="col-md-4" rows="8"
				path="commentaire"/> 
		</div>

		<form:input type="hidden" path="idPersonne" autocomplete="off" />


		<div class="form-group col-md-12 col-md-offset-4">
			<form:button class="btn btn-default">Submit</form:button>
		</div>

	</form:form>




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