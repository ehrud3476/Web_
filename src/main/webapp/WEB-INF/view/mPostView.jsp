<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>  

   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<title>게시판</title>
	<link rel="stylesheet" type="text/css" href="css/board.css">
</head>
<body>
<div class="container">
	<h2>상세보기</h2>
	<br/>
	<form action="Pupdate.do" method="post">
		<input type="hidden" value="${dto.joindate}" name="joindate">
		<input type="hidden" value="${dto.title}" name="title">
		<table class="table table-striped table-hover">
		
			<tr>
				<th>제목</th><td>${dto.title}</td>
				
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="5" cols="30" id="content" name="content" class="form-control">${dto.content}</textarea></td>
				
			</tr>
			<tr>
				<th>joinDate</th><td>${dto.joindate}</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" value ="게시글 수정" >
					<input type="button" value ="게시글 삭제" onclick ="location.href='Pdelete.do?title=${dto.title}'">
					<input type="button" value ="게시글 목록" onclick ="location.href='Plist.do'">
					<input type="button" value ="게시글 등록" onclick ="location.href='post.do'">
				</td>
			</tr>
		</table><br><br>
	</form>
</div>
</body>
</html>