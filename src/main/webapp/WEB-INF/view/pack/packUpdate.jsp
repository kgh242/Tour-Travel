<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>
<body>
<h1>패키지 수정</h1>
<form id="packUpdate" name="packUpdate" onsubmit="return updateInfoSubmit()" method="post"   action="/Travel/packUpdate" enctype="multipart/form-data"> 
<input type="hidden" name="pack_info_no" value="${packInfo.packInfo.pack_info_no}">
<input type="hidden" name="company_id" value="321"> <!-- 세션아이디 -->
	<table border="1">
		<tr>
			<td>등록자(여행사)</td>
			<td>321</td>
		</tr>
		<tr><!-- packDTO -->
			<td>목적국가</td>
			<td>${packInfo.packInfo.pack_info_country}</td>
		</tr>
		<tr><!-- packDTO -->
			<td>안전정보</td>
			<td>${packInfo.packInfo.pack_info_safe}</td>
		</tr>
		<tr><!-- packDTO -->
			<td>상품명</td>
			<td><input type="text" id="pack_info_title" name="pack_info_title" value="${packInfo.packInfo.pack_info_title}"></td>
		</tr>
		<tr><!-- packDTO -->
			<td>여행시작일정</td>
			<td><input type="date" id="pack_info_start_date" name="pack_info_start_date" value="${packInfo.packInfo.pack_info_start_date}"></td>
		</tr>
		<tr><!-- packDTO -->
			<td>여행종료일정</td>
			<td><input type="date" id="pack_info_end_date" name="pack_info_end_date" value="${packInfo.packInfo.pack_info_end_date}"></td>
		</tr>
		<tr><!-- packDTO -->
			<td>이용항공</td>
			<td><input type="text" id="pack_info_air" name="pack_info_air" value="${packInfo.packInfo.pack_info_air}"></td>
		</tr>
		<tr>
			<td>숙소</td>
			<td><!-- packHotelDTO -->
			<c:forEach var="pack" items="${packInfo.packHotelInfo}">
					<div><input type="text" name="pack_hotel_name" value="${pack.pack_hotel_name}"><input type="date" name="pack_hotel_start_date" value="${pack.pack_hotel_start_date}">~<input type="date" name="pack_hotel_end_date" value="${pack.pack_hotel_end_date}">
					<button onclick="deleteLine(this);">삭제</button><br></div>
					
			</c:forEach>
				<input type="button" id="MulitHotel" name="MulitHotel" onclick="MulitHotelRow()" value="숙소 추가">
				<table id="multiHotel"></table>	
			</td>
		</tr>
		<tr>
			<td>숙소이미지</td>
			<td><!-- 배열 -->
				<input type="file" name="hotelImgFileName" />
				<input type="button" id="MulitHotelImg" name="MulitHotelImg" onclick="MulitHotelImgRow()" value="이미지 추가 업로드">
				<table id="multiHotelImg"></table>	
			</td>
		</tr>

		<tr><!-- packDTO -->
			<td>전체 코스</td>
			<td><textarea rows="4" cols="80" id="pack_info_course" name="pack_info_course">${packInfo.packInfo.pack_info_course}</textarea></td>
		</tr>
		<tr>
			<td>일별 상세 스케줄</td>
			<td><!-- packScheduleDTO-->
			<c:forEach var="pack" items="${packInfo.packScheduleInfo}">
				<div>
					<input type="date" id="pack_schedule_date" name="pack_schedule_date" value="${pack.pack_schedule_date}"><br>
					<textarea rows="4" cols="65" id="pack_schedule_contents" name="pack_schedule_contents">${pack.pack_schedule_contents}</textarea> 
					<button onclick="deleteLine(this);">삭제</button><br>
				</div>
			</c:forEach>
				<input type="button" id="MultiSchedule" name="MultiSchedule" onclick="MultiScheduleRow()" value="일정추가">
				<table id="multiSchedule"></table>	
			</td>
		</tr>
		<tr>
			<td>상세스케줄이미지</td>
			<td><!-- 배열 -->
				<input type="file" name="scheduleFileName" />
				<input type="button" id="MultiScheduleImg" name="MultiScheduleImg" onclick="MultiScheduleImgRow()" value="이미지 추가 업로드">
				<table id="multiScheduleImg"></table>		
			</td>
		</tr>
		<tr>
			<td>방문관광지</td>
			<td><!-- packLandmarkDTO -->
				<c:forEach var="pack" items="${packInfo.packLandmarkInfo}">
					<div>
						<input type="text" id="pack_landmark_code" name="pack_landmark_code" value="${pack.pack_landmark_code}">
						<input type="date" id="pack_tour_date" name="pack_tour_date" value="${pack.pack_tour_date}"><br>
						<textarea rows="4" cols="65" id="pack_tour_contents" name="pack_tour_contents">${pack.pack_tour_contents}</textarea> 
						<button onclick="deleteLine(this);">삭제</button><br>
					</div>
				</c:forEach>
				<input type="button" id="MultiLandmark" name="MultiLandmark" onclick="MultiLandmarkRow()" value="관광지추가">
				<table id="multiLandmark"></table>	
			</td>
		</tr>
		<tr>
			<td>관광지이미지</td>
			<td><!-- 배열 -->
				<input type="file" name="landMarkFileName" />
				<input type="button" id="MultiLandmarkImg" name="MultiLandmarkImg" onclick="MultiLandmarkImgRow()" value="이미지 추가 업로드">
				<table id="multiLandmarkImg"></table>		
			</td>
		</tr>
		<tr><!-- packDTO -->
			<td>모집인원</td>
			<td><input type="text" id="pack_info_person_number" name="pack_info_person_number" value="${packInfo.packInfo.pack_info_person_number}">명</td>
		</tr>
		<tr><!-- packPriceDTO -->
			<td>이용요금</td>
			<td>성인 : <input type="text" id="pack_price_adult" name="pack_price_adult" value="${packInfo.packPriceInfo.pack_price_adult}">
				청소년 : <input type="text" id="pack_price_child" name="pack_price_child" value="${packInfo.packPriceInfo.pack_price_child}">
				유아 : <input type="text" id="pack_price_baby" name="pack_price_baby" value="${packInfo.packPriceInfo.pack_price_baby}">
			</td>
		</tr>
		<tr>
			<td>출발 전 참고사항</td>
			<td>
				출발 전 참고사항 내용 <br>
				<textarea rows="4" cols="80" id="pack_notice_before_contents" name="pack_notice_before_contents">${packInfo.PackBeforeNoticeInfo}</textarea>
			</td>
		</tr>
		<tr>
			<td>출발 후 참고사항</td>
			<td>
				출발 후 참고사항 내용 <br>
				<textarea rows="4" cols="80" id="pack_notice_after_contents" name="pack_notice_after_contents">${packInfo.PackAfterNoticeInfo}</textarea>
			</td>
		</tr>
		<tr><!-- packDTO -->
			<td>신청마감일자</td>
			<td><input type="date" id="pack_info_closing_date" name="pack_info_closing_date" value="${packInfo.packInfo.pack_info_closing_date}"></td>
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
<script type="text/javascript">


{
	var oTbl;
	
	function MulitHotelRow() {
		oTbl = document.getElementById("multiHotel");
		var oRow = oTbl.insertRow();
		oRow.onmouseover = function() {
			oTbl.clickedRowIndex = this.rowIndex
		}; //clickedRowIndex - 클릭한 Row의 위치를 확인;

		var oCell = oRow.insertCell();
		//삽입될 Form Tag
		var frmTag = "<input type=text name='pack_hotel_name'> <input type=date name='pack_hotel_start_date'>~<input type=date name='pack_hotel_end_date'>";
		frmTag += "<input type=button value='삭제' onClick='MulitHotelremoveRow()'>";
		oCell.innerHTML = frmTag;
	}

	function MulitHotelremoveRow() {

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
		var frmTag = "<input type=file name='hotelImgFileName' />";
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
		var frmTag = "<input type=file name='scheduleFileName' />";
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
		var frmTag = "<input type=file name='landMarkFileName' />";
		frmTag += "<input type=button value='삭제' onClick='MultiLandmarkImgremoveRow()'>";
		oCell.innerHTML = frmTag;
	}

	function MultiLandmarkImgremoveRow() {
		oTbl6.deleteRow(oTbl6.clickedRowIndex);
	}
}


function updateInfoSubmit() {

    var myform = document.forms['packUpdate'];
    {


	    if( myform['pack_info_title'].value.length < 1) {
	        alert( '상품명을 입력하세요');
	        return false;
	    }
	    if( myform['pack_info_start_date'].value.length < 1) {
	        alert( '패키지 시작일을 입력하세요');
	        return false;
	    }	    
	    if( myform['pack_info_end_date'].value.length < 1) {
	        alert( '패키지 종료일을 입력하세요');
	        return false;
	    }	    
	    if( myform['pack_info_air'].value.length < 1) {
	    	alert( '이용항공을 입력하세요');
	    	return false;
	    }		    
	    if( myform['pack_info_course'].value.length < 1) {
	    	alert( '전체코스 안내를 입력하세요');
	    	return false;
	    }
	    if( myform['pack_info_person_number'].value.length < 1) {
	    	alert( '패키지상품 모집인원을 입력하세요');
	    	return false;
	    }
	    if( myform['pack_price_adult'].value.length < 1) {
	    	alert( '패키지상품 성인요금을 입력하세요');
	    	return false;
	    }
	    
	    if( myform['pack_price_child'].value.length < 1) {
	    	alert( '패키지상품 청소년요금을 입력하세요');
	    	return false;
	    }
	    
	    if( myform['pack_price_baby'].value.length < 1) {
	    	alert( '패키지상품 아동요금을 입력하세요');
	    	return false;
	    }
	    
	    if( myform['pack_notice_before_contents'].value.length < 1) {
	    	alert( '여행 출발 전 필요 정보를 입력하세요');
	    	return false;
	    }
	    
	    if( myform['pack_notice_after_contents'].value.length < 1) {
	    	alert( '여행 출발 후 필요 정보를 입력하세요');
	    	return false;
	    }
	    
	    if( myform['pack_info_closing_date'].value.length < 1) {
	    	alert( '패키지상품 마감일을 입력하세요');
	    	return false;
	    }

    }

    return true;
}

function deleteLine(obj) {
    var div = $(obj).parent();
 
    //라인 삭제
    div.remove();
}


</script>


</body>
</html>