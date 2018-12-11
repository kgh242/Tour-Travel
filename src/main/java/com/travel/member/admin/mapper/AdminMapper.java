package com.travel.member.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.admin.dto.AdminDTO;

//관리자 정보 Mapper Interface
@Mapper
public interface AdminMapper {
	int adminInsert(AdminDTO adminDTO);
	int adminLogin(AdminDTO adminDTO);
	AdminDTO adminSelectOne(String loginId);
	int adminUpdate(AdminDTO adminDTO);
}
