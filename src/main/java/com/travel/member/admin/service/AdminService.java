package com.travel.member.admin.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.travel.member.admin.dto.AdminDTO;
import com.travel.member.admin.mapper.AdminMapper;


//관리자 정보 Service

@Service

public class AdminService {
	@Autowired
	private AdminMapper adminMapper;
	

	// 관리자가입 서비스
	public int adminAdd(AdminDTO adminDTO) {
		System.out.println("AdminService.java.adminAdd()");
			return adminMapper.adminInsert(adminDTO);
	}
	
	//관리자 로그인
	public int adminLogin(AdminDTO adminDTO) {
		System.out.println("AdminService.java.adminLogin()");
		return adminMapper.adminLogin(adminDTO);
	}
}
