package com.travel.member.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.admin.dto.AdminDTO;

//관리자 정보 Mapper Interface
@Mapper
public interface AdminMapper {
	// 관리자 회원가입
	int adminInsert(AdminDTO adminDTO);
	// 관리자 로그인
	int adminLogin(AdminDTO adminDTO);
	// 관리자 수정을 위한 조회
	AdminDTO adminSelectOne(String loginId);
	// 관리자 수정
	int adminUpdate(AdminDTO adminDTO);
	// 전체관리자 조회
	List<AdminDTO> adminSelectAll(int startRow, int rowPerPage);
	// 페이징처리를위한
	int adminSelectCount();
}
