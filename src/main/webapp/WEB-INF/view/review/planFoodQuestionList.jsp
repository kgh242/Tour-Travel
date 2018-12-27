<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>planFoodQuestionList</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	음식점평가문항등록(플랜)
	<form action="/Travel/planFoodQuestionList" method="post">
		<table border="1">
			<tr>
				<td>문항</td>
				<td>문항상세내용</td>
				<td>추가</td>
			</tr>
			<tr>
				<td><input type="text" id="plan_review_food_question_category" name="plan_review_food_question_category"></td>
				<td><textarea rows="2" cols="80" id="plan_review_food_question_contents" name="plan_review_food_question_contents"></textarea></td>
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
			<c:forEach var="planFoodQuestionList" items="${planFoodQuestionList}">
				<tr>
					<td>${planFoodQuestionList.plan_review_food_question_category}</td>
					<td>${planFoodQuestionList.plan_review_food_question_contents}</td>
					<td>${planFoodQuestionList.admin_id}</td>
					<td>${planFoodQuestionList.plan_review_food_question_date}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>