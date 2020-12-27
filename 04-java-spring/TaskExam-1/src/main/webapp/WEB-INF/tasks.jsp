<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Current Assigned Tasks</h1>
		
		<table class="table table-dark table-hover">
			<thead>
				<tr>
					<th>Task</th>
					<th>Creator</th>
					<th>Assignee</th>
					<th>Priority</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${task}" var="task">
					<tr>
						<td><a href="/task/${task.taskId}">${task.taskName}</a></td>
						<td>${task.taskCreator}</td>
						<td>${task.taskAssignee}</td>
						<td>${task.priority}</td>
						</c:forEach>
			</tbody>
		</table>	
</div>
<a href="/tasks/create" class="btn btn-primary">Create a New Task</a>
</body>
</html>