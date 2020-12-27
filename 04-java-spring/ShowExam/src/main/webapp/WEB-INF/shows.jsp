<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Find Your Favorite Shows</h1>
<a href="/logout">Logout</a>
<hr>
<table class="table table-dark table-hover">
	<thead>
		<tr>
			<th>Show Title</th>
			<th>Network</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${show}" var="show">
		<tr>
			<td><a href="/shows/${show.id}">${show.show_Name}</a></td>
		<tr>
			<td>${show.network}</td>
	</c:forEach>
	</tbody>
</table>
</div>
<a href="/shows/new" class="btn btn-primary">Add Show</a>
</body>
</html>