<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyList</title>
</head>
<body>
여행사 회원등록 리스트
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
			<th>승인</th>
			<th>승인상태</th>
		</tr>
		<c:forEach var="company" items="${companyList}">
			<tr>
				<td>${company.company_no}</td>
				<td>${company.company_id}</td>
				<td>${company.company_name}</td>
				<td>${company.company_tell1}</td>
				<td>${company.company_tell2}</td>
				<td>${company.company_address}</td>
				<td>${company.company_business_no}</td>
				<td>${company.company_branch_tell}</td>
				<td>${company.company_head_tell}</td>
				<td>${company.company_check_date}</td>
				<td>
					<a href="/Travel/companyAuthInfo?company_id=${company.company_id}">승인</a>
				</td>
				<td>
					<c:if test="${company.company_auth eq 'true'}">승인됨</c:if>
					<c:if test="${company.company_auth eq 'false'}">미승인</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>