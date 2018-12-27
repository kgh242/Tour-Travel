<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
일반회원 내 정보 보기
<form action = "/Travel/" method = "post" enctype="multipart/form-data">
<table>
	<tr>
		<td>아이디</td>
		<td>${UserDTO.user_id}</td>
	</tr>
	<tr>
		<td>닉네임</td>
		<td>${UserDTO.user_nickname}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${UserDTO.user_name}</td>
	</tr>
	<tr>
		<td>생일</td>
		<td>${UserDTO.user_birth}</td>
	</tr>
	<tr>
		<td>성별</td>
		<td>${UserDTO.user_gender}</td>
	</tr>
	<tr>
		<td>주소</td>
		<td>${UserDTO.user_address}</td>
	</tr>
	<tr>
		<td>이메일</td>
		<td>${UserDTO.user_email}</td>
	</tr>
	<tr>
		<td>연락처</td>
		<td>${UserDTO.user_tell}</td>
	</tr>
</table>
</form>

</body>
</html>