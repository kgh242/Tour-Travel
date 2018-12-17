package com.travel.member.admin.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.travel.member.admin.dto.AdminDTO;
import com.travel.member.admin.service.AdminService;
import com.travel.paging.PageMaker;

@Controller
@RequestMapping(value = "/Travel")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	//관리자회원가입화면
	@RequestMapping(value = "/adminAdd", method = RequestMethod.GET)
	public String adminAdd() {
		System.out.println("AdminController.java.userAdd().GET");
		return "member/adminAdd";
	}
	// 관리자 회원가입
	@RequestMapping(value = "/adminAdd", method = RequestMethod.POST)
	public String adminAdd(AdminDTO adminDTO) {
		System.out.println("AdminController.java.userAdd().POST");
		int result = adminService.adminAdd(adminDTO);
		if(result == 1) {
			System.out.println("입력성공");
		}else {
			System.out.println("입력실패");
		}
		return "main/admin";
	}
	// 관리자 로그인화면
	@RequestMapping(value= "/adminLogin", method = RequestMethod.GET)
	public String adminLogin() {
		System.out.println("AdminController.java.adminLogin().GET");
		return "member/adminLogin";
	}
	//관리자 로그인
	@RequestMapping(value= "/adminLogin", method = RequestMethod.POST)
	public String adminLogin(HttpSession session, AdminDTO adminDTO) {
		System.out.println("AdminController.java.adminLogin().POST");
		
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
	// 관리자 수정화면
	@RequestMapping(value= "/adminUpdate", method = RequestMethod.GET)
	public String adminUpdate(Model model,@RequestParam(value="LOGINID")String loginId) {
		System.out.println("AdminController.java.adminUpdate().GET");
		AdminDTO adminDTO = new AdminDTO();
		System.out.println(loginId+"<--loginId");
		adminDTO = adminService.adminSelectOne(loginId);
		System.out.println(adminDTO);
		model.addAttribute("admin",adminDTO);
		return "member/adminUpdate";
	}
	// 관리자 수정
	@RequestMapping(value = "/adminUpdate", method = RequestMethod.POST)
	public String adminUpdate(AdminDTO adminDTO) {
		System.out.println("AdminController.java.adminUpdate().POST");
		int result = adminService.adminUpdate(adminDTO);
		if(result == 1) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
		return "main/admin";
	}
	//관리자 리스트
	@RequestMapping(value= "/adminList", method = RequestMethod.GET)
	public String adminList(@RequestParam(value="currentPage", defaultValue = "1") int currentPage, Model model,PageMaker pageMaker) {
		System.out.println("AdminController.java.adminList().GET");
		pageMaker.setCurrentPage(currentPage);
		List<AdminDTO> adminList = adminService.adminSelectAll(pageMaker);
		model.addAttribute("adminList", adminList);
		model.addAttribute("currentPage", currentPage);
        model.addAttribute("pagePerBlock", pageMaker.getPagePerBlock());
        model.addAttribute("currentBlock", pageMaker.getCurrentBlock());
        model.addAttribute("startPage", pageMaker.getStartPage());
        model.addAttribute("endPage", pageMaker.getEndPage());
        model.addAttribute("prevPage", pageMaker.isPrevPage());
        model.addAttribute("nextPage", pageMaker.isNextPage());
		//model.addAttribute("pageMaker", pageMaker);
		return "member/adminList";
	}
	//관리자 로그아웃
	@RequestMapping(value= "/adminLogout", method = RequestMethod.GET)
	public String adminLogout(HttpSession session) {
		System.out.println("AdminController.java.adminLogout().GET");
		session.invalidate();
		return "redirect:/adminLogin";
	}
}
