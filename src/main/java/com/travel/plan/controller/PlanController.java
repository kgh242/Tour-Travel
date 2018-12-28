package com.travel.plan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.travel.plan.dto.PlanDTO;
import com.travel.plan.service.PlanService;

@Controller
@RequestMapping(value = "/Travel")
public class PlanController {
	
	@Autowired
	private PlanService planService;
	
	@RequestMapping(value = "/planAdd", method = RequestMethod.GET)
	public String planAdd() {
		System.out.println("Plan Controller - planAdd.GET");
		return "plan/planAdd";
	}
	
	@RequestMapping(value = "/planAdd", method = RequestMethod.POST)
	public String planAdd(HttpSession session,PlanDTO planDTO) {
		HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		planDTO.setPlan1_user_ip(req.getRemoteAddr());
		System.out.println(planDTO.getPlan1_user_ip());
		System.out.println("Plan Controller - planAdd.POST");
		planDTO.setUser_id(session.getAttribute("LOGINID").toString());
		planService.planAdd(planDTO);
		return "thymeleaf/index";
	}
}
