<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cr�ation d'une id�e</title>
</head>
<body>

	<h2>Cr�ation d'une id�e afin de la publier</h2>
	
	<div>
		<form action="" method="POST">
			<div>
				<label for="idee">Titre de l'id�e</label>
				<input type="text" name="idee"/>
			</div>
			<div>
				<label for="description">Description de l'id�e</label>
				<input type="text" name="description"/>
			</div>
			<div>
				<label for="categorie">Cat�gorie de l'id�e</label>
				<input type="text" name="categorie"/>
			</div>
			<div>
				<label for="idee">Titre de l'id�e</label>
				<input type="text" name="idee"/>
			</div>
			<div>
				<label for="image">Image</label>
				<input type="text" name="image"/>
			</div>
			<div>
				<button type="submit">Cr�er l'id�e</button>
			</div>
		</form>
	</div>
</body>
</html>