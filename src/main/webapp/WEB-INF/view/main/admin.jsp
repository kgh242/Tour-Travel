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
		<a href="/Travel/adminUpdate?LOGINID=${LOGINID}"> ${LOGINID}</a> 님 로그인중 .. 
		<a href="/Travel/adminList">관리자조회</a><br><br>
		<a href="/Travel/userList">회원조회</a>
		<a href="/Travel/companyList">여행사조회</a>
		<a href="/Travel/adminLogout">로그아웃</a>
	</c:if>
	<c:if test="${LOGINID == null}">
		<a href="/Travel/adminLogin">로그인</a><br>
		<a href="/Travel/adminAdd">회원가입</a>
	</c:if>
</body>
</html>