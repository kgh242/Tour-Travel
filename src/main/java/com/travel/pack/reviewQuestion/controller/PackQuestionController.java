package com.travel.pack.reviewQuestion.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.pack.reviewQuestion.dto.PackAirQuestionDTO;
import com.travel.pack.reviewQuestion.dto.PackFoodQuestionDTO;
import com.travel.pack.reviewQuestion.service.PackReviewQuestionService;

@Controller
@RequestMapping(value = "/Travel")
public class PackQuestionController {
	@Autowired
	private PackReviewQuestionService packReviewQuestionService;
	
	@RequestMapping(value = "/packAirQuestionList", method = RequestMethod.GET)
	public String packReviewAirQuestionAdd(Model model, PackAirQuestionDTO packAirQuestionDTO) {
		List<PackAirQuestionDTO> packAirQuestionList = packReviewQuestionService.packAirQuestionList(packAirQuestionDTO);
		model.addAttribute("packAirQuestionList", packAirQuestionList);
		return "review/packAirQuestionList";
	}
	
	@RequestMapping(value = "/packAirQuestionList", method = RequestMethod.POST)
	public String packReviewAirQuestionAdd(HttpSession session, PackAirQuestionDTO packAirQuestionDTO) {
		System.out.println("packAirQuestionAdd.POST");
		packAirQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(packAirQuestionDTO.getAdmin_id() + "<<<LOGINID");
		packReviewQuestionService.packAirQuestionAdd(packAirQuestionDTO);
		return "redirect:/Travel/packAirQuestionList";
	}
	
	@RequestMapping(value = "/packFoodQuestionList", method = RequestMethod.GET)
	public String packReviewFoodQuestionAdd(Model model, PackFoodQuestionDTO packFoodQuestionDTO) {
		List<PackFoodQuestionDTO> packFoodQuestionList = packReviewQuestionService.packFoodQuestionList(packFoodQuestionDTO);
		model.addAttribute("packFoodQuestionList", packFoodQuestionList);
		return "review/packFoodQuestionList";
	}
	
	@RequestMapping(value = "/packFoodQuestionList", method = RequestMethod.POST)
	public String packReviewFoodQuestionAdd(HttpSession session, PackFoodQuestionDTO packFoodQuestionDTO) {
		System.out.println("packFoodQuestionAdd.POST");
		packFoodQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(packFoodQuestionDTO.getAdmin_id() + "<<<LOGINID");
		packReviewQuestionService.packFoodQuestionAdd(packFoodQuestionDTO);
		return "redirect:/Travel/packFoodQuestionList";
	}
}
