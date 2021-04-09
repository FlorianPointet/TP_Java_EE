<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>

	<div>
		<p>Connectez vous :</p>
	
		<form action="" method="POST">
			<div>
				<label for="email">Email :</label>
				<input type="email" name="email"/>
			</div>
			
			<div>
				<label for="mdp">Mot de passe :</label>
				<input type="password" name="mdp"/>
			</div>
			<div>
				<button type="submit">Se connecter</button>
			</div>
			
			<div>
				<p> Pas encore inscrit ? </p>
				<a href="Inscription">S'inscrire</a>
			</div>
			
		
		</form>
	</div>
</body>
</html>