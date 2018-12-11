package com.travel.member.user.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.travel.member.user.dto.UserDTO;
import com.travel.member.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/userAdd", method = RequestMethod.GET)
	public String userAdd() {
		System.out.println("user 회원가입 창으로 이동......UserController.java");
		return "member/userAdd";
	}

	@RequestMapping(value = "/userAdd", method = RequestMethod.POST)
	public String userAdd(UserDTO userDTO, @RequestParam(value = "interest") String[] interest, @RequestParam(value = "language") String[] language, @RequestParam(value = "location") String[] location) {
		System.out.println("user 회원가입 액션......UserController.java");
		int result = userService.userAdd(userDTO, interest, language, location);

		if(result==0) {
			System.out.println("회원가입실패");
			return "member/userAdd";
		}else {
			if(result == 1) {
				System.out.println("회원가입성공 (이미지없음)");
			} else if(result == 2) {
				System.out.println("회원가입성공 (이미지있음)");
			}
			return "main/index";
		}
	}
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin() {
		System.out.println("user 로그인창으로 이동......UserController.java");
		return "member/userLogin";
	}
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String userLogin(HttpSession session, UserDTO userDTO) {
		System.out.println("user 로그인 액션......UserController.java");
		
		int result = userService.userLogin(userDTO);
		if(result == 1) {
			System.out.println("로그인 성공......UserController.java");
			session.setAttribute("LOGINID", userDTO.getUser_id());
			return "main/index"; 
		}else {
			System.out.println("로그인 실패");
			return "member/userLogin";
		}
	}
	
	@RequestMapping(value = "/userLogout", method = RequestMethod.GET)
	public String userLogout(HttpSession session) {
		System.out.println("user 로그아웃 액션......UserController.java");
		session.invalidate();
		return "main/index";
	}
	
	@RequestMapping(value = "/userGetInfo", method = RequestMethod.GET)
	public String userGetInfo(HttpSession session, Model model) {
		System.out.println("user 내정보 보기......UserController.java");
		String user_id = session.getAttribute("LOGINID").toString();
		model.addAttribute("userDTO", userService.userGetInfo(user_id));
		return "member/userGetInfo";
		
		
		
		
	}

}
