package com.travel.member.user.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.travel.image.ImgDTO;
import com.travel.image.ImgHelper;
import com.travel.member.user.dto.UserDTO;
import com.travel.member.user.mapper.UserMapper;
import com.travel.pack.dto.PackDTO;
import com.travel.paging.PageMaker;

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
		//이미지 정보 추출을 위한 ImgHelper 활용
		ImgHelper imgHelper = new ImgHelper();
		ImgDTO imgDTO = new ImgDTO();
		int result = 0; // 0은 둘다 입력안됨, 1 계정만입력, 2 계정이미지까지 입력
		
		if (userDTO.getUser_img().isEmpty()) {
			System.out.println("3...");
			try {
				userMapper.userInsert(userDTO);
				
				// interest 선택이없을 시 interest insert쿼리 활성화되지않음
				if(interest!=null) {
					for(String val : interest) {
						userMapper.userInterestInsert(userDTO.getUser_id(), val);
					}
				}
				
				if(language!=null) {
					for(String val : language) {
						userMapper.userLanguageInsert(userDTO.getUser_id(), val);
					}
				}
				
				if(location!=null) {
					for(String val : location) {
						userMapper.userLocationInsert(userDTO.getUser_id(), val);
					}
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
			
			//이미지 정보 추출
			//추출된정보를저장할객체 = 이미지헬퍼(이미지정보추출)객체의 추출메서드(메서드호출시 넘겨받은 이미지)
			//매퍼로담아보내기위한객체.set세팅메서드(추출된 정보를저장할객체.get)			
			
			imgDTO = imgHelper.imgHelper(userDTO.getUser_img());
			userImgDTO.setUser_img_path(imgDTO.getImgPath());
			userImgDTO.setUser_img_true_name(imgDTO.getImgTrueName());
			userImgDTO.setUser_img_false_name(imgDTO.getImgFalseName());
			userImgDTO.setUser_img_ext(imgDTO.getImgExt());
			userImgDTO.setUser_img_size(imgDTO.getImgSize());
			
/*			System.out.println("이미지 패스 추출");
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
			*/
			
			try {
				
				//두개를 나눈 이유는, INSERT만 사용시에 insert쿼리가 이미지 데이터가 있을떄 없을때 두가지로 만들어야함
				//이미지 업로드 기능의 쿼리 사용하면 따로 insert쿼리 두가지를 만들지 않고 update기능이용 동시에 입력
				userMapper.userInsert(userDTO);
				int imgresult = userMapper.userImgUpdate(userImgDTO);

				if(interest!=null) {
					for(String val : interest) {
						userMapper.userInterestInsert(userDTO.getUser_id(), val);
					}
				}
				
				if(language!=null) {
					for(String val : language) {
						userMapper.userLanguageInsert(userDTO.getUser_id(), val);
					}
				}
				
				if(location!=null) {
					for(String val : location) {
						userMapper.userLocationInsert(userDTO.getUser_id(), val);
					}
				}
	
				result = 2;
	
				//파일 이동을 위한 경로 설정
				if(imgresult==1) 
				{
					File file = new File(userImgDTO.getUser_img_path() + File.separator + "uploads" + File.separator + "userImg");
					if (file.exists()) {
						System.out.println("transferTo" + userImgDTO.getUser_img_path() + "......UserService.java");
						try {
							multipartFile.transferTo(
									new File(userImgDTO.getUser_img_path() + File.separator + "uploads" + File.separator + "userImg" + File.separator + userImgDTO.getUser_img_false_name() + "." + userImgDTO.getUser_img_ext()));
						} catch (IllegalStateException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						System.out.println("transferTo" + userImgDTO.getUser_img_path() + "......UserService.java");
						file.mkdirs();
						try {
							multipartFile.transferTo(
									new File(userImgDTO.getUser_img_path() + File.separator + "uploads" + File.separator + "userImg" + File.separator + userImgDTO.getUser_img_false_name() + "." + userImgDTO.getUser_img_ext()));
						} catch (IllegalStateException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
		
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
		return userMapper.userGetInfo(user_id);
	}

	// 유저 업데이트
	public int userUpdate(UserDTO userDTO) {
		System.out.println("userUpdate 서비스 계층......UserService.java");
		int result = 0;
		try {
			result = userMapper.userUpdate(userDTO);
		} catch (Error e) {
			System.out.println("userUpdate 서비스 계층 에러발생......UserService.java : " + e);
		} finally {
		}
		return result;
	}
	
	// 유저 인증신청
	public int userAuth(String user_id) {
		System.out.println("userAuth 서비스 계층......UserService.java");
		int result = 0;
		try {
			result = userMapper.userAuth(user_id);
		} catch (Error e) {
			System.out.println("userAuth 서비스 계층 에러발생......UserService.java : " + e);
		}
		return result;
	}
	
	// 유저 탈퇴
	public int userDelete(String user_id) {
		System.out.println("userDelete 서비스 계층......UserService.java");
		
		//부가정보 CASCADE 삭제
		
		UserDTO userDTO = userMapper.userGetInfo(user_id);
		int result = 0;
		
		try {
			result = userMapper.userDelete(user_id);
			
			//transfer로 저장된 이미지를 삭제하기위한 코드
			if(userDTO.getUser_img_true_name()==null) {
				System.out.println("userDelete 서비스 계층, 삭제할 이미지 없음......UserService.java");	
			} else if(userDTO.getUser_img_true_name()!=null) {
				System.out.println("userDelete 서비스 계층, 이미지 삭제 실행......UserService.java");
				File file = new File(userDTO.getUser_img_path()+File.separator+"uploads"+File.separator+"userImg"+File.separator+userDTO.getUser_img_false_name()+"."+userDTO.getUser_img_ext());
				if(file.exists()) {
					try {
						System.out.println("userDelete 서비스계층 파일삭제성공");
						file.delete();
					} catch (Error e) {
						System.out.println("userDelete 서비스계층 파일삭제 실패, 에러......UserService.java : " + e);
					}
				}
			}
			
		} catch (Error e) {
			System.out.println("userDelete 서비스 계층 에러발생......UserService.java : " + e);
		}
		
		
		return result;
		
	}
	
	// 모든 유저 조회
	public List<UserDTO> userList(PageMaker pageMaker) {
		System.out.println("userList 서비스 계층......UserService.java");
		pageMaker.setRowPerPage(10);
        pageMaker.setPagePerBlock(10);
        pageMaker.setAllCount(userMapper.userSelectCount());
        // 페이징에 필요한 값 계산하여 설정
        pageMaker.setStartRow();
        pageMaker.setLastPage();
        pageMaker.setCurrentBlock();
        pageMaker.setLastBlock();
        pageMaker.setStartPage();
        pageMaker.setEndPage();
     // 이전 페이지와 다음 페이지를 컨트롤하는 조건문
        if(pageMaker.getCurrentBlock() != pageMaker.getLastBlock() && pageMaker.getCurrentBlock() >1){
        	pageMaker.setPrevPage(true);
            pageMaker.setNextPage(true);
        }else  if(pageMaker.getCurrentBlock() != pageMaker.getLastBlock() && pageMaker.getLastBlock() != 1) {
        	pageMaker.setPrevPage(false);
            pageMaker.setNextPage(true);
        }else if(pageMaker.getCurrentBlock() <= pageMaker.getLastBlock() && pageMaker.getCurrentBlock() != 1){
        	pageMaker.setPrevPage(true);
            pageMaker.setNextPage(false);   
        }else if(pageMaker.getLastBlock() == 1) {
        	pageMaker.setPrevPage(false);
            pageMaker.setNextPage(false); 
        }
	    return userMapper.userList(pageMaker);
	}
	public int userSelectCount() {
		System.out.println("UserService.java.userSelectCount()");
		return userMapper.userSelectCount();
	}
}
