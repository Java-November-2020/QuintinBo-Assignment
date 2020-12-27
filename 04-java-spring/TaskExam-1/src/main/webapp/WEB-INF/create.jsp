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
<h1>Add a New Task to the List</h1>
<form:form action="/task/create" method="post" modelAttribute="task">
    			<div class="form-group">
        			<form:label path="taskName">Task</form:label>
        			<form:errors path="taskName"/>
        			<form:input class="form-control" path="taskName"/>
    			</div>
    			<div class="form-group">
					<select name="taskAssignee" id="taskAssignee">
						<option value ="">Assign task to:</option>
						<c:forEach items="${user_Name}" var="users">
						<option value="${user.userId}">${user.user_Name}</option>
						</c:forEach>
					</select>
				</div>
    			<div class="form-group">
    				<label for="priority">Priority Level:</label>
					<select name="priority" id="priority">
  						<option value="High">High</option>
  						<option value="Medium">Medium</option>
  						<option value="Low">Low</option>
					</select>
    			</div>
    				<input class="btn btn-primary" type="submit" value="Submit">    
			</form:form>
		</div>
</body>
</html>