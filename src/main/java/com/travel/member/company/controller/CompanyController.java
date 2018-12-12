package com.travel.member.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value="/companyList", method=RequestMethod.GET)
		public ModelAndView companyList() {
		List<CompanyDTO> list = companyService.companyList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/companyList");
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping(value="/companyAuth", method=RequestMethod.GET)
		public String companyAuth() {
			return "member/companyList";
	}
	
	@RequestMapping(value="/companyAuth", method=RequestMethod.POST)
		public String companyAuth(CompanyDTO companyDTO) {
		int row = companyService.companyAuth(companyDTO);
		return "member/companyList";
	}
}
