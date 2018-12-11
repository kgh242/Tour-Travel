<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${LOGINID == null}">
		�α��� �� ������ּ���
	</c:if>
	<c:if test="${LOGINID != null}">
		${LOGINID}!! LOGIN <br>
		<a href="/userLogout">LOGOUT</a>
	</c:if>
	<table>
		<thead>
			<tr>
				<td>���̵�</td>
				<td>�г���</td>
				<td>�ּ�</td>
				<td>�̸���</td>
				<td>����ó</td>
				<td>�ڱ�Ұ�</td>
				<td>ȸ�������ʻ���</td>
				<td>������û</td>
				<td>����</td>
				<td>Ż��</td>
				
			</tr>
		</thead>
		<tbody>

			<tr>
				<td></td>
				<td>${userDTO.user_nickname}</td>
				<td>${userDTO.user_address}</td>
				<td>${userDTO.user_email}</td>
				<td>${userDTO.user_tell}</td>
				<td>${userDTO.user_introduction}</td>
			</tr>

		</tbody>
	</table>

</body>
</html>