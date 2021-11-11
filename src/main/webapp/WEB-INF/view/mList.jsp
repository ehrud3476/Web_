<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h2>목록</h2>
	<table class="table">	
		<tr>	
			<th>id</th>
			<th>name</th>
			<th>email</th>
			<th>joinDate</th>
		</tr>
		<c:forEach var='dto' items="${dtos}">
			<tr>
				<td><a href= "view.do?id=${dto.id}">${dto.id}</a> </td>
				<td>${dto.name }</td>
				<td>${dto.email }</td>
				<td><fmt:formatDate value="${dto.joindate }" /></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>
