<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display License</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<h1>License Detail</h1>
<h2><c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/></h2>
<h3>License Number</h3>
	<p><c:out value="${person.license.id}"/></p>
<h3>State</h3>
	<p><c:out value="${person.license.state}"/></p>
<h3>Expiration Date</h3>
	<p><c:out value="${person.license.expiration_date}"/></p>
</body>
</html>