<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyLogin</title>
</head>
<body>
	여행사 로그인
	<form action="/Travel/companyLogin" method="post">
		<input type="text" id="company_id" name="company_id" placeholder="아이디를 입력해주세요">
		<input type="password" id="company_pw" name="company_pw" placeholder="비밀번호를 입력해주세요">
		<input type="submit" value="로그인">
	</form>
</body>
</html>