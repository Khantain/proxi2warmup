<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
<h1>Accueil</h1>
<c:forEach var="client" items="${clients}">
<div>
<h3>${client.prenom}</h3>
<h5>${client.nom}</h5>

</div>
</c:forEach>
</body>
</html>