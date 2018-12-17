<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyAuth</title>
</head>
<body>
	여행사 회원등록 리스트
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
			<th>유선번호확인</th>
			<th>사업자번호확인</th>
			<th>대표자확인</th>
			<th>주소확인</th>
			<th>가입승인여부</th>
			<th>승인</th>
			<th>승인자</th>
			<th>승인날짜</th>
		</tr>
			<tr>
				<td>${companyDTO.company_no}</td>
				<td>${companyDTO.company_id}</td>
				<td>${companyDTO.company_name}</td>
				<td>${companyDTO.company_tell1}</td>
				<td>${companyDTO.company_tell2}</td>
				<td>${companyDTO.company_address}</td>
				<td>${companyDTO.company_business_no}</td>
				<td>${companyDTO.company_branch_tell}</td>
				<td>${companyDTO.company_head_tell}</td>
				<td>${companyDTO.company_check_date}</td>
				<td>
					<input type="hidden" id="company_id" name="company_id" value = "${companyDTO.company_id}">
					<input type="text" id="company_check_tell" name="company_check_tell" value="${companyDTO.company_check_tell}">
				</td>
				<td>
					<input type="text" id="company_check_business_no" name="company_check_business_no" value="${companyDTO.company_check_business_no}">
				</td>
				<td>
					<input type="text" id="company_check_ceo" name="company_check_ceo" value="${companyDTO.company_check_ceo}">
				</td>
				<td>
				<input type="text" id="company_check_address" name="company_check_address" value="${companyDTO.company_check_address}">
				</td>
				<td>
					<input type="text" id="company_auth" name="company_auth" value="${companyDTO.company_auth}">
				</td>
				<td>
					<input type="submit" id="submit" value="저장">
				</td>
				<td>${companyDTO.admin_id}</td>
				<td>${companyDTO.company_auth_date}</td>
			</tr>
	</table>
</form>
</body>
</html>