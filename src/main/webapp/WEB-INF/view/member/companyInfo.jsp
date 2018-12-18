<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyInfo</title>
</head>
<body>
여행사 회원 내 정보 보기
	<c:if test="${LOGINID == null}">
		로그인 후 사용해주세요
	</c:if>
	<c:if test = "${LOGINID != null}">
		${LOGINID}!! LOGIN <br>
		<a href="/Travle/companyLogout">로그아웃</a>
	</c:if>
	<table>
		<tr>
			<td></td>
		</tr>
	
	
	</table>
</body>
</html>