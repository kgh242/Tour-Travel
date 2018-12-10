<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>packBook</title>
</head>
<body>
<h1>패키지 예약</h1>
<form id="packBook" name="packBook" method="post">
<input type="hidden" name="user_id" value="${session.sessionID}">
	<table border="1">
		<tr>
			<td>신청자</td>
			<td>${session.sessionID}</td>
		</tr>
		<tr>
			<td>성인</td>
			<td><input type="number" id="pack_book_adult" name="pack_book_adult" min="0">명</td>
		</tr>
		<tr>
			<td>아동</td>
			<td><input type="number" id="pack_book_child" name="pack_book_child" min="0">명</td>
		</tr>
		<tr>
			<td>유아</td>
			<td><input type="number" id="pack_book_baby" name="pack_book_baby" min="0">명</td>
		</tr>
		<tr>
			<td>예약신청</td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
</form>
</body>
</html>