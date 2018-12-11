<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "/adminLogin" method="post">
		<input type = "text" id = "admin_id" name = "admin_id" placeholder="아이디를 입력해주세요">
		<input type = "password" id = "admin_pw" name = "admin_pw" placeholder="비밀번호를 입력해주세요">
		<input type = "submit" value = "로그인">
	</form>
</body>
</html>