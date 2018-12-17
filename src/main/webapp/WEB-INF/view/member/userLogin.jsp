<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action = "/Travel/userLogin" method="post">
	<input type = "text" id = "user_id" name = "user_id" placeholder="아이디를 입력해주세요">
	<input type = "password" id = "user_pw" name = "user_pw" placeholder="비밀번호를 입력해주세요">
	<input type = "submit" value = "로그인">
</form>

</body>
</html>