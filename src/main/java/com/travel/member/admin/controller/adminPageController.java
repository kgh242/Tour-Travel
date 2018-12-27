package com.travel.member.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.member.admin.dto.AdminDTO;

@Controller
public class adminPageController {
	@RequestMapping("admLogin")
	public String login() {
		System.out.println("adminLogin Page");
		return "thymeleaf/login/admLogin";
	}
	@RequestMapping("adminIndex")
	public String index(HttpSession session, AdminDTO adminDTO) {
		System.out.println("adminIndex Page");
		session.setAttribute("LOGINID", adminDTO.getAdmin_id());
		return "thymeleaf/adminIndex";
	}
}
