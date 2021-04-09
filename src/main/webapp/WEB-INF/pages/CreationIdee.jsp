<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Création d'une idée</title>
</head>
<body>

	<h2>Création d'une idée afin de la publier</h2>
	
	<div>
		<form action="" method="POST">
			<div>
				<label for="idee">Titre de l'idée</label>
				<input type="text" name="idee"/>
			</div>
			<div>
				<label for="description">Description de l'idée</label>
				<input type="text" name="description"/>
			</div>
			<div>
				<label for="categorie">Catégorie de l'idée</label>
				<input type="text" name="categorie"/>
			</div>
			<div>
				<label for="idee">Titre de l'idée</label>
				<input type="text" name="idee"/>
			</div>
			<div>
				<label for="image">Image</label>
				<input type="text" name="image"/>
			</div>
			<div>
				<button type="submit">Créer l'idée</button>
			</div>
		</form>
	</div>
</body>
</html>