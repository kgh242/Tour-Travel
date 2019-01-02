package com.travel.plan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.travel.plan.dto.PlanDTO;
import com.travel.plan.dto.PlanInterestDTO;
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
	public String planAdd(HttpSession session,PlanDTO planDTO
							,@RequestParam(value="plan1_interest",required=true) List<String> plan1_interest) {
		List<PlanInterestDTO> planInterestList = new ArrayList<PlanInterestDTO>();
		for(int i = 0; i<plan1_interest.size(); i++) {
			System.out.println(plan1_interest.get(i) + "<<이름확인");
			PlanInterestDTO planInterestDTO = new PlanInterestDTO();
			planInterestDTO.setPlan1_interest(plan1_interest.get(i));
			planInterestList.add(i, planInterestDTO);
		}
		HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		planDTO.setPlan1_user_ip(req.getRemoteAddr());
		System.out.println(planDTO.getPlan1_user_ip());
		System.out.println("Plan Controller - planAdd.POST");
		planDTO.setUser_id(session.getAttribute("LOGINID").toString());
		planService.planAdd(planDTO, planInterestList);
		return "thymeleaf/index";
	}
	
	@RequestMapping(value = "/planList", method = RequestMethod.GET)
	public String planList(Model model,PlanDTO planDTO) {
		List<PlanDTO> planList = planService.planList(planDTO);
		model.addAttribute("planList", planList);
		return "thymeleaf/plan/planList";
	}
	
/*	@RequestMapping(value = "/planApply", method =RequestMethod.POST)
	public String*/
	
}
