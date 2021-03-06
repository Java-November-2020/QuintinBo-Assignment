<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
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
<h1>Add a New Show to the List</h1>
<form:form action="/shows/new" method="post" modelAttribute="show">
    			<div class="form-group">
        			<form:label path="show_Name">Show</form:label>
        			<form:errors path="show_Name"/>
        			<form:input path="show_Name"/>
    			</div>
    			<div class="form-group">
        			<form:label path="network">Network</form:label>
        			<form:errors path="network"/>
        			<form:textarea path="network"/>
    			</div>
    				<input class="btn btn-primary" type="submit" value="Submit">    
			</form:form>
		</div>
</body>
</html>