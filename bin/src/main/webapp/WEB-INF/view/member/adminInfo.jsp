<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
관리자 내 정보 보기
		<form action = "/adminUpdate" method = "post" >
		<table>
			<tr>
				<td>아이디</td>
				<td>
					<input type = "text" id = "admin_id" name = "admin_id" value="${admin.admin_id}" readonly="readonly">
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
				<td><input type = "text" id = "admin_level" name = "admin_level" value="${admin.admin_level}"></td>
			</tr>
			<tr>
				<td>담당부서</td>
				<td><input type = "text" id = "admin_team" name = "admin_team" value="${admin.admin_team}"></td>
			</tr>
			<tr>
				<td>사원번호</td>
				<td><input type = "text" id = "admin_employee_no" name = "admin_employee_no" value="${admin.admin_employee_no}"></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type = "text" id = "admin_employee_tell" name = "admin_employee_tell" value="${admin.admin_employee_tell}"></td>
			</tr>
			<tr>
				<td><input type = "submit" value = ""></td>
				<td><a href="">뒤로가기</a>
			</tr>
		</table>
	</form>
</body>
</html>