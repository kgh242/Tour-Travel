<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
여행사 회원수정  .
<form action="">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="company_id" value="${company_id}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="company_pw" value="${company_pw}" /></td>
		</tr>
		<tr>
			<td>회사이름</td>
			<td><input type="text" name="company_name" value="${company_name}"/></td>
		</tr>
		<tr>
			<td>대표자이름</td>
			<td><input type="text" name="company_ceo" value="${company_ceo}"/></td>
		</tr>
		<tr>
			<td>담당자연락처</td>
			<td><input type="text" name="company_tell1" value="${company_tell1}"/></td>
		</tr>
		<tr>
			<td>담당자연락처2</td>
			<td><input type="text" name="company_tell2" value="${company_tell2}"/></td>
		</tr>
		<tr>
			<td>회사주소</td>
			<td><input type="text" name="company_address" value="${company_address}"/></td>
		</tr>
		<tr>
			<td>사업자번호</td>
			<td><input type="text" name="company_business_no" value="${company_business_no}"/></td>
		</tr>
		<tr>
			<td>회사대표연락처</td>
			<td><input type="text" name="company_branch_tell" value="${company_branch_tell}"/></td>
		</tr>
		<tr>
			<td>본사연락처(해당경우에만)</td>
			<td><input type="text" name="company_head_tell" value="${company_head_tell}"/></td>
		</tr>
		<tr>
			<td>이미지</td>
			<td></td>
		</tr>
		<tr>
			<td>이미지</td>
			<td></td>
		</tr>
	</table>
</form>

</body>
</html>