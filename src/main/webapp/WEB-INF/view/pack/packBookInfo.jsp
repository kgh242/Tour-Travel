<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>packBookInfo</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<script type="text/javascript">
var totalPrice = '<c:out value="${packBookSelect.pack_book_price}"/>'; 
function check() {
	if (confirm("금액 " +totalPrice+"원 결제를 진행하시겠습니까?")) {
		//location.href = "/Travel/packUpdate?pack_info_no=${packInfo.packInfo.pack_info_no}";
	    $('#payInfo').submit();
	} else {
		alert('취소하셨습니다');
		return false;
	}
}
</script>
<body>
	결제창
	<form id="payInfo" name="payInfo" action="/Travel/packPay" method="post">
		<input type="hidden" id="pack_book_no" name="pack_book_no" value="${packBookSelect.pack_book_no}">
		<input type="hidden" id="pack_book_price" name="pack_book_price" value="${packBookSelect.pack_book_price}">
		
		<table border="1">
			<tr>
				<td>예약번호</td>
				<td>
				
					${packBookSelect.pack_book_no}
				</td>
			</tr>
			<tr>
				<td>패키지번호</td>
				<td>${packBookSelect.pack_info_no}</td>
			</tr>
			<tr>
				<td>고객아이디</td>
				<td>${packBookSelect.user_id}</td>
			</tr>
			<tr>
				<td>고객연락처</td>
				<td>${packBookSelect.pack_book_tell}</td>
			</tr>
			<tr>
				<td>성인</td>
				<td>${packBookSelect.pack_book_adult}명</td>
			</tr>
			<tr>
				<td>초중고등학생</td>
				<td>${packBookSelect.pack_book_child}명</td>
			</tr>
			<tr>
				<td>아동</td>
				<td>${packBookSelect.pack_book_baby}명</td>
			</tr>
			<tr>
				<td>총 금액</td>
				<td>${packBookSelect.pack_book_price}</td>
			</tr>
			<tr>
				<td>결제</td>
				<td><button id="payConfirm" onclick="check()">결제할래?</button></td>
			</tr>

		</table>
	</form>
</body>
</html>
