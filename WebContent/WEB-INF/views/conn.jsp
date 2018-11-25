<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
</head>
<body>
<form class="form conn"  action="index.html"  method="post">
<div>
<c:if test="${error == 'error'}">
<p>Identifiant et/ou mot de passe incorrect ! Veuillez entrer des identifiants valides.</p>
</c:if>

<label for="username" >Identifiant :</label>
<input id="username" name="username" autocomplete="off">
</div>
<div>
<label for="password" >Mot de passe :</label>
<input id="password" name="password" type="password" autocomplete="off">
</div>

<button>Connexion</button>
<button type="reset">Effacer</button>
</form>
</body>
</html>