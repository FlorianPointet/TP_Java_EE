<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des idées</title>
</head>
<body>

	<h2>Liste des idées :</h2>

	<div>
		<table>
			<th>Nom</th>
			<th>Auteur</th>
			<th>Date</th>
			<th>Catégorie</th>
			<th>Description</th>
			<th>Note</th>
			<th>Commentaires</th>
				<c:forEach items="${listIdee}" var="idee">
					<td><c:out value="${idee.titre}"></c:out></td>
					<td><c:out value="${idee.user.mail}"></c:out></td>
					<td><c:out value="${idee.date}"></c:out></td>
					<td><c:out value="${idee.type}"></c:out></td>
					<td><c:out value="${idee.description}"></c:out></td>
					<td></td>
					<td><a href="NoteIdee?id=${idee.id}"></a></td>
				</c:forEach>
			
		</table>
	
	</div>
</body>
</html>