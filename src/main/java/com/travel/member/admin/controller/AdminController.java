package com.travel.member.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.member.admin.dto.AdminDTO;
import com.travel.member.admin.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/adminAdd", method = RequestMethod.GET)
	public String adminAdd() {
		System.out.println("AdminController.java.userAdd().get");
		return "member/adminAdd";
	}

	@RequestMapping(value = "/adminAdd", method = RequestMethod.POST)
	public String adminAdd(AdminDTO adminDTO) {
		System.out.println("AdminController.java.userAdd().post");
		int result = adminService.adminAdd(adminDTO);
		if(result == 1) {
			System.out.println("입력성공");
		}else {
			System.out.println("입력실패");
		}
		return "main/index";
	}

	@RequestMapping(value= "/adminLogin", method = RequestMethod.GET)
	public String adminLogin() {
		System.out.println("AdminController.java.adminLogin().get");
		return "member/adminLogin";
	}
	
	@RequestMapping(value= "/adminLogin", method = RequestMethod.POST)
	public String adminLogin(HttpSession session, AdminDTO adminDTO) {
		System.out.println("AdminController.java.adminLogin().post");
		
		int result = adminService.adminLogin(adminDTO);
		if(result == 1) {
			System.out.println("로그인 성공......userLogin.java");
			session.setAttribute("LOGINID", adminDTO.getAdmin_id());
			return "main/admin"; 
		}else {
			System.out.println("로그인 실패");
			return "member/adminLogin";
		}
	}
	
/*	@RequestMapping(value= "/userLogout", method = RequestMethod.GET)
	public String userLogout(HttpSession session) {
		System.out.println("user 로그아웃 액션......userLogout.java");
		session.invalidate();
		return "main/index";
	}*/
}
