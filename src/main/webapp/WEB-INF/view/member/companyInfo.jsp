<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyInfo</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
여행사 회원 내 정보 보기
	<table border="1">
		<tr>
			<td>여행사아이디</td>
			<td>여행사이름</td>
			<td>담당자연락처1</td>
			<td>담당자연락처2</td>
			<td>회사주소</td>
			<td>사업자번호</td>
			<td>회사대표연락처</td>
			<td>본사연락처</td>
			<td>정보수정</td>
			<td>이미지보기</td>
		</tr>
		<tr>
			<td>${companyDTO.company_id}</td>
			<td>${companyDTO.company_name}</td>
			<td>${companyDTO.company_tell1}</td>
			<td>${companyDTO.company_tell2}</td>
			<td>${companyDTO.company_address}</td>
			<td>${companyDTO.company_business_no}</td>
			<td>${companyDTO.company_branch_tell}</td>
			<td>${companyDTO.company_head_tell}</td>
			<td>
				<a href="/Travel/companyUpdate">수정</a>
			</td>
			<td>
				<a href="/Travel/companyImgInfo">이미지</a>
			</td>
		</tr>
	</table>
</body>
</html>