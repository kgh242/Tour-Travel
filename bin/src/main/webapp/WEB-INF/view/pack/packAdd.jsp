<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>packAdd</title>

</head>
<body>
<h1>패키지 상품 등록</h1>
<form id="packAdd" name="packAdd" method="post">
<input type="hidden" name="company_id" value="${session.sessionID}">
	<table border="1">
		<tr>
			<td>등록자(여행사)</td>
			<td>${session.sessionID}</td>
		</tr>
		<tr>
			<td>목적국가</td>
			<td>
				<input list="countryselect" id="pack_info_country" name="pack_info_country" onkeyup="countryFunction()" placeholder="국가를 선택해 주세요">
				<datalist id="countryselect">
					<option value="Japan">일본</option>
					<option value="China">중국</option>
					<option value="USA">미국</option>
					<option value="Philippines">필리핀</option>
					<option value="HongKong">홍콩</option>
					<option value="Thailand">태국</option>
					<option value="Vietnam">베트남</option>
					<option value="Singapore">싱가포르</option>
					<option value="Germany">독일</option>
					<option value="England">영국</option>
					<option value="Swiss">스위스</option>
					<option value="France">프랑스</option>
					<option value="Italy">이탈리아</option>
					<option value="Netherlands">네덜란드</option>
				</datalist>
			</td>
		</tr>
		<tr>
			<td>안전정보</td>
			<td>API.............</td>
		</tr>
		<tr>
			<td>이용항공</td>
			<td>API.............</td>
		</tr>
		<tr>
			<td>여행시작일정</td>
			<td><input type="datetime-local" id="pack_info_start_date" name="pack_info_start_date" value="2018-01-01T06:30"></td>
		</tr>
		<tr>
			<td>여행종료일정</td>
			<td><input type="datetime-local" id="pack_info_end_date" name="pack_info_end_date" value="2018-12-31T18:30"></td>
		</tr>
		<tr>
			<td>패키지코스</td>
			<td><textarea rows="4"></textarea></td>
		</tr>
		<tr>
			<td>모집인원</td>
			<td><input type="number" id="pack_info_person_number" name="pack_info_person_number" min="1">명</td>
		</tr>
		<tr>
			<td>신청마감일자</td>
			<td><input type="datetime-local" id="pack_info_closing_date" name="pack_info_closing_date" value="2018-01-01T06:30"></td>
		</tr>
		<tr>
			<td>광고신청</td>
			<td><input type="radio" id="pack_info_sale" name="pack_info_sale" value="true"checked>예<br>
				<input type="radio" id="pack_info_sale" name="pack_info_sale" value="false">아니오</td>
		</tr>
		<tr>
			<td>등록신청</td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
</form>
</body>
</html>