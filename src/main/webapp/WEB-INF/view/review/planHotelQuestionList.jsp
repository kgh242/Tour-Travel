<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>planHotelQuestionList</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	숙박평가문항등록(플랜)
	<form action="/Travel/planHotelQuestionList" method="post">
		<table border="1">
			<tr>
				<td>문항</td>
				<td>문항상세내용</td>
				<td>추가</td>
			</tr>
			<tr>
				<td><input type="text" id="plan_review_hotel_question_category" name="plan_review_hotel_question_category"></td>
				<td><textarea rows="2" cols="80" id="plan_review_hotel_question_contents" name="plan_review_hotel_question_contents"></textarea></td>
				<td><input type="submit" id="submit" value="추가"></td>
			</tr>
		</table>
		<br><br>
		<table border="1">
			<tr>
				<td>문항</td>
				<td>문항상세내용</td>
				<td>등록자</td>
				<td>등록날짜</td>
			</tr>
			<c:forEach var="planHotelQuestionList" items="${planHotelQuestionList}">
				<tr>
					<td>${planHotelQuestionList.plan_review_hotel_question_category}</td>
					<td>${planHotelQuestionList.plan_review_hotel_question_contents}</td>
					<td>${planHotelQuestionList.admin_id}</td>
					<td>${planHotelQuestionList.plan_review_hotel_question_date}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>