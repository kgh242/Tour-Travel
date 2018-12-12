package com.travel.member.user.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.travel.member.user.dto.UserDTO;
import com.travel.member.user.mapper.UserMapper;

//고객 정보 Service

@Service
@Transactional
public class UserService {

	@Autowired
	private UserMapper userMapper;
	

	// 회원가입 서비스
	public int userAdd(UserDTO userDTO, String[] interest, String[] language, String[] location) {
		
		System.out.println("userAdd 서비스 계층......UserService.java");
		MultipartFile multipartFile = null;

		int result = 0; // 0은 둘다 입력안됨, 1 계정만입력, 2 계정이미지까지 입력
		if (userDTO.getUser_img().isEmpty()) {

			try {

				userMapper.userInsert(userDTO);
				
				for(String val : interest) {
					userMapper.userInterestInsert(userDTO.getUser_id(), val);
				}
				for(String val : language) {
					userMapper.userLanguageInsert(userDTO.getUser_id(), val);
				}
				for(String val : location) {
					userMapper.userLocationInsert(userDTO.getUser_id(), val);
				}

				result = 1;
				
			} catch (Error e) {
				
				System.out.println("userInsert 에러발생");
				System.out.println("userInsert Error : " + e);
				
			}
			
			System.out.println("이미지업로드 없음");
			
		} else {
			
			System.out.println("이미지업로드 실행");
			multipartFile = userDTO.getUser_img();
			UserDTO userImgDTO = new UserDTO();

			System.out.println("유저 아이디 세팅");
			userImgDTO.setUser_id(userDTO.getUser_id());
			
			System.out.println("이미지 패스 추출");
			File f = new File("");
			String path = f.getAbsolutePath();
			userImgDTO.setUser_img_path(path);
			f.delete();
			System.out.println(path);

			System.out.println("이미지 파일 본칭");
			String originalFileName = multipartFile.getOriginalFilename();
			String trueName = originalFileName.substring(0, originalFileName.lastIndexOf('.'));
			userImgDTO.setUser_img_true_name(trueName);
			System.out.println(trueName);

			System.out.println("이미지 파일 가칭");
			String falseName = UUID.randomUUID().toString();
			userImgDTO.setUser_img_false_name(falseName);
			System.out.println(falseName);

			System.out.println("이미지 확장자 추출");
			String ext = originalFileName.substring(originalFileName.lastIndexOf(".")+1);
			userImgDTO.setUser_img_ext(ext);
			System.out.println(ext);

			System.out.println("이미지 파일 크기");
			userImgDTO.setUser_img_size(multipartFile.getSize());
			System.out.println(multipartFile.getSize());
			System.out.println(multipartFile.getSize());
			
			
			try {
				
				userMapper.userInsert(userDTO);
				userMapper.userImgUpdate(userImgDTO);
				for(String val : interest) {
					userMapper.userInterestInsert(userDTO.getUser_id(), val);
				}
				for(String val : language) {
					userMapper.userLanguageInsert(userDTO.getUser_id(), val);
				}
				for(String val : location) {
					userMapper.userLocationInsert(userDTO.getUser_id(), val);
				}
	
				result = 2;
	
				File file = new File(path + File.separator + "uploads" + File.separator + "userImg");
				if (file.exists()) {
					System.out.println("transferTo" + path + "......UserService.java");
					try {
						multipartFile.transferTo(
								new File(path + File.separator + "uploads" + File.separator + "userImg" + File.separator + falseName + "." + ext));
					} catch (IllegalStateException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("transferTo" + path + "......UserService.java");
					file.mkdirs();
					try {
						multipartFile.transferTo(
								new File(path + File.separator + "uploads" + File.separator + "userImg" + File.separator + falseName + "." + ext));
					} catch (IllegalStateException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
	
				}
				
			} catch (Error e) {
				
				System.out.println("userInsert 에러발생");
				System.out.println("userInsert Error : " + e);
				
			}

			

		}
		return result;
	}
	
	// 유저 로그인
	public int userLogin(UserDTO userDTO) {
		System.out.println("userLogin 서비스 계층......UserService.java");
		return userMapper.userLogin(userDTO);
	}
	
	// 유저 내 정보보기
	public UserDTO userGetInfo(String user_id) {
		System.out.println("userGetInfo 서비스 계층......userGetInfo.java");
		
		UserDTO userImg = new UserDTO();
		userImg = userMapper.userGetInfo(user_id);
		//(userImg.getUser_img_path() + + userImg.getUser_img_false_name() + + userImg.getUser_img_ext());
		
		return userMapper.userGetInfo(user_id);
	}

	// 유저 업데이트
	public int userUpdate(UserDTO userDTO) {
		System.out.println("userUpdate 서비스 계층......UserService.java");
		return userMapper.userUpdate(userDTO);
	}
	
	// 유저 인증신청
	public int userAuth(String user_id) {
		System.out.println("userAuth 서비스 계층......UserService.java");
		return userMapper.userAuth(user_id);
	}
	
	// 유저 탈퇴
	public int userDelete(String user_id) {
		System.out.println("userDelete 서비스 계층......UserService.java");
		//부가정보 CASCADE 삭제
		return userMapper.userDelete(user_id);
	}
	
	// 모든 유저 조회
	public List<UserDTO> userList() {
		System.out.println("userList 서비스 계층......UserService.java");
		return userMapper.userList();
	}
	
}
