package com.travel.member.company.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.travel.member.company.dto.CompanyDTO;
import com.travel.member.company.dto.CompanyImgDTO;
import com.travel.member.company.service.CompanyService;

@Controller
@RequestMapping(value = "/Travel")
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@RequestMapping(value = "/companyAdd", method = RequestMethod.GET)
	public String companyAdd() {
		return "member/companyAdd";
	}

	@RequestMapping(value = "/companyAdd", method = RequestMethod.POST)
	public String companyAdd(CompanyDTO companyDTO, CompanyImgDTO companyImgDTO) {
		int result = companyService.companyAdd(companyDTO, companyImgDTO);
		if (result == 1) {
			return "thymeleaf/index";
		} else {
			return "member/companyAdd";
		}
	}

	@RequestMapping(value = "/companyList", method = RequestMethod.GET)
	public String companyList(Model model) {
		List<CompanyDTO> companyList = companyService.companyList();
		model.addAttribute("companyList", companyList);
		return "member/companyList";
	}

	@RequestMapping(value = "/companyAuthInfo", method = RequestMethod.GET)
	public String companyAuthInfo(@RequestParam(value = "company_id") String company_id, Model model) {
		System.out.println("companyAuth.GET");
		model.addAttribute("companyDTO", companyService.companyAuthInfo(company_id));
		return "member/companyAuthInfo";
	}

	@RequestMapping(value = "/companyAuth", method = RequestMethod.POST)
	public String companyAuth(HttpSession session, CompanyDTO companyDTO) {
		System.out.println("companyAuth.POST");
		companyDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(companyDTO.getAdmin_id() + "<<<LOGINID");
		companyService.companyAuth(companyDTO);
		return "redirect:/Travel/companyList";
	}
	
	@RequestMapping(value = "/companyLogin", method = RequestMethod.GET)
	public String companyLogin() {
		System.out.println("companyLogin.GET");
		return "member/companyLogin";
	}
	
	@RequestMapping(value = "/companyLogin", method = RequestMethod.POST)
	public String companyLogin(HttpSession session, CompanyDTO companyDTO) {
		System.out.println("companyLogin.POST");
		int result = companyService.companyLogin(companyDTO);
		session.setAttribute("LOGINID", companyDTO.getCompany_id());
		System.out.println(companyDTO.getCompany_id() + "<--LOGINID");
		return "thymeleaf/index";
	}
}
