package com.travel.pack.reviewQuestion.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.pack.reviewQuestion.dto.*;
import com.travel.pack.reviewQuestion.service.PackReviewQuestionService;

@Controller
@RequestMapping(value = "/Travel")
public class PackQuestionController {
	@Autowired
	private PackReviewQuestionService packReviewQuestionService;
	
	@RequestMapping(value = "/packAirQuestionList", method = RequestMethod.GET)
	public String packReviewAirQuestionAdd(Model model) {
		List<PackAirQuestionDTO> packAirQuestionList = packReviewQuestionService.packAirQuestionList();
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
	public String packReviewFoodQuestionAdd(Model model) {
		List<PackFoodQuestionDTO> packFoodQuestionList = packReviewQuestionService.packFoodQuestionList();
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
	
	@RequestMapping(value = "/packGuideQuestionList", method = RequestMethod.GET)
	public String packReviewGuideQuestionAdd(Model model) {
		List<PackGuideQuestionDTO> packGuideQuestionList = packReviewQuestionService.packGuideQuestionList();
		model.addAttribute("packGuideQuestionList", packGuideQuestionList);
		return "review/packGuideQuestionList";
	}
	
	@RequestMapping(value = "/packGuideQuestionList", method = RequestMethod.POST)
	public String packReviewGuideQuestionAdd(HttpSession session, PackGuideQuestionDTO packGuideQuestionDTO) {
		System.out.println("packGuideQuestionAdd.POST");
		packGuideQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(packGuideQuestionDTO.getAdmin_id() + "<<<LOGINID");
		packReviewQuestionService.packGuideQuestionAdd(packGuideQuestionDTO);
		return "redirect:/Travel/packGuideQuestionList";
	}
	
	@RequestMapping(value = "/packHotelQuestionList", method = RequestMethod.GET)
	public String packReviewHotelQuestionAdd(Model model) {
		List<PackHotelQuestionDTO> packHotelQuestionList = packReviewQuestionService.packHotelQuestionList();
		model.addAttribute("packHotelQuestionList", packHotelQuestionList);
		return "review/packHotelQuestionList";
	}
	
	@RequestMapping(value = "/packHotelQuestionList", method = RequestMethod.POST)
	public String packReviewHotelQuestionAdd(HttpSession session, PackHotelQuestionDTO packHotelQuestionDTO) {
		System.out.println("packHotelQuestionAdd.POST");
		packHotelQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(packHotelQuestionDTO.getAdmin_id() + "<<<LOGINID");
		packReviewQuestionService.packHotelQuestionAdd(packHotelQuestionDTO);
		return "redirect:/Travel/packHotelQuestionList";
	}
	
	@RequestMapping(value = "/packInfoQuestionList", method = RequestMethod.GET)
	public String packReviewInfoQuestionAdd(Model model) {
		List<PackInfoQuestionDTO> packInfoQuestionList = packReviewQuestionService.packInfoQuestionList();
		model.addAttribute("packInfoQuestionList", packInfoQuestionList);
		return "review/packInfoQuestionList";
	}
	
	@RequestMapping(value = "/packInfoQuestionList", method = RequestMethod.POST)
	public String packReviewInfoQuestionAdd(HttpSession session, PackInfoQuestionDTO packInfoQuestionDTO) {
		System.out.println("packInfoQuestionAdd.POST");
		packInfoQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(packInfoQuestionDTO.getAdmin_id() + "<<<LOGINID");
		packReviewQuestionService.packInfoQuestionAdd(packInfoQuestionDTO);
		return "redirect:/Travel/packInfoQuestionList";
	}
	
	@RequestMapping(value = "/packLandmarkQuestionList", method = RequestMethod.GET)
	public String packReviewLandmarkQuestionAdd(Model model) {
		List<PackLandmarkQuestionDTO> packLandmarkQuestionList = packReviewQuestionService.packLandmarkQuestionList();
		model.addAttribute("packLandmarkQuestionList", packLandmarkQuestionList);
		return "review/packLandmarkQuestionList";
	}
	
	@RequestMapping(value = "/packLandmarkQuestionList", method = RequestMethod.POST)
	public String packReviewLandmarkQuestionAdd(HttpSession session, PackLandmarkQuestionDTO packLandmarkQuestionDTO) {
		System.out.println("packLandmarkQuestionAdd.POST");
		packLandmarkQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(packLandmarkQuestionDTO.getAdmin_id() + "<<<LOGINID");
		packReviewQuestionService.packLandmarkQuestionAdd(packLandmarkQuestionDTO);
		return "redirect:/Travel/packLandmarkQuestionList";
	}
	
	@RequestMapping(value = "/packPriceQuestionList", method = RequestMethod.GET)
	public String packReviewPriceQuestionAdd(Model model) {
		List<PackPriceQuestionDTO> packPriceQuestionList = packReviewQuestionService.packPriceQuestionList();
		model.addAttribute("packPriceQuestionList", packPriceQuestionList);
		return "review/packPriceQuestionList";
	}
	
	@RequestMapping(value = "/packPriceQuestionList", method = RequestMethod.POST)
	public String packReviewPriceQuestionAdd(HttpSession session, PackPriceQuestionDTO packPriceQuestionDTO) {
		System.out.println("packPriceQuestionAdd.POST");
		packPriceQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(packPriceQuestionDTO.getAdmin_id() + "<<<LOGINID");
		packReviewQuestionService.packPriceQuestionAdd(packPriceQuestionDTO);
		return "redirect:/Travel/packPriceQuestionList";
	}
	
	@RequestMapping(value = "/packTrafficQuestionList", method = RequestMethod.GET)
	public String packReviewTrafficQuestionAdd(Model model) {
		List<PackTrafficQuestionDTO> packTrafficQuestionList = packReviewQuestionService.packTrafficQuestionList();
		model.addAttribute("packTrafficQuestionList", packTrafficQuestionList);
		return "review/packTrafficQuestionList";
	}
	
	@RequestMapping(value = "/packTrafficQuestionList", method = RequestMethod.POST)
	public String packReviewTrafficQuestionAdd(HttpSession session, PackTrafficQuestionDTO packTrafficQuestionDTO) {
		System.out.println("packTrafficQuestionAdd.POST");
		packTrafficQuestionDTO.setAdmin_id(session.getAttribute("LOGINID").toString());
		System.out.println(packTrafficQuestionDTO.getAdmin_id() + "<<<LOGINID");
		packReviewQuestionService.packTrafficQuestionAdd(packTrafficQuestionDTO);
		return "redirect:/Travel/packTrafficQuestionList";
	}
	
}
