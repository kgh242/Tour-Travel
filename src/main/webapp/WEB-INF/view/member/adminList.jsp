<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<table class="table" align="center">
		<tr>
			<td>admin_no</td>
			<td>admin_id</td>
			<td>admin_level</td>
			<td>admin_team</td>
			<td>admin_employee_no</td>
			<td>admin_employee_tell</td>
			<td>admin_date</td>
		</tr>
		 <c:forEach var="admin" items="${adminList}">
		<tr>
     			<td>${admin.admin_no}</td>
               	<td>${admin.admin_id}</td>
               	<td>${admin.admin_level}</td>
               	<td>${admin.admin_team}</td>
               	<td>${admin.admin_employee_no}</td>
               	<td>${admin.admin_employee_tell}</td>
               	<td>${admin.admin_date}</td>
         </tr>    
          	</c:forEach>
   </table>
      <div class="text-center">
        <ul class="pagination justify-content-center">
            <c:if test="${prevPage}">
                <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Travel/adminList?currentPage=${(currentBlock - 1) * pagePerBlock}">< 이전</a></li>
            </c:if>
            <c:forEach var="i" begin="${startPage}" end="${endPage}" step="1">
                <c:if test="${currentPage == i}">
                    <li class="page-item"><a class="page-link" href="#">${i}</a></li>
                </c:if>
                <c:if test="${currentPage != i}">
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Travel/adminList?currentPage=${i}">${i}</a></li>
                </c:if>
            </c:forEach>
            <c:if test="${nextPage}">
                <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Travel/adminList?currentPage=${currentBlock * pagePerBlock + 1}">다음 ></a></li>
            </c:if>
        </ul>
    </div>
</body>
</html>