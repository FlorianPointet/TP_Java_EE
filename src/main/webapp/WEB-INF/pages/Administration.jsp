<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administration</title>
</head>
<body>

	<div>
		<h2>Gestion des inscriptions</h2>
		<table>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Email</th>
			<th>Approuvé</th>
				<c:forEach items="${listeInscription}" var="inscription">
					<tr>
						<td><c:out value="${inscription.nom}"></c:out></td>
						<td><c:out value="${inscription.prenom}"></c:out></td>
						<td><c:out value="${inscription.mail}"></c:out></td>
						<td>
							<form method="POST">
								<button type="submit">Approuver</button>
							</form>
						</td>
					</tr>
				</c:forEach>
		</table>
	</div>

</body>
</html>