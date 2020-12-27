<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<h1>Delegate Tasks</h1>
		<div class="row">
			<div class="col">
				<h4>Login Information</h4>
				<label for="loginemail">Email</label>
				<form method ="Post" action ="/login">
				<input type ="text" id="loginemail" name ="loginemail">
				<label for="loginpassword">Password</label>
				<input type ="text" id="loginpassword" name ="loginpassword">
				<button>Login</button>
				</form>
			</div>
		<div class="col">
				<h2>Register</h2>
			<form:form action="/register" method="post" modelAttribute="user">
    			<div class="form-group">
        			<form:label path="user_Name">Name</form:label>
        			<form:errors path="user_Name"/>
        			<form:input path="user_Name"/>
    			</div>
    			<div class="form-group">
        			<form:label path="email">Email</form:label>
        			<form:errors path="email"/>
        			<form:input type="email" class="form-control" path="email"/>
    			</div>
    			<div class="form-group">
        			<form:label path="password">Create Password</form:label>
        			<form:errors path="password"/>     
        			<form:input type="password" class="form-control" path="password"/>
    			</div>
    			<div class="form-group">
        			<form:label path="confirmPassword">Confirm Password</form:label>
       			 	<form:errors path="confirmPassword"/>     
        			<form:input type="confirmPassword" class="form-control" path="confirmPassword"/>
    			</div>
    				<input class="btn btn-primary" type="submit" value="Submit">    
			</form:form>
		</div>
	</div>
	</div>
</body>
</html>