<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>

	일반회원 회원 가입 창여

	<form name = "addInfo" onsubmit="return addInfoSubmit()" action="/userAdd" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" id="user_id" name="user_id"> <input
					type="button" id="user_id_check" name="user_id_check" value="중복확인">
					${id_hepler}</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" id="user_pw" name="user_pw"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="password" id="user_pw_check"
					name="user_pw_check"></td>
			</tr>
			<tr>
				<td>닉네임</td>
				<td><input type="text" id="user_nickname" name="user_nickname">
					<input type="button" id="user_nickname_check"
					name="user_nickname_check" value="중복확인">
					${nickname_helpler}</td>

			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" id="user_name" name="user_name"></td>
			</tr>
			<tr>
				<td>생일</td>
				<td><input type="date" id="user_birth" name="user_birth"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><select name="user_gender" id="user_gender">
						<option name="m">남</option>
						<option name="f">여</option>
				</select></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" id="user_address" name="user_address"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" id="user_email" name="user_email"></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type="text" id="user_tell" name="user_tell"></td>
			</tr>
			<tr>
				<td>자기소개</td>
				<td><input type="text" id="user_introduction" name ="user_introduction"></td>
			</tr>
			<tr>
				<td>이미지</td>
				<td><input type="file" id="user_img" name="user_img"></td>
			</tr>
			<tr>
				<td>관심사</td>
				<td>
					<input type=checkbox name='interest' value='레저'> 레저
					<input type=checkbox name='interest' value='관광'> 관광
					<input type=checkbox name='interest' value='휴양'> 휴양
					<input type=checkbox name='interest' value='쇼핑'> 쇼핑
				</td>
			</tr>
			<tr>
				<td>사용가능언어</td>
				<td>
					<input type=checkbox name='language' value='영어'> 영어
					<input type=checkbox name='language' value='중국어'> 중국어
					<input type=checkbox name='language' value='일본어'> 일본어
					<input type=checkbox name='language' value='불어'> 불어
				</td>
			</tr>
			<tr>
				<td>관심여행지</td>
				<td>
					<input type=checkbox name='location' value='미주'> 미주
					<input type=checkbox name='location' value='유럽'> 유럽
					<input type=checkbox name='location' value='동남아'> 동남아
					<input type=checkbox name='location' value='아시아'> 아시아
				</td>
			</tr>
			<tr>

				<td></td>
				<td><input type="submit" value="입력완료"></td>
			</tr>
		</table>
	</form>

</body>
<script type = "text/javascript">
function addInfoSubmit() {
    var myform = document.forms['addInfo'];
    if( myform['user_id'].value.length < 1) {
        alert( '아이디를 입력하세요');
        return false;
    }
    if( myform['user_pw'].value.length < 1) {
        alert( '패스워드를 입력하세요');
        return false;
    }
    if( myform['user_nickname'].value.length < 1) {
    	alert( '닉네임을 입력하세요');
    	return false;
    }
    if( myform['user_birth'].value.length < 1) {
    	alret( '생년월일를 입력하세요');
    	return false;
    }	    
    if( myform['user_gender'].value.length < 1) {
    	alret( '성별을 입력하세요');
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

</html>