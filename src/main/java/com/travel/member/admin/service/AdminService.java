package com.travel.member.admin.service;


import java.util.HashMap;
import java.util.List;

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
	public List<AdminDTO> adminSelectAll(HashMap<String, Integer> pagingInfo, int currentPage, int rowPerPage, int pagePerScreen) {
		System.out.println("AdminService.java.adminSelectAll()");
		int totalCount; //리스트의 총 개수
	    int currentScreen; //현재 화면 번호
	    int lastScreen; //마지막 화면 번호
	    int currentScreenPage; //현재 화면에 보이는 페이지의 개수
	    int startScreenPage; //현재 화면에 보이는 페이지의 시작 번호
	    int lastPage; //마지막 페이지번호
	    totalCount = adminMapper.adminSelectCount();
	    lastPage = (int)Math.ceil((double)totalCount / rowPerPage);
	    currentScreen = (int)Math.ceil((double)currentPage / pagePerScreen); // 1~10 1번째 화면, 11~20 2번째 화면 
	    lastScreen = (int) Math.ceil((double)totalCount / (rowPerPage * pagePerScreen));// 한 페이지당 보여지는 리스트의 개수 10 * 한 화면에 보여지는 페이지의 개수 10 이면 총 100개가 하나의 화면에서 보여진다  리스트의 총개수를 100으로 나누어서 나누어 떨어지지 않으면 하나의 화면이 더 있다
	    startScreenPage = (currentScreen - 1) * pagePerScreen + 1; //한 화면에 10개의 페이지가 보여질때 첫번째 화면의 시작 페이지는 1, 두번째화면은 11..)
	    if(currentScreen == lastScreen) {//마지막 화면일때
	        if(totalCount % (rowPerPage * pagePerScreen) != 0) { //마지막 화면에 보이는 리스트 개수(rowPerPage * pagePerScreen)가 100개이면 totalCount % (rowPerPage * pagePerScreen)은 0이 되기때문에 pagePerScreen 값을 넣어주어야 한다
	            int temp = totalCount % (rowPerPage * pagePerScreen);//마지막 화면에서의 리스트의 개수
	            currentScreenPage = (int) Math.ceil((double) temp / rowPerPage);
	        }
	        else {
	            currentScreenPage = pagePerScreen;
	        }
	    }
	    else {
	        currentScreenPage = pagePerScreen;
	    }
	    pagingInfo.put("currentPage", currentPage);
	    pagingInfo.put("lastPage", lastPage);
	    pagingInfo.put("currentScreen", currentScreen);
	    pagingInfo.put("lastScreen", lastScreen);
	    pagingInfo.put("pagePerScreen", pagePerScreen);
	    pagingInfo.put("currentScreenPage", currentScreenPage);
	    pagingInfo.put("startScreenPage", startScreenPage);
	    int startRow = (currentPage - 1) * rowPerPage;
	    return adminMapper.adminSelectAll(startRow, rowPerPage);
	}
	// 페이징 처리를위한 관리자수 조회
	public int adminSelectCount() {
		System.out.println("AdminService.java.adminSelectCount()");
		return adminMapper.adminSelectCount();
	}
}
