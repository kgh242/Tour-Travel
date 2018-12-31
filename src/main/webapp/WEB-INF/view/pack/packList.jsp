<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>
<form id="searchForm" action="/Travel/packList">
   	여행지:
   	<input list="countryselect" id="packSearchCountry" name="packSearchCountry" placeholder="국가를 선택해 주세요" >
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
        여행시작일정 검색:
    <input type="date" id="PackStartDate" value="0000-00-00" name="PackStartDate">
    <input type="submit" value="검색">
</form>
<table class="table" align="center">
	<thead>
		<tr>
			<td>패키지 번호</td>
			<td>등록자</td>
			<td>목적국가</td>
			<td>제목</td>
			<td>여행시작일정</td>
			<td>여행종료일정</td>
			<td>모집인원</td>
			<td>신청마감일자</td>
			<td>가격</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="pack" items="${packList}">
			<tr>
				<td>${pack.pack_info_no}</td>
				<td>${pack.company_id}</td>
				<td>${pack.pack_info_country}</td>
				<td><a href="/Travel/packGetInfo?pack_info_no=${pack.pack_info_no}">${pack.pack_info_title}</a></td>
				<td>${pack.pack_info_start_date}</td>
				<td>${pack.pack_info_end_date}</td>
				<td>${pack.pack_info_person_number}</td>
				<td>${pack.pack_info_closing_date}</td>
				<td></td>
			</tr>
		</c:forEach>
	
	</tbody>
</table>
      <div class="text-center">
        <ul class="pagination justify-content-center">
            <c:if test="${prevPage}">
                <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Travel/packList?packSearchCountry=${packSearchCountry}&packStartDate=${packStartDate}&currentPage=${(currentBlock - 1) * pagePerBlock}">< 이전</a></li>
            </c:if>
            <c:forEach var="i" begin="${startPage}" end="${endPage}" step="1">
                <c:if test="${currentPage == i}">
                    <li class="page-item"><a class="page-link" href="#">${i}</a></li>
                </c:if>
                <c:if test="${currentPage != i}">
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Travel/packList?packSearchCountry=${packSearchCountry}&packStartDate=${packStartDate}&currentPage=${i}">${i}</a></li>
                </c:if>
            </c:forEach>
            <c:if test="${nextPage}">
                <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Travel/packList?packSearchCountry=${packSearchCountry}&packStartDate=${packStartDate}&currentPage=${currentBlock * pagePerBlock + 1}">다음 ></a></li>
            </c:if>
        </ul>
    </div>

</body>
</html>