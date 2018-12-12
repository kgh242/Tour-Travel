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
		<tr>
		    <c:forEach var="admin" items="${adminList}">
     			<td>${admin.admin_no}</td>
               	<td>${admin.admin_id}</td>
               	<td>${admin.admin_level}</td>
               	<td>${admin.admin_team}</td>
               	<td>${admin.admin_employee_no}</td>
               	<td>${admin.admin_employee_tell}</td>
               	<td>${admin.admin_date}</td>
         </tr>    
          	</c:forEach>
         <tr >
            <td>
            	<form action="">
            		<input type="text" />
            	</form>
            </td>
            <td colspan = "6" align="center">
                <ul class="pagination">
	                <c:if test="${pagingInfo.currentScreen > 1}">
	                    <li class="page-item"><a href="/adminList?currentPage=${(pagingInfo.currentScreen - 1) * pagingInfo.pagePerScreen}"><-</a></li>
	                </c:if>
	                <c:forEach var="i" begin="${pagingInfo.startScreenPage}" end="${pagingInfo.startScreenPage + pagingInfo.currentScreenPage - 1}" step="1">
	                    <li class="page-item" id = "pageItem${i}"><a href="/adminList?currentPage=${i}">${i}</a></li>
	                </c:forEach>
	                <c:if test="${pagingInfo.currentScreen <  pagingInfo.lastScreen}">
	                    <li class="page-item"><a href="/adminList?currentPage=${pagingInfo.currentScreen * pagingInfo.pagePerScreen + 1}">-></a></li>
	                </c:if>
                </ul>
     		 </td>
		</tr>
	</table>
</body>
</html>