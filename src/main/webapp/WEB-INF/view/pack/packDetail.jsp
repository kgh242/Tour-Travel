<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>packDetail</title>
</head>
<body>
<h1>패키지 상세 정보 보기</h1>
<table border="1">
	<tr>
		<td>목적지</td>
		<td>${packDTO.pack_info_country}</td>
	</tr>
	<tr>
		<td>패키지 일정</td>
		<td><a href="/packDetailSchedule" >상세보기</a></td>
	</tr>
	<tr>
		<td>패키지 숙소 정보</td>
		<td><a href="/" >상세보기</a></td>
	</tr>
	<tr>
		<td>패키지 관광 정보</td>
		<td><a href="/" >상세보기</a></td>
	</tr>
	<tr>
		<td>패키지 출발 전 참고사항</td>
		<td><a href="/" >상세보기</a></td>
	</tr>
	<tr>
		<td>패키지 출발 후 참고사항</td>
		<td><a href="/" >상세보기</a></td>
	</tr>
	<tr>
		<td>패키지 이용 요금</td>
		<td><a href="/" >상세보기</a></td>
	</tr>
</table>

</body>
</html>