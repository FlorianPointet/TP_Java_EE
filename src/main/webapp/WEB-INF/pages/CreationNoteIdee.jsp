<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donner une note à une idée</title>
</head>
<body>

		<h2>Laissez un commentaire !</h2>
		
		<div>
			<form action="" method="POST">
				<div>
					<input type="hidden" name="idIdee" value="${id}"/>
					<input type="hidden" name="note" value="${note}"/>
				</div>
				<div>
					<label for="commentaire">Commentaire</label>
					<textarea name="commentaire"></textarea>
				</div>
				<div>
					<button type="submit">Laisser ce commentaire</button>
				</div>
				
			
			
			</form>
		</div>

</body>
</html>