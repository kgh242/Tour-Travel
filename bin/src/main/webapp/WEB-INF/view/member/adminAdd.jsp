<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin add</title>
</head>
<body>
	<form action = "/adminAdd" method = "post" >
		<table>
			<tr>
				<td>아이디</td>
				<td>
					<input type = "text" id = "admin_id" name = "admin_id">
					<input type = "button" id = "admin_id_check" name = "admin0_id_check" value="중복확인">
					${id_hepler}
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type = "password" id = "admin_pw" name = "admin_pw"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type = "password" id = "admin_pw_check" name = "admin_pw_check"></td>
			</tr>
			<tr>
				<td>권한</td>
				<td><input type = "text" id = "admin_level" name = "admin_level"></td>
			</tr>
			<tr>
				<td>담당부서</td>
				<td><input type = "text" id = "admin_team" name = "admin_team"></td>
			</tr>
			<tr>
				<td>사원번호</td>
				<td><input type = "text" id = "admin_employee_no" name = "admin_employee_no"></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type = "text" id = "admin_employee_tell" name = "admin_employee_tell"></td>
			</tr>
			<tr>
				<td colspan="1"><input type = "submit" value = "입력완료"></td>
			</tr>
		</table>
	</form>
</body>
</html>