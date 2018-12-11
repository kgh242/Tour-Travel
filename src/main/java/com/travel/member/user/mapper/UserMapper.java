package com.travel.member.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.user.dto.UserDTO;

//고객 정보 Mapper Interface

@Mapper
public interface UserMapper {
	
	int userInsert(UserDTO userDTO);
	int userImgUpdate(UserDTO userDTO);

	
}
