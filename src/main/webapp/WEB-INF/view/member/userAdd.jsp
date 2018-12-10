<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
일반회원 회원 가입  창
<form action = "/" method = "post" enctype="multipart/form-data">
<table>
	<tr>
		<td>아이디</td>
		<td>
			<input type = "text" id = "user_id" name = "user_id">
			<input type = "button" id = "user_id_check" name = "user_id_check" value="중복확인">
			${id_hepler}
		</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type = "password" id = "user_pw" name = "user_pw"></td>
	</tr>
	<tr>
		<td>비밀번호 확인</td>
		<td><input type = "password" id = "user_pw_check" name = "user_pw_check"></td>
	</tr>
	<tr>
		<td>닉네임</td>
		<td>
			<input type = "text" id = "user_nickname" name = "user_nickname">
			<input type = "button" id = "user_nickname_check" name = "user_nickname_check" value="중복확인">
			${nickname_helpler}
		</td>

	</tr>
	<tr>
		<td>생일</td>
		<td><input type = "date" id = "user_birth" name = "user_birth"></td>
	</tr>
	<tr>
		<td>성별</td>
		<td>
			<select name = "user_gender" id = "user_gender">
				<option name = "m">남</option>
				<option name = "f">여</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>주소</td>
		<td><input type = "text" id = "user_address" name = "user_address"></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type = "email" id = "user_email" name = "user_email"></td>
	</tr>
	<tr>
		<td>연락처</td>
		<td><input type = "text" id = "user_tell" name = "user_tell"></td>
	</tr>
	<tr>
		<td>이미지</td>
		<td><input type = "file" id = "user_img" name = "user_img"></td>
	</tr>
	<tr>
		<td></td>
		<td><input type = "submit" value = "입력완료"></td>
	</tr>
</table>
</form>

</body>
</html>