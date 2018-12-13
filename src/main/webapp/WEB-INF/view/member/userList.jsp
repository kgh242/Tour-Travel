<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>
유저리스트
<table border="1">
	<thead>
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>닉네임</td>
			<td>이름</td>
			<td>생일</td>
			<td>성별</td>
			<td>주소</td>
			<td>이메일</td>
			<td>연락처</td>
			<td>가입날짜</td>
			<td>최종개인정보수정날짜</td>
			<td>최종비밀번호수정날짜</td>
			<td>자기소개</td>
			<td>본인인증신청여부</td>
			<td>본인인증신청/승인날짜</td>
			<td>승인자아이디</td>
			<td>보유포인트</td>
			<td>탈주이력</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="user" items="${userList}">
			<tr>
				<td>${user.user_no}</td>
				<td>${user.user_id}</td>
				<td>${user.user_nickname}</td>
				<td>${user.user_name}</td>
				<td>${user.user_birth}</td>
				<td>${user.user_gender}</td>
				<td>${user.user_address}</td>
				<td>${user.user_email}</td>
				<td>${user.user_tell}</td>
				<td>${user.user_join_date}</td>
				<td>
					<c:if test="${user.user_update_date == null}">
						정보없음
					</c:if>
					<c:if test="${user.user_update_date != null}">
						${user.user_update_date}
					</c:if>
				</td>
				<td>
					<c:if test="${user.user_pw_date == null}">
						정보없음
					</c:if>
					<c:if test="${user.user_pw_date != null}">
						${user.user_pw_date}
					</c:if>
				</td>
				<td>${user.user_introduction}</td>
				<td>
					<c:if test="${user.user_auth == null}">
						신청정보없음
					</c:if>
					<c:if test="${user.user_auth == false}">
						승인대기중
					</c:if>
					<c:if test="${user.user_auth == true}">
						승인완료
					</c:if>
				</td>
				<td>
					<c:if test="${user.user_auth_date == null}">
						신청정보없음
					</c:if>
					<c:if test="${user.user_auth_date != null}">
						${user.user_auth_date}
					</c:if>
				</td>
				<td>					
					<c:if test="${user.admin_id == null}">
						승인자정보없음
					</c:if>
					<c:if test="${user.admin_id != null}">
						${user.user_auth_date}
					</c:if>
				</td>
				<td>${user.user_point}</td>
				<td>${user.user_escape}</td>
			</tr>
		</c:forEach>
	
	</tbody>


</table>

</body>
</html>