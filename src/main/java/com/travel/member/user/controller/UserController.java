package com.travel.member.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String userAdd(UserDTO userDTO) {
		System.out.println("user 회원가입 액션......UserController.java");
		int result = userService.userAdd(userDTO);
		if(result==0) {
			System.out.println("회원가입실패");
			return "member/userAdd";
		}else {
			if(result == 1) {
				System.out.println("회원가입성공 (이미지없음)");
			} else if(result == 2) {
				System.out.println("회원가입성공 (이미지있음)");
			}
			return "index";
		}
	}
	
	

}
