package com.travel.member.company.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
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
import com.travel.paging.PageMaker;

@Controller
@RequestMapping(value = "/Travel")
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@RequestMapping(value = "/companyAdd", method = RequestMethod.GET)
	public String companyAdd() {
		return "membeer/companyAdd";
	}

	@RequestMapping(value = "/companyAdd", method = RequestMethod.POST)
	public String companyAdd(CompanyDTO companyDTO, CompanyImgDTO companyImgDTO) {
		int result = companyService.companyAdd(companyDTO, companyImgDTO);
		if (result == 1) {
			return "thymeleaf/login/login";
		} else {
			return "member/companyAdd";
		}
	}

	@RequestMapping(value = "/companyList", method = RequestMethod.GET)
	public String companyList(@RequestParam(value="currentPage", defaultValue="1") int currentPage, Model model, PageMaker pageMaker) {
		pageMaker.setCurrentPage(currentPage);
		List<CompanyDTO> companyList = companyService.companyList(pageMaker);
		model.addAttribute("companyList", companyList);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pagePerBlock", pageMaker.getPagePerBlock());
		model.addAttribute("currentBlock", pageMaker.getCurrentBlock());
		model.addAttribute("startPage", pageMaker.getStartPage());
		model.addAttribute("endPage", pageMaker.getEndPage());
		model.addAttribute("prevPage", pageMaker.isPrevPage());
		model.addAttribute("nextPage", pageMaker.isNextPage());
		return "thymeleaf/list/companyList";
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
		return "redirect:/thymeleaf/list/companyList";
	}
	
	@RequestMapping(value = "/companyLogin", method = RequestMethod.GET)
	public String companyLogin() {
		System.out.println("companyLogin.GET");
		return "member/companyLogin";
	}
	
	@RequestMapping(value = "/companyLogin", method = RequestMethod.POST)
	public String companyLogin(HttpSession session, CompanyDTO companyDTO, HttpServletResponse response) throws IOException {
		System.out.println("companyLogin.POST");
		session.setAttribute("LOGINID", companyDTO.getCompany_id());
		int result = companyService.companyLogin(companyDTO);
		System.out.println(companyDTO.getCompany_id() + "<--LOGINID");
		boolean auth = companyService.companyLoginCheck(companyDTO);
		System.out.println(auth);
		if(result == 1) {
			if(auth == true) {
			System.out.println("여행사 로그인 성공");
			return "thymeleaf/companyIndex";
			} else {
				System.out.println("미승인상태");
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('계정이 미승인 상태입니다');</script>");
				out.flush();
				return "member/companyLogin";
			}
		} else {
			System.out.println("여행사 로그인 실패");
			return "member/companyLogin";
		}
	}
	
	@RequestMapping(value = "/companyLogout", method = RequestMethod.GET)
	public String companyLogout(HttpSession session) {
		session.invalidate();
		return "thymeleaf/index";
	}
	
	@RequestMapping(value = "/companyInfo", method = RequestMethod.GET)
	public String companyInfo(HttpSession session, Model model) {
		String company_id = session.getAttribute("LOGINID").toString();
		model.addAttribute("companyDTO", companyService.companyInfo(company_id));
		return "member/companyInfo";
	}
}
