<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>packDetail</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
${status} <
<script type="text/javascript">

	function update() {
		if (confirm("상품을 수정하시겠습니까?")) {
			location.href = "/Travel/packUpdate?pack_info_no=${packInfo.packInfo.pack_info_no}";

		} else {
			alert('취소하셨습니다');
		}
	}
	
	function dlt() {

		if (confirm("상품 구매 진행중인 고객이 있을 시 삭제가 불가합니다. \n상품을 삭제하시겠습니까??")) {
			location.href = "/Travel/packDelete?pack_info_no=${packInfo.packInfo.pack_info_no}";

		} else {
			alert('취소하셨습니다');
		}
	}
	

</script>
<body>
<h1>패키지 상세 정보 보기</h1>
<table border="1">
	<tr>
		<td>목적국가</td>
		<td>${packInfo.packInfo.pack_info_country}</td>
	</tr>
	<tr>
		<td>여행안전정보</td>
		<td><a href="/">${packInfo.packInfo.pack_info_safe}</a></td>
	</tr>
	<tr>
		<td>상품명</td>
		<td>${packInfo.packInfo.pack_info_title}</td>
	</tr>
	<tr>
		<td>여행일정</td>
		<td>${packInfo.packInfo.pack_info_start_date} ~ ${packInfo.packInfo.pack_info_end_date}</td>
	</tr>
	<tr>
		<td>이용항공사</td>
		<td>${packInfo.packInfo.pack_info_air}</td>
	</tr>
	<tr>
		<td>전체코스안내</td>
		<td><textarea readonly>${packInfo.packInfo.pack_info_course}</textarea></td>
	</tr>
	<tr>
		<td>숙소정보</td>
		<td>
			<c:forEach var="pack" items="${packInfo.packHotelInfo}">
				${pack.pack_hotel_name} ${pack.pack_hotel_start_date}~ ${pack.pack_hotel_end_date}
			</c:forEach>
		</td>
	</tr>

	<tr>
		<td>숙소이미지</td>
		<td>
		</td>
	</tr>
	<tr>
		<td>일별상세스케줄정보</td>
		<td>
			<c:forEach var="pack" items="${packInfo.packScheduleInfo}">
				${pack.pack_schedule_date}<br>
				<textarea readonly>${pack.pack_schedule_contents}</textarea> 
			</c:forEach>
		</td>
	</tr>
	<tr>
		<td>일별상세스케줄이미지</td>
		<td></td>
	</tr>
	<tr>
		<td>방문관광지정보</td>
		<td>			
			<c:forEach var="pack" items="${packInfo.packLandmarkInfo}">
				${pack.pack_landmark_code}  ${pack.pack_tour_date}<br>
				<textarea readonly>${pack.pack_tour_contents}</textarea> <br>
			</c:forEach>
		</td>
	</tr>
	<tr>
		<td>방문관광지이미지</td>
		<td></td>
	</tr>	
	<tr>
		<td>모집인원</td>
		<td>${packInfo.packInfo.pack_info_person_number}</td>
	</tr>
	<tr>
		<td>이용요금</td>
		<td>
			성인 :  ${packInfo.packPriceInfo.pack_price_adult}<br>
			초중고학생 : ${packInfo.packPriceInfo.pack_price_child} <br>
			아동 : ${packInfo.packPriceInfo.pack_price_baby}<br>
		</td>
	</tr>
	<tr>
		<td>출발 전 참고사항</td>
		<td>${packInfo.PackBeforeNoticeInfo}</td>
	</tr>
	<tr>
		<td>출발 후 참고사항</td>
		<td>${packInfo.PackAfterNoticeInfo}</td>
	</tr>
	<tr>
		<td>신청마감일자</td>
		<td>${packInfo.packInfo.pack_info_closing_date}</td>
	</tr>
	<tr>
		<td>상품등록일</td>
		<td>${packInfo.packInfo.pack_info_apply_date}</td>
	</tr>
</table>
<button id="updateBtn" onclick="update()">상품수정</button>
<button id="deleteBtn" onclick="dlt();">상품삭제</button>
</body>
</html>


