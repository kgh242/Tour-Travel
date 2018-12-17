<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
	function auth() {
		if (confirm("인증을 신청하시겠습니까?")) {
			location.href = "/userAuth?user_id=${userDTO.user_id}";
		} else {
			alert('취소하셨습니다');
		}
	}
	
	function dlt() {
		if (confirm("탈퇴하시겠습니까??")) {
			location.href = "/userDelete?user_id=${userDTO.user_id}";
		} else {
			alert('취소하셨습니다');
		}
	}
</script>
</head>
<body>
	<c:if test="${LOGINID == null}">
		로그인 후 사용해주세요
	</c:if>
	<c:if test="${LOGINID != null}">
		${LOGINID}!! LOGIN <br>
		<a href="/Travel/userLogout">LOGOUT</a>
	</c:if>
	<table>
		<thead>
			<tr>
				<td>아이디</td>
				<td>닉네임</td>
				<td>이름</td>
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
			<c:if test="${LOGINID != null}">
			<tr>
				<td>${userDTO.user_id}</td>
				<td>${userDTO.user_nickname}</td>
				<td>${userDTO.user_name}</td>
				<td>${userDTO.user_address}</td>
				<td>${userDTO.user_email}</td>
				<td>${userDTO.user_tell}</td>
				<td>${userDTO.user_introduction}</td>
				<td></td>
				<td>
					<a href="#" onclick="auth();">회원인증신청</a>
				</td>
				<td>
					<form name="userUpdate" action="/userUpdate" method="POST">
						<input type="hidden" name="user_id" value="${userDTO.user_id}" />
						<input type="hidden" name="user_nickname" value="${userDTO.user_nickname}" />
						<input type="hidden" name="user_address" value="${userDTO.user_address}" />
						<input type="hidden" name="user_email" value="${userDTO.user_email}" />
						<input type="hidden" name="user_tell" value="${userDTO.user_tell}" />
						<input type="hidden" name="user_introduction" value="${userDTO.user_introduction}" />
					</form>
					<a href="#" onclick="javascript:document.userUpdate.submit();">수정</a>
				</td>
				<td>
					<a href="#" onclick="dlt();">탈퇴</a>
				</td>

</div>

			</tr>
			</c:if>

		</tbody>
	</table>
<img src="" width='100' height='100'/>
</body>
</html>