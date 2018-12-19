package com.travel.member.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.member.user.dto.UserDTO;

@Controller
public class adminPageController {
	@RequestMapping("adminLogin")
	public String login() {
		System.out.println("adminLogin Page");
		return "thymeleaf/adminLogin";
	}
	@RequestMapping("adminIndex")
	public String index(HttpSession session, UserDTO userDTO) {
		System.out.println("adminIndex Page");
		session.setAttribute("LOGINID", userDTO.getUser_id());
		return "thymeleaf/adminIndex";
	}
}
