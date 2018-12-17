package com.travel.member.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.admin.dto.AdminDTO;
import com.travel.paging.PageMaker;

//관리자 정보 Mapper Interface
@Mapper
public interface AdminMapper {
	// 관리자 회원가입
	int adminInsert(AdminDTO adminDTO);
	// 관리자 로그인
	AdminDTO adminLogin(AdminDTO adminDTO);
	// 관리자 수정을 위한 조회
	AdminDTO adminSelectOne(AdminDTO adminDTO);
	// 관리자 수정
	int adminUpdate(AdminDTO adminDTO);
	// 전체관리자 조회
	List<AdminDTO> adminSelectAll(PageMaker pageMaker);
	// 페이징처리를위한
	int adminSelectCount();
	// 관리자 삭제
	int adminDelete(AdminDTO adminDTO);
}
