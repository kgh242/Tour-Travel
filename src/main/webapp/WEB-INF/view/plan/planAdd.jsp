<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>planAdd</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>
<h1>플랜1차 등록</h1>
<form id="planAdd" name="planAdd" onsubmit="return addInfoSubmit()" method="post"> 
	<table border="1">
		<tr>
			<td>목적국가</td>
			<td>
				<input list="countryselect" id="plan1_country" name="plan1_country" onkeyup="countryFunction()" placeholder="국가를 선택해 주세요" >
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
			<td>목적도시</td>
			<td><input type="text" id="plan1_city" name="plan1_city" placeholder="도시를 입력해주세요"></td>
		</tr>
		<tr>
			<td>플랜방소개</td>
			<td><input type="text" id="plan1_info" name="plan1_info"></td>
		</tr>
		<tr>
			<td>예상출발일자</td>
			<td><input type="date" id="plan1_start_date" name="plan1_start_date"  value="2018-01-01"></td>
		</tr>
		<tr>
			<td>예상종료일자</td>
			<td><input type="date" id="plan1_end_date" name="plan1_end_date"  value="2018-01-02"></td>
		</tr>
		<tr>
			<td>예상예산(개인별)</td>
			<td><input type="text" id="plan1_budget" name="plan1_budget">원</td>
		</tr>
		<tr>
			<td>신청마감일자</td>
			<td><input type="datetime-local" id="plan1_closing_date" name="plan1_closing_date" value="2018-01-01T06:30"></td>
		</tr>
		<tr>
			<td>모집연령대</td>
			<td><input type="text" id="plan1_age" name="plan1_age"></td>
		</tr>
		<tr>
			<td>모집인원(성별무관시)</td>
			<td><input type="number" id="plan1_person_number" name="plan1_person_number" min="0">명</td>
		</tr>
		<tr>
			<td>남성모집인원</td>
			<td><input type="number" id="plan1_male" name="plan1_male" min="0">명</td>
		</tr>
		<tr>
			<td>여성모집인원</td>
			<td><input type="number" id="plan1_female" name="plan1_female" min="0">명</td>
		</tr>
		<tr>
			<td>등록신청</td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">

	function addInfoSubmit() {
	    var myform = document.forms['planAdd'];
	    {
		    if( myform['plan1_country'].value.length < 1) {
		        alert( '여행 국가를 입력해주세요');
		        return false;
		    }
		    if( myform['plan1_city'].value.length < 1) {
		        alert( '여행 도시를 입력해주세요');
		        return false;
		    }
		    if( myform['plan1_info'].value.length < 1) {
		        alert( '플랜방소개를 입력하세요');
		        return false;
		    }
		    if( myform['plan1_start_date'].value.length < 1) {
		        alert( '예상출발일자를 입력하세요');
		        return false;
		    }	    
		    if( myform['plan1_end_date'].value.length < 1) {
		        alert( '예상종료일자를 입력하세요');
		        return false;
		    }	    
		    if( myform['plan1_budget'].value.length < 1) {
		    	alert( '예상예산(개인별)을 입력하세요');
		    	return false;
		    }		    
		    if( myform['plan1_closing_date'].value.length < 1) {
		    	alert( '마감일을 입력하세요');
		    	return false;
		    }
		    if( myform['plan1_age'].value.length < 1) {
		    	alert( '모집연령대를 입력하세요');
		    	return false;
		    }
		    if( myform['plan1_person_number'].value.length < 1) {
		    	alert( '모집인원을 입력하세요');
		    	return false;
		    }
		    
		    if( myform['plan1_male'].value.length < 1) {
		    	alert( '남성모집인원을 입력하세요');
		    	return false;
		    }
		    
		    if( myform['plan1_female'].value.length < 1) {
		    	alert( '여성모집인원을 입력하세요');
		    	return false;
		    }
	    }
	    return true;
	}
</script>
</html>