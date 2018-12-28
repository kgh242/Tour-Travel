<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>packBook</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>
<h1>패키지 예약</h1>
<form id="packBook" name="packBook" action="" method="post" onsubmit="return bookInfoSubmit()">
<input type="hidden" name="user_id" value="${LOGINID}">
<input type="hidden" name="pack_info_no" value="${packInfo.packInfo.pack_info_no}">

	<table border="1">
		<tr>
			<td>신청자</td>
			<td>${LOGINID}</td>
		</tr>
		<tr>
			<td>신청자 연락처</td>
			<td><input type="text" id="pack_book_tell" name="pack_book_tell" placeholder="-는 빼고 입력해주세요"></td>
		</tr>
		<tr>
			<td>신청상품번호</td>
			<td>${packInfo.packInfo.pack_info_no}</td>
		</tr>
		<tr>
			<td>신청상품명</td>
			<td>${packInfo.packInfo.pack_info_title}</td>
		</tr>
		<tr>
			<td>여행일정</td>
			<td>${packInfo.packInfo.pack_info_start_date} ~ ${packInfo.packInfo.pack_info_end_date}</td>
		</tr>
		<tr>
			<td>모집인원</td>
			<td>${packInfo.packInfo.pack_info_person_number}</td>
		</tr>	
		<tr>
			<td>가격</td>
			<td>
				성인 :  ${packInfo.packPriceInfo.pack_price_adult}<br>
				초중고학생 : ${packInfo.packPriceInfo.pack_price_child} <br>
				아동 : ${packInfo.packPriceInfo.pack_price_baby}<br>
			</td>
		</tr>
		<tr>
			<td>성인</td>
			<td><input type="number" class="form-control num_only num_comma num_sum" id="pack_book_adult" name="pack_book_adult" value="0">명</td>
		</tr>
		<tr>
			<td>초중고학생</td>
			<td><input type="number" class="form-control num_only num_comma num_sum" id="pack_book_child" name="pack_book_child" value="0">명</td>
		</tr>
		<tr>
			<td>아동</td>
			<td><input type="number" class="form-control num_only num_comma num_sum" id="pack_book_baby" name="pack_book_baby" value="0">명</td>
		</tr>
		<tr>
			<td>전체인원</td>
		   	<td class="pl-4" colspan="2">
		    	<input type="text" class="form-control text-right font-weight-bold num_only num_comma num_sum" id="total" name="total" readonly>
		    </td>
		</tr>
		<tr>
			<td>결제금액</td>
		   	<td class="pl-4" colspan="2">
		    	<input type="text" class="form-control text-right font-weight-bold num_only num_comma num_sum" id="pack_book_price" name="pack_book_price" readonly>
		    </td>
		</tr>		
		<tr>
			<td>예약신청</td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
</form>


<script type="text/javascript">

$(function(){

	$('input.num_only').on('keyup',function(){
	          var cnt = $(".exam input.num_sum").length;     
	          console.log(cnt);
	          
	          var adultPrice = '<c:out value="${packInfo.packPriceInfo.pack_price_adult}"/>'; 
	          var childPrice = '<c:out value="${packInfo.packPriceInfo.pack_price_child}"/>'; 
	          var babyPrice = '<c:out value="${packInfo.packPriceInfo.pack_price_baby}"/>'; 
        
	  for( var i=1; i< cnt; i++){
	     var sum = parseInt($(this).val() || 0 );
	     sum++
	    console.log(sum);
	  }
	  
	            var sum1 = parseInt($("#pack_book_adult").val() || 0 ); // input 값을 가져오며 계산하지만 값이 없을경우 0이 대입된다  뒷부분에 ( || 0 ) 없을경우 합계에 오류가 생겨 NaN 값이 떨어진다
	            var sum2 = parseInt($("#pack_book_child").val() || 0);
	            var sum3 = parseInt($("#pack_book_baby").val() || 0);


	            var sum = sum1 + sum2 + sum3;
	            var sumPrice = (sum1*adultPrice) + (sum2*childPrice) + (sum3*babyPrice);
	            console.log(sum);
	            $("#total").val(sum);
	            $("#pack_book_price").val(sumPrice);
	        });

	});
	
function bookInfoSubmit() {
	var totalPerson = '<c:out value="${packInfo.packInfo.pack_info_person_number}"/>'; 
    var myform = document.forms['packBook'];

    {
	    if( myform['pack_book_tell'].value.length < 1) {
	        alert( '예약 신청자 연락처를 입력해주세요');
	        return false;
	    }

	    if( myform['pack_book_price'].value.length < 1) {
	        alert( '인원 수를 확인해주세요');
	        return false;
	    }

	    if( parseInt(myform['total'].value) > parseInt(totalPerson)) {
	        alert( '패키지 모집 인원보다 더 신청할 수 없습니다');
	        return false;
	    }
    }

    return true;
}
</script>