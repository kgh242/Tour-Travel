<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyAdd</title>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#submit").click(function(){
			if($('#company_id').val()==""){
				alert("아이디를 입력하세요");
				$('#company_id').focus();
			} else if($('#company_pw').val()==""){
				alert("비밀번호를 입력하세요");
				$('#company_pw').focus();
			} else if($('#company_pw_check').val()==""){
				alert("비밀번호 확인을 입력하세요");
				$('#company_pw_check').focus();
			} else if($('#company_pw').val()!=$('#company_pw_check').val()){
				alert("비밀번호와 비밀번호 확인이 일치하지않습니다");
				$('#company_pw').val('');
				$('#company_pw_check').val('');
				$('#company_pw_same').focus();
			} else if($('#company_name').val()==""){
				alert("회사이름을 입력하세요");
				$('#company_name').focus();
			} else if($('#company_tell1').val()==""){
				alert("담당자연락처를 입력하세요");
				$('#company_tell1').focus();
			} else if($('#company_address').val()==""){
				alert("회사주소를 입력하세요");
				$('#company_address').focus();
			} else if($('#company_business_no').val()==""){
				alert("사업자번호를 입력하세요");
				$('#company_business_no').focus();
			} else if($('#company_branch_tell').val()==""){
				alert("회사대표연락처를 입력하세요");
				$('#company_branch_tell').focus();
			} else if($('#company_img').val()==""){
				alert("이미지를 등록하세요");
				$('#company_img').focus();
			} else {
				alert("신청완료");
			}
		});
	});
</script>
</head>
<body>
여행사 회원 가입 신청
<form action = "/member/companyAdd"  id="companyAdd" name="companyAdd" enctype="multipart/form-data" method="post">
	<table border="1">
		<tr>
			<td>필수 : 아이디</td>
			<td><input type="text" id="company_id" name="company_id" /></td>
		</tr>
		<tr>
			<td>필수 : 비밀번호</td>
			<td><input type="password" id="company_pw" name="company_pw" /></td>
		</tr>
		<tr>
			<td>필수 : 비밀번호 확인</td>
			<td><input type="password" id="company_pw_check" name="company_pw_check" /></td>
		</tr>
		<tr>
			<td>필수 : 회사이름</td>
			<td><input type="text" id="company_name" name="company_name" /></td>
		</tr>
		<tr>
			<td>필수 : 담당자연락처</td>
			<td><input type="text" id="company_tell1" name="company_tell1" /></td>
		</tr>
		<tr>
			<td>선택 : 담당자연락처2</td>
			<td><input type="text" id="company_tell2" name="company_tell2"/></td>
		</tr>
		<tr>
			<td>필수 : 회사주소</td>
			<td><input type="text" id="company_address" name="company_address"/></td>
		</tr>
		<tr>
			<td>필수 : 사업자번호</td>
			<td><input type="text" id="company_business_no" name="company_business_no"/></td>
		</tr>
		<tr>
			<td>필수 : 회사대표연락처</td>
			<td><input type="text" id="company_branch_tell" name="company_branch_tell"/></td>
		</tr>
		<tr>
			<td>선택 : 본사연락처(해당경우에만)</td>
			<td><input type="text" id="company_head_tell" name="company_head_tell"/></td>
		</tr>
		<tr>
			<td>필수 : 이미지</td>
			<td><input type="file" id="company_img" name="company_img"></td>
		</tr>
		<tr>
			<td>등록신청</td>
			<td><input type="button" id="submit" value="완료"></td>
		</tr>
	</table>
</form>
</body>
</html>