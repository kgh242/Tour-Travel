package com.travel.member.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.member.company.dto.CompanyDTO;
import com.travel.member.company.dto.CompanyImgDTO;
import com.travel.member.company.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value="/companyAdd", method=RequestMethod.GET)
		public String companyAdd() {
			return "member/companyAdd";
		}
	
	@RequestMapping(value="/companyAdd", method=RequestMethod.POST)
	public String companyAdd(CompanyDTO companyDTO, CompanyImgDTO companyImgDTO) {
		int row = companyService.companyAdd(companyDTO, companyImgDTO);
		if(row==1) {
			return "index";
		} else {
			return "member/companyAdd";
		}
	}
}
