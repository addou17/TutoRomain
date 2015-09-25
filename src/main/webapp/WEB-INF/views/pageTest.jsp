<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<title>My wonderful page</title>
</head>
<body>
<br/>
	<ul id="navigation" class="nav nav-pills">
	  <li role="presentation"><a href="/ProjetTest">Home</a></li>
	  <li role="presentation" class="active"><a href="/ProjetTest/lien/click">New Person</a></li>
	  <li role="presentation"><a href="/ProjetTest/lien/affichage">Show All</a></li>
	</ul>
	<p>
	<center>
		<h1>Ajout d'une personne</h1>
	</center>
	</p>

	<form:form action="/ProjetTest/lien/click" method="post"
		commandName="personne" class="form-horizontal">

		<form:input type="hidden" class="form-control" path="id" autocomplete="off" />

		<div class="form-group">
			<form:label path="prenom"
				class="col-sm-2 control-label col-sm-offset-2">Prenom</form:label>
			<div class="col-sm-4">
				<form:input type="text" class="form-control" path="prenom"
					id="prenom" autocomplete="off" />
			</div>
		</div>

		<div class="form-group">
			<form:label path="nom" class="col-sm-2 control-label col-sm-offset-2">Nom</form:label>
			<div class="col-sm-4">
				<form:input type="text" class="form-control" path="nom" id="nom"
					autocomplete="off" />
			</div>
		</div>

		<div class="form-group">
			<form:label path="age" class="col-sm-2 control-label col-sm-offset-2">Age</form:label>
			<div class="col-sm-4">
				<form:input type="text" class="form-control" path="age" id="age"
					autocomplete="off" />
			</div>
		</div>

		<form:button class="btn btn-primary col-sm-1 col-sm-offset-5">Submit</form:button>

	</form:form>

</body>
</html>