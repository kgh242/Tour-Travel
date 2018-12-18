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
<table border="1">
	<thead>
		<tr>
			<td>패키지 번호</td>
			<td>등록자</td>
			<td>목적국가</td>
			<td>제목</td>
			<td>여행시작일정</td>
			<td>여행종료일정</td>
			<td>모집인원</td>
			<td>신청마감일자</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="pack" items="${packList}">
			<tr>
				<td>${pack.pack_info_no}</td>
				<td>${pack.company_id}</td>
				<td>${pack.pack_info_country}</td>
				<td><a href="/Travel/packGetInfo?pack_info_no=${pack.pack_info_no}">${pack.pack_info_title}</a></td>
				<td>${pack.pack_info_start_date}</td>
				<td>${pack.pack_info_end_date}</td>
				<td>${pack.pack_info_person_number}</td>
				<td>${pack.pack_info_closing_date}</td>
			</tr>
		</c:forEach>
	
	</tbody>


</table>


</body>
</html>