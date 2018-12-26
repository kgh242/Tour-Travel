package com.travel.member.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.user.dto.UserDTO;
import com.travel.paging.PageMaker;

//고객 정보 Mapper Interface

@Mapper
public interface UserMapper {
	
	int userInsert(UserDTO userDTO);
	int userImgUpdate(UserDTO userDTO);
	int userLogin(UserDTO userDTO);
	int userUpdate(UserDTO userDTO);
	int userAuth(String user_id);
	int userDelete(String user_id);
	List<UserDTO> userList(PageMaker pageMaker);
	// 페이징처리를위한
	int userSelectCount();
	int userInterestInsert(String user_id, String user_interest);
	int userLanguageInsert(String user_id, String user_language);
	int userLocationInsert(String user_id, String user_location);	
	UserDTO userGetInfo(String user_id);
	
}
