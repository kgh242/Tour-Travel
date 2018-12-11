<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
패키지 리뷰 (만족도 조사) 숙박
	<form action="">
		<table>
			<tr>
				<td colspan="1"><h2>청결</h2></td>
			</tr>
				<tr>
					<td>${질문내용}</td>
					<td>
						<input type="radio" name="hotel${i}" value="1"/>
						<input type="radio" name="hotel${i}" value="2"/>
						<input type="radio" name="hotel${i}" value="3"/>
						<input type="radio" name="hotel${i}" value="4"/>
						<input type="radio" name="hotel${i}" value="5"/>
					</td>
				</tr>
		
			<tr>
				<td>${질문내용}</td>
				<td>
					<input type="radio" name="hotel2" value="1"/>
					<input type="radio" name="hotel2" value="2"/>
					<input type="radio" name="hotel2" value="3"/>
					<input type="radio" name="hotel2" value="4"/>
					<input type="radio" name="hotel2" value="5"/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>