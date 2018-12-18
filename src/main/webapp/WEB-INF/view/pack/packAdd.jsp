<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>packAdd</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>
<h1>패키지 상품 등록</h1>
<form id="packAdd" name="packAdd" method="post"  enctype="multipart/form-data"> 
<input type="hidden" name="company_id" value="321">
	<table border="1">
		<tr>
			<td>등록자(여행사)</td>
			<td>321</td>
		</tr>
		<tr><!-- packDTO -->
			<td>목적국가</td>
			<td>
				<input list="countryselect" id="pack_info_country" name="pack_info_country" onkeyup="countryFunction()" placeholder="국가를 선택해 주세요" >
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
		<tr><!-- packDTO -->
			<td>안전정보</td>
			<td><input type="text" id="pack_info_safe" name="pack_info_safe" value="안전정보 API 추가 예정"></td>
		</tr>
		<tr><!-- packDTO -->
			<td>상품명</td>
			<td><input type="text" id="pack_info_title" name="pack_info_title"></td>
		</tr>
		<tr><!-- packDTO -->
			<td>여행시작일정</td>
			<td><input type="datetime-local" id="pack_info_start_date" name="pack_info_start_date" value="2018-01-01T06:30"></td>
		</tr>
		<tr><!-- packDTO -->
			<td>여행종료일정</td>
			<td><input type="datetime-local" id="pack_info_end_date" name="pack_info_end_date" value="2018-12-31T18:30"></td>
		</tr>
		<tr><!-- packDTO -->
			<td>이용항공</td>
			<td><input type="text" id="pack_info_air" name="pack_info_air" value="항공정보 API 추가 예정"></td>
		</tr>
		<tr>
			<td>숙소</td>
			<td><!-- packHotelDTO -->
				 <input type="text" name="pack_hotel_no"> <input type="date" name="pack_hotel_start_date">~<input type="date" name="pack_hotel_end_date">
				<input type="button" id="MulitHotel" name="MulitHotel" onclick="MulitHotelRow()" value="숙소 추가">
				<table id="multiHotel"></table>	
			</td>
		</tr>
		<tr>
			<td>숙소이미지</td>
			<td><!-- 배열 -->
				<input type="file" name="hotelImgFileName[]" multiple/>
				<input type="button" id="MulitHotelImg" name="MulitHotelImg" onclick="MulitHotelImgRow()" value="이미지 추가 업로드">
				<table id="multiHotelImg"></table>	
			</td>
		</tr>

		<tr><!-- packDTO -->
			<td>전체 코스</td>
			<td><textarea rows="4" cols="80" id="pack_info_course" name="pack_info_course"></textarea></td>
		</tr>
		<tr>
			<td>일별 상세 스케줄</td>
			<td><!-- packScheduleDTO-->
				<input type="date" id="pack_schedule_date" name="pack_schedule_date"><br>
				<textarea rows="4" cols="65" id="pack_schedule_contents" name="pack_schedule_contents"></textarea>
				<input type="button" id="MultiSchedule" name="MultiSchedule" onclick="MultiScheduleRow()" value="일정추가">
				<table id="multiSchedule"></table>	
			</td>
		</tr>
		<tr>
			<td>상세스케줄이미지</td>
			<td><!-- 배열 -->
				<input type="file" name="scheduleFileName[]" multiple/>
				<input type="button" id="MultiScheduleImg" name="MultiScheduleImg" onclick="MultiScheduleImgRow()" value="이미지 추가 업로드">
				<table id="multiScheduleImg"></table>		
			</td>
		</tr>
		<tr>
			<td>방문관광지</td>
			<td><!-- packLandmarkDTO -->
				<input type="text" id="pack_landmark_code" name="pack_landmark_code" placeholder="관광지이름입력">
				<input type="date" id="pack_tour_date" name="pack_tour_date"><br>
				<textarea rows="4" cols="65" id="pack_tour_contents" name="pack_tour_contents"></textarea>
				<input type="button" id="MultiLandmark" name="MultiLandmark" onclick="MultiLandmarkRow()" value="관광지추가">
				<table id="multiLandmark"></table>	
			</td>
		</tr>
		<tr>
			<td>관광지이미지</td>
			<td><!-- 배열 -->
				<input type="file" name="landMarkFileName[]" multiple/>
				<input type="button" id="MultiLandmarkImg" name="MultiLandmarkImg" onclick="MultiLandmarkImgRow()" value="이미지 추가 업로드">
				<table id="multiLandmarkImg"></table>		
			</td>
		</tr>
		<tr><!-- packDTO -->
			<td>모집인원</td>
			<td><input type="number" id="pack_info_person_number" name="pack_info_person_number" min="1">명</td>
		</tr>
		<tr><!-- packPriceDTO -->
			<td>이용요금</td>
			<td>성인 : <input type="text" id="pack_price_adult" name="pack_price_adult">
				청소년 : <input type="text" id="pack_price_child" name="pack_price_child">
				유아 : <input type="text" id="pack_price_baby" name="pack_price_baby">
			</td>
		</tr>
		<tr><!-- packDTO -->
			<td>신청마감일자</td>
			<td><input type="datetime-local" id="pack_info_closing_date" name="pack_info_closing_date" value="2018-01-01T06:30"></td>
		</tr>
		<tr>
			<td>광고신청</td>
			<td><!-- packDTO -->
				<!-- 이미지 단일값 -->
				<input type="radio" name="pack_info_sale" value="true" onClick="this.form.adfile.disabled=false" checked>광고 신청<br>
				<input type="file" name="adfile"><br>
				<input type="radio" name="pack_info_sale" value="false" onClick="this.form.adfile.disabled=true">광고 신청하지않음
			</td>
		</tr>
		<tr>
			<td>등록신청</td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">

var i = 0;

	{
		var oTbl;
		
		function MulitHotelRow() {
			oTbl = document.getElementById("multiHotel");
			i++;
			var oRow = oTbl.insertRow();
			oRow.onmouseover = function() {
				oTbl.clickedRowIndex = this.rowIndex
			}; //clickedRowIndex - 클릭한 Row의 위치를 확인;

			var oCell = oRow.insertCell();
			//삽입될 Form Tag
			var frmTag = "<input type=text name='pack_hotel_no'> <input type=date name='pack_hotel_start_date'>~<input type=date name='pack_hotel_end_date'>";
			frmTag += "<input type=button value='삭제' onClick='MulitHotelremoveRow()'>";
			oCell.innerHTML = frmTag;
		}

		function MulitHotelremoveRow() {
			i--;
			oTbl.deleteRow(oTbl.clickedRowIndex);
		}
	}
	{
		var oTb2;
		function MulitHotelImgRow() {
			oTb2 = document.getElementById("multiHotelImg");
			
			var oRow = oTb2.insertRow();
			oRow.onmouseover = function() {
				oTb2.clickedRowIndex = this.rowIndex
			}; //clickedRowIndex - 클릭한 Row의 위치를 확인;

			var oCell = oRow.insertCell();
			//삽입될 Form Tag
			var frmTag = "<input type=file name='hotelImgFileName[]' multiple/>";
			frmTag += "<input type=button value='삭제' onClick='MultiHotelImgremoveRow()'>";
			oCell.innerHTML = frmTag;
		}

		function MultiHotelImgremoveRow() {
			oTb2.deleteRow(oTb2.clickedRowIndex);
		}
	}
	
	{
		var oTbl3;
		function MultiScheduleRow() {
			oTbl3 = document.getElementById("multiSchedule");
			var oRow = oTbl3.insertRow();
			oRow.onmouseover = function() {
				oTbl3.clickedRowIndex = this.rowIndex
			}; //clickedRowIndex - 클릭한 Row의 위치를 확인;

			var oCell = oRow.insertCell();
			//삽입될 Form Tag
			var frmTag = "<input type=date id='pack_schedule_date' name='pack_schedule_date'><br><textarea rows=4 cols=65 id='pack_schedule_contents' name='pack_schedule_contents'></textarea>";
			frmTag += "<input type=button value='삭제' onClick='MultiScheduleremoveRow()'>";
			oCell.innerHTML = frmTag;
		}

		function MultiScheduleremoveRow() {
			oTbl3.deleteRow(oTbl3.clickedRowIndex);
		}
	}

	{
		var oTbl4;
		function MultiScheduleImgRow() {
			oTbl4 = document.getElementById("multiScheduleImg");
			var oRow = oTbl4.insertRow();
			oRow.onmouseover = function() {
				oTbl4.clickedRowIndex = this.rowIndex
			}; //clickedRowIndex - 클릭한 Row의 위치를 확인;

			var oCell = oRow.insertCell();
			//삽입될 Form Tag
			var frmTag = "<input type=file name='scheduleFileName[]' multiple/>";
			frmTag += "<input type=button value='삭제' onClick='MultiScheduleImgremoveRow()'>";
			oCell.innerHTML = frmTag;
		}

		function MultiScheduleImgremoveRow() {
			oTbl4.deleteRow(oTbl4.clickedRowIndex);
		}
	}
	
	{
		var oTbl5;
		function MultiLandmarkRow() {
			oTbl5 = document.getElementById("multiLandmark");
			var oRow = oTbl5.insertRow();
			oRow.onmouseover = function() {
				oTbl5.clickedRowIndex = this.rowIndex
			}; //clickedRowIndex - 클릭한 Row의 위치를 확인;

			var oCell = oRow.insertCell();
			//삽입될 Form Tag
			var frmTag = "<input type=text id='pack_landmark_code' name='pack_landmark_code' placeholder='관광지이름입력'><input type='date' id='pack_tour_date' name='pack_tour_date'><br><textarea rows=4 cols=65 id='pack_tour_contents' name='pack_tour_contents'></textarea>";
			frmTag += "<input type=button value='삭제' onClick='MultiLandmarkremoveRow()'>";
			oCell.innerHTML = frmTag;
		}

		function MultiLandmarkremoveRow() {
			oTbl5.deleteRow(oTbl5.clickedRowIndex);
		}
	}

	{
		var oTbl6;
		function MultiLandmarkImgRow() {
			oTbl6 = document.getElementById("multiLandmarkImg");
			var oRow = oTbl6.insertRow();
			oRow.onmouseover = function() {
				oTbl6.clickedRowIndex = this.rowIndex
			}; //clickedRowIndex - 클릭한 Row의 위치를 확인;

			var oCell = oRow.insertCell();
			//삽입될 Form Tag
			var frmTag = "<input type=file name='landMarkFileName[]' multiple/>";
			frmTag += "<input type=button value='삭제' onClick='MultiLandmarkImgremoveRow()'>";
			oCell.innerHTML = frmTag;
		}

		function MultiLandmarkImgremoveRow() {
			oTbl6.deleteRow(oTbl6.clickedRowIndex);
		}
	}

	var str = $('#pack_info_course').val();
	str = str.replace(/(?:\r\n|\r|\n)/g, '<br/>');
	$('#pack_info_course').val(str);
	
	var str = $('#pack_schedule_contents').val();
	str = str.replace(/(?:\r\n|\r|\n)/g, '<br/>');
	$('#pack_schedule_contents').val(str);
	
	var str = $('#pack_tour_contents').val();
	str = str.replace(/(?:\r\n|\r|\n)/g, '<br/>');
	$('#pack_tour_contents').val(str);
	
	
</script>
</html>