<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyList</title>
</head>
<body>
여행사 회원등록 신청 리스트
<form action="/companyAuth" method="post">
	<table border="1">
		<tr>
			<th>여행사번호</th>
			<th>아이디</th>
			<th>해당회사(지점)</th>
			<th>담당자 연락처1</th>
			<th>담당자 연락처2</th>
			<th>회사주소</th>
			<th>사업자번호</th>
			<th>회사대표연락처</th>
			<th>본사연락처</th>
			<th>신청날짜</th>
			<!---->
			<th>유선번호확인</th>
			<th>사업자번호확인</th>
			<th>대표자확인</th>
			<th>주소확인</th>
			<th>가입승인여부</th>
			<th>저장</th>
		</tr>
		<c:forEach var="row" items="${list}">
		<tr>
			<td>${row.company_no}</td>
			<td>${row.company_id}</td>
			<td>${row.company_name}</td>
			<td>${row.company_tell1}</td>
			<td>${row.company_tell2}</td>
			<td>${row.company_address}</td>
			<td>${row.company_business_no}</td>
			<td>${row.company_branch_tell}</td>
			<td>${row.company_head_tell}</td>
			<td>${row.company_check_date}</td>
			<!---->
			<td>
				<input type="text" id="company_check_tell" value="${row.company_check_tell}">
			</td>
			<td>
				<input type="text" id="company_check_business_no" value="${row.company_check_business_no}">
			</td>
			<td>
				<input type="text" id="company_check_ceo" value="${row.company_check_ceo}">
			</td>
			<td>
				<input type="text" id="company_check_address" value="${row.company_check_address}">
			</td>
			<td>
				<input type="radio" name="company_check_" value="1">승인<br>
				<input type="radio" name="company_check_" value="0">미승인
			</td>
			<td>
				<input type="submit" id="submit" value="저장">
			</td>
		</tr>
		</c:forEach>
	</table>


</form>
	
</body>
</html>