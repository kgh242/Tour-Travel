package com.travel.plan.reviewQuestion.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.plan.reviewQuestion.dto.*;
import com.travel.plan.reviewQuestion.service.PlanReviewQuestionService;

@Controller
@RequestMapping(value = "/Travel")
public class PlanQuestionController {
	@Autowired
	private PlanReviewQuestionService planReviewQuestionService;
	
	@RequestMapping(value = "/planFoodQuestionList", method = RequestMethod.GET)
	public String planReviewFoodQuestionAdd(Model model) {
		List<PlanFoodQuestionDTO> planFoodQuestionList = planReviewQuestionService.planFoodQuestionList();
		model.addAttribute("planFoodQuestionList", planFoodQuestionList);
		return "review/planFoodQuestionList";
	}
	
	@RequestMapping(value = "/planFoodQuestionList", method = RequestMethod.POST)
	public String planReviewFoodQuestionAdd(HttpSession session, PlanFoodQuestionDTO planFoodQuestionDTO) {
		System.out.println("planFoodQuestionAdd.POST");
		planFoodQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(planFoodQuestionDTO.getAdmin_id() + "<<<LOGINID");
		planReviewQuestionService.planFoodQuestionAdd(planFoodQuestionDTO);
		return "redirect:/Travel/planFoodQuestionList";
	}
	
	@RequestMapping(value = "/planHotelQuestionList", method = RequestMethod.GET)
	public String planReviewHotelQuestionAdd(Model model) {
		List<PlanHotelQuestionDTO> planHotelQuestionList = planReviewQuestionService.planHotelQuestionList();
		model.addAttribute("planHotelQuestionList", planHotelQuestionList);
		return "review/planHotelQuestionList";
	}
	
	@RequestMapping(value = "/planHotelQuestionList", method = RequestMethod.POST)
	public String planReviewHotelQuestionAdd(HttpSession session, PlanHotelQuestionDTO planHotelQuestionDTO) {
		System.out.println("planHotelQuestionAdd.POST");
		planHotelQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(planHotelQuestionDTO.getAdmin_id() + "<<<LOGINID");
		planReviewQuestionService.planHotelQuestionAdd(planHotelQuestionDTO);
		return "redirect:/Travel/planHotelQuestionList";
	}
	
	@RequestMapping(value = "/planLandmarkQuestionList", method = RequestMethod.GET)
	public String planReviewLandmarkQuestionAdd(Model model) {
		List<PlanLandmarkQuestionDTO> planLandmarkQuestionList = planReviewQuestionService.planLandmarkQuestionList();
		model.addAttribute("planLandmarkQuestionList", planLandmarkQuestionList);
		return "review/planLandmarkQuestionList";
	}
	
	@RequestMapping(value = "/planLandmarkQuestionList", method = RequestMethod.POST)
	public String planReviewLandmarkQuestionAdd(HttpSession session, PlanLandmarkQuestionDTO planLandmarkQuestionDTO) {
		System.out.println("planLandmarkQuestionAdd.POST");
		planLandmarkQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(planLandmarkQuestionDTO.getAdmin_id() + "<<<LOGINID");
		planReviewQuestionService.planLandmarkQuestionAdd(planLandmarkQuestionDTO);
		return "redirect:/Travel/planLandmarkQuestionList";
	}
	
	@RequestMapping(value = "/planTrafficQuestionList", method = RequestMethod.GET)
	public String planReviewTrafficQuestionAdd(Model model) {
		List<PlanTrafficQuestionDTO> planTrafficQuestionList = planReviewQuestionService.planTrafficQuestionList();
		model.addAttribute("planTrafficQuestionList", planTrafficQuestionList);
		return "review/planTrafficQuestionList";
	}
	
	@RequestMapping(value = "/planTrafficQuestionList", method = RequestMethod.POST)
	public String planReviewTrafficQuestionAdd(HttpSession session, PlanTrafficQuestionDTO planTrafficQuestionDTO) {
		System.out.println("planTrafficQuestionAdd.POST");
		planTrafficQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(planTrafficQuestionDTO.getAdmin_id() + "<<<LOGINID");
		planReviewQuestionService.planTrafficQuestionAdd(planTrafficQuestionDTO);
		return "redirect:/Travel/planTrafficQuestionList";
	}
	
}
