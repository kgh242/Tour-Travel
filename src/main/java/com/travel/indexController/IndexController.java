package com.travel.indexController;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.member.user.dto.UserDTO;

//인덱스 컨트롤러

@Controller

public class IndexController {
	@RequestMapping("index")
	public String index(HttpSession session, UserDTO userDTO) {
		System.out.println("Index 나타남");
		session.setAttribute("LOGINID", userDTO.getUser_id());
		return "thymeleaf/index";
	}
	
	@RequestMapping("header")
	public String header() {
		System.out.println("header");
		return "thymeleaf/header";
	}
}
