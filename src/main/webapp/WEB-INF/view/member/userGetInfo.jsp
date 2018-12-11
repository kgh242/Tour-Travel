<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${LOGINID == null}">
		로그인 후 사용해주세요
	</c:if>
	<c:if test="${LOGINID != null}">
		${LOGINID}!! LOGIN <br>
		<a href="/userLogout">LOGOUT</a>
	</c:if>
	<table>
		<thead>
			<tr>
				<td>아이디</td>
				<td>닉네임</td>
				<td>주소</td>
				<td>이메일</td>
				<td>연락처</td>
				<td>자기소개</td>
				<td>회원프로필사진</td>
				<td>인증신청</td>
				<td>수정</td>
				<td>탈퇴</td>
				
			</tr>
		</thead>
		<tbody>

			<tr>
				<td></td>
				<td>${userDTO.user_nickname}</td>
				<td>${userDTO.user_address}</td>
				<td>${userDTO.user_email}</td>
				<td>${userDTO.user_tell}</td>
				<td>${userDTO.user_introduction}</td>
			</tr>

		</tbody>
	</table>

</body>
</html>