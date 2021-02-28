<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<h1>Register for License</h1>
	<hr>
		<form:form action="/license/new" method="POST" modelAttribute="license">
		<div class = "form-group">
		<form:label path="person">Who is getting their license?</form:label>
		<form:errors path="person"/>
		<form:select path="person">
		<c:forEach items="${person}" var = "person">
			<option value="${person.id}">${person.firstName} ${person.lastName}</option>
		</c:forEach>
		</form:select>
		</div>
		<div class="form-group">
		        <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:input path="state"/>
		    </div>
		    <div class="form-group">
		        <form:label path="expiration_date">Expiration Date</form:label>
		        <form:errors path="expiration_date"/>
		        <form:input path="expiration_date"/>
		    </div>
		    <button>Add License</button>
		</form:form>
</body>
</html>