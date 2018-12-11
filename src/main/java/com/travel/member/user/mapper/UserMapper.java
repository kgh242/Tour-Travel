package com.travel.member.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.user.dto.UserDTO;

//고객 정보 Mapper Interface

@Mapper
public interface UserMapper {
	
	int userInsert(UserDTO userDTO);
	int userImgUpdate(UserDTO userDTO);
	int userLogin(UserDTO userDTO);
	int userInterestInsert(String user_id, String user_interest);
	int userLanguageInsert(String user_id, String user_language);
	int userLocationInsert(String user_id, String user_location);	
	UserDTO userGetInfo(String user_id);
	
}
