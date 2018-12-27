<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>packLandmarkQuestionList</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	관광지평가문항등록
	<form action="/Travel/packLandmarkQuestionList" method="post">
	<a href="/Travel/questionList">목록으로</a><br>
		<table border="1">
			<tr>
				<td>문항</td>
				<td>문항상세내용</td>
				<td>추가</td>
			</tr>
			<tr>
				<td><input type="text" id="pack_review_landmark_question_category" name="pack_review_landmark_question_category"></td>
				<td><textarea rows="2" cols="80" id="pack_review_landmark_question_contents" name="pack_review_landmark_question_contents"></textarea></td>
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
			<c:forEach var="packLandmarkQuestionList" items="${packLandmarkQuestionList}">
				<tr>
					<td>${packLandmarkQuestionList.pack_review_landmark_question_category}</td>
					<td>${packLandmarkQuestionList.pack_review_landmark_question_contents}</td>
					<td>${packLandmarkQuestionList.admin_id}</td>
					<td>${packLandmarkQuestionList.pack_review_landmark_question_date}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>