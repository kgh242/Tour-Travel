<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${LOGINID != null}">
		관리자 페이지 
		<a href="/adminUpdate?LOGINID=${LOGINID}"> ${LOGINID}</a> 님 로그인중 .. 
		<a href="/adminList">관리자조회</a><br><br>
		<a href="/adminLogout">로그아웃</a>
	</c:if>
	<c:if test="${LOGINID == null}">
		<a href="/adminLogin">로그인</a><br>
		<a href="/adminAdd">회원가입</a>
	</c:if>
</body>
</html>