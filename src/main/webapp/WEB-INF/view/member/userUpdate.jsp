<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<script type = "text/javascript">
	if(${result==0}){
		alert("수정실패");
	}

</script>

<body>
일반회원 정보 수정

<form name = "updateInfo" onsubmit="return updateInfoSubmit()" action = "/Travel/userUpdateAction" method = "post" enctype="multipart/form-data">
<table>
	<tr>
		<td>아이디</td>
		<td>
			<input type = "text" id = "user_id" name = "user_id" value = "${userDTO.user_id}" readonly="readonly">
		</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type = "password" id = "user_pw" name = "user_pw"></td>
	</tr>
	<tr>
		<td>비밀번호 확인</td>
		<td><input type = "password" id = "user_pw_check" name = "user_pw_check"></td>
	</tr>
	<tr>
		<td>닉네임</td>
		<td>
			<input type = "text" id = "user_nickname" name = "user_nickname" value = "${userDTO.user_nickname}">
			<input type = "button" id = "user_nickname_check" name = "user_nickname_check" value="중복확인">
			${nickname_helpler}
		</td>

	</tr>
	<tr>
		<td>이름</td>
		<td><input type = "text" id = "user_name" name = "user_name" value = "${userDTO.user_name}"></td>
	</tr>

	<tr>
		<td>주소</td>
		<td><input type = "text" id = "user_address" name = "user_address" value = "${userDTO.user_address}"></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type = "email" id = "user_email" name = "user_email" value = "${userDTO.user_email}"></td>
	</tr>
	<tr>
		<td>연락처</td>
		<td><input type = "text" id = "user_tell" name = "user_tell" value = "${userDTO.user_tell}"></td>
	</tr>
	<tr>
		<td>자기소개</td>
		<td><input type = "text" id = "user_introduction" name = "user_introduction" value = "${userDTO.user_introduction}"></td>
	</tr>
	<tr>
		<td>이미지</td>
		<td><input type = "file" id = "user_img" name = "user_img"></td>
	</tr>
	<tr>
		<td></td>
		<td><input type = "submit" id = "updateBtn" value = "입력완료"></td>
	</tr>
</table>
</form>

<script type = "text/javascript">
function updateInfoSubmit() {
    var myform = document.forms['updateInfo'];

    if( myform['user_pw'].value.length < 1) {
        alert( '패스워드를 입력하세요');
        return false;
    }
    if( myform['user_nickname'].value.length < 1) {
    	alert( '닉네임을 입력하세요');
    	return false;
    }
    if( myform['user_address'].value.length < 1) {
    	alret( '주소를 입력하세요');
    	return false;
    }	
    if( myform['user_email'].value.length < 1) {
    	alert( '이메일을 입력하세요');
    	return false;
    }
    
    if( myform['user_tell'].value.length < 1) {
        alert( '연락처를 입력하세요');
        return false;
    }

    return true;
}
</script>


</body>
</html>