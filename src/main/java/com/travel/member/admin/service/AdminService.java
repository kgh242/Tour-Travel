package com.travel.member.admin.service;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.travel.member.admin.dto.AdminDTO;
import com.travel.member.admin.mapper.AdminMapper;
import com.travel.paging.PageMaker;


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
	// 관리자 수정을위한 select
	public AdminDTO adminSelectOne(String loginId) {
		System.out.println("AdminService.java.adminSelectOne()");
		return adminMapper.adminSelectOne(loginId);
	}
	// 관리자 수정
	public int adminUpdate(AdminDTO adminDTO) {
		System.out.println("AdminService.java.adminUpdate()");
		return adminMapper.adminUpdate(adminDTO);
	}
	// 전체 관리자 조회
	public List<AdminDTO> adminSelectAll(PageMaker pageMaker) {
		System.out.println("AdminService.java.adminSelectAll()");
	    // 페이징 관련 코드(set메서드 순서를 지켜야함)
        // 페이징에서 기본적으로 넣어줘야 할 값을 설정
        pageMaker.setRowPerPage(10);
        pageMaker.setPagePerBlock(10);
        pageMaker.setAllCount(adminMapper.adminSelectCount());
        // 페이징에 필요한 값 계산하여 설정
        pageMaker.setStartRow();
        pageMaker.setLastPage();
        pageMaker.setCurrentBlock();
        pageMaker.setLastBlock();
        pageMaker.setStartPage();
        pageMaker.setEndPage();
        // 이전 페이지와 다음 페이지를 컨트롤하는 조건문
  
        if(pageMaker.getCurrentBlock() != pageMaker.getLastBlock() && pageMaker.getCurrentBlock() >1){
            System.out.println("true<>true");
        	pageMaker.setPrevPage(true);
            pageMaker.setNextPage(true);
  
        }else  if(pageMaker.getCurrentBlock() != pageMaker.getLastBlock() && pageMaker.getLastBlock() != 1) {
            System.out.println("false<>true");
        	pageMaker.setPrevPage(false);
            pageMaker.setNextPage(true);
      	
        }else if(pageMaker.getCurrentBlock() <= pageMaker.getLastBlock() && pageMaker.getCurrentBlock() != 1){
            System.out.println("true<>false");	
        	pageMaker.setPrevPage(true);
            pageMaker.setNextPage(false);   
        	
        }else if(pageMaker.getLastBlock() == 1) {
        	System.out.println("false<>false");  
        	pageMaker.setPrevPage(false);
            pageMaker.setNextPage(false); 
        }
        System.out.println(pageMaker.getLastBlock()+"<마지막블럭");
        System.out.println(pageMaker.getCurrentBlock()+"<현재블럭");
        System.out.println(pageMaker.isNextPage()+"<다음페이지버튼");
        System.out.println(pageMaker.isPrevPage()+"<이전페이지버튼"); 
	    return adminMapper.adminSelectAll(pageMaker);
	} 
	// 페이징 처리를위한 관리자수 조회
	public int adminSelectCount() {
		System.out.println("AdminService.java.adminSelectCount()");
		return adminMapper.adminSelectCount();
	}
}
