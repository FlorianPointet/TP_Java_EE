<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
</head>
<body>
	
	<div>
		<p>Inscription</p>
		
		<form action="" method="POST">
			<div>
				<label for="prenom">Prénom</label>
				<input type="text" name="prenom"/>
			</div>
			<div>
				<label for="nom">Nom</label>
				<input type="text" name="nom"/>
			</div>
			<div>
				<label for="mail">Email</label>
				<input type="email" name="mail"/>
			</div>
			<div>
				<label for="password">Mot de passe</label>
				<input type="password" name="password"/>
			</div>
			<div>
				<button type="submit">Inscription</button>
			</div>
		
		</form>
	</div>

</body>
</html>