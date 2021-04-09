<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notes des idées</title>
</head>
<body>

	<h2>Voici les différentes notes/commentaire des idées</h2>


	<table>
		<th>Titre de l'idée</th>
		<th>Nom</th>
		<th>Prénom</th>
		<th>Note</th>
		<th>Commentaire</th>
			<c:forEach items="listeNoteIdee" var="noteIdee">
				<tr>
					<td><c:out value="${noteIdee.idee.titre}"></c:out></td>
					<td><c:out value="${noteIdee.user.nom}"></c:out></td>
					<td><c:out value="${noteIdee.user.prenom}"></c:out></td>
					<td><c:out value="${noteIdee.note.nom}"></c:out></td>
					<td><c:out value="${noteIdee.commentaire}"></c:out></td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>