package com.travel.member.company.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.member.company.dto.CompanyDTO;

@Controller
public class companyPageController {
	@RequestMapping("comLogin")
	public String login() {
		System.out.println("company Page");
		return "thymeleaf/login/login";
	}
	@RequestMapping("companyIndex")
	public String index(HttpSession session, CompanyDTO companyDTO) {
		System.out.println("compnayIndex Page");
		session.setAttribute("LOGINID", companyDTO.getCompany_id());
		return "thymeleaf/companyIndex";
	}
}
