package com.travel.member.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.member.company.dto.CompanyRequestDTO;
import com.travel.member.company.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/companyAdd")
	public String companyAdd(CompanyRequestDTO companyRequestDTO) {
		int row = companyService.companyAdd(companyRequestDTO);
		if(row==1) {
			return "redirect:/main/index";
		} else {
			return "member/companyAdd";
		}
	}
}
