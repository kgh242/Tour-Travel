<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
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
     			<td align="center">${admin.admin_no}</td>
               	<td align="center">${admin.admin_id}</td>
               	<td align="center">${admin.admin_level}</td>
               	<td align="center">${admin.admin_team}</td>
               	<td align="center">${admin.admin_employee_no}</td>
               	<td align="center">${admin.admin_employee_tell}</td>
               	<td align="center">${admin.admin_date}</td>
         </tr>    
          	</c:forEach>
         <tr >
            <td colspan = "5" align="center">
                <c:if test="${pagingInfo.currentScreen > 1}">
                    <li class="page-item"><a href="/sample/sampleList?currentPage=${(pagingInfo.currentScreen - 1) * pagingInfo.pagePerScreen}"><</a></li>
                </c:if>
                <c:forEach var="i" begin="${pagingInfo.startScreenPage}" end="${pagingInfo.startScreenPage + pagingInfo.currentScreenPage - 1}" step="1">
                    <li class="page-item" id = "pageItem${i}"><a href="/sample/sampleList?currentPage=${i}">${i}</a></li>
                </c:forEach>
                <c:if test="${pagingInfo.currentScreen <  pagingInfo.lastScreen}">
                    <li class="page-item"><a href="/sample/sampleList?currentPage=${pagingInfo.currentScreen * pagingInfo.pagePerScreen + 1}">></a></li>
                </c:if>
     		 </td>
		</tr>
	</table>
</body>
</html>