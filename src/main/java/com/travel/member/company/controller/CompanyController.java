package com.travel.member.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
			return "index";
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
	public String companyAuthInfo(@RequestParam(value="company_id") String company_id, Model model) {
		System.out.println("companyAuth.GET");
		model.addAttribute("companyDTO", companyService.companyAuthInfo(company_id));
		return "member/companyAuthInfo";
	}
	
	@RequestMapping(value = "/companyAuth", method = RequestMethod.POST)
	public String companyAuth(CompanyDTO companyDTO) {
		System.out.println("companyAuth.Post");
		companyService.companyAuth(companyDTO);
		return "member/companyList";
	}
}
