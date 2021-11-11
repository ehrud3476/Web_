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
	<title>회원가입창</title>
</head>
<body> 
<div class="container">
	<h2>게시글작성</h2> 
	<form method="post" action="insertPost.do" class="form-horizontal">
			<div class="form-group">
				<div class="col-sm-4">
					제목 : <input type="text" name ="title" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10"  >				
					내용 : <textarea rows="5" cols="30" id="content" name="content" class="form-control"></textarea>
					
				</div>
			</div>
			
			
			<input type="submit" value="작성하기">
			<input type="reset" value="다시입력">
			<input type="button" value="홈으로" onclick="location.href='index.html'">
			<br><br>
	</form>
</div>
</body>
</html>
