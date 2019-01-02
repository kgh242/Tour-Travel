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
import org.springframework.web.multipart.MultipartFile;

import com.travel.pack.dto.PackHotelDTO;
import com.travel.pack.dto.PackLandmarkDTO;
import com.travel.pack.dto.PackScheduleDTO;
import com.travel.plan.dto.PlanDTO;
import com.travel.plan.dto.PlanHotelDTO;
import com.travel.plan.dto.PlanInterestDTO;
import com.travel.plan.dto.PlanLandmarkDTO;
import com.travel.plan.dto.PlanScheduleDTO;
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
		int planNum = planService.planAdd(planDTO, planInterestList);
		return "redirect:/Travel/planDetailAdd?plan1_no="+planNum;
	}
	
	@RequestMapping(value = "/planList", method = RequestMethod.GET)
	public String planList(Model model,PlanDTO planDTO) {
		List<PlanDTO> planList = planService.planList(planDTO);
		model.addAttribute("planList", planList);
		return "thymeleaf/plan/planList";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/planDetailAdd", method = RequestMethod.GET)
	public String planDetailAdd(
			Model model,
			@RequestParam(value="plan1_no",required=true) String plan1_no) {
		System.out.println("플랜2차정보입력 화면이동");
		model.addAttribute("planInfo", planService.planGetInfo(plan1_no));
		return "thymeleaf/plan/planDetailAdd";
	}
	
	
	@RequestMapping(value= "/planDetailLook", method = RequestMethod.GET)
	public String planDetailLook(
			Model model,
			@RequestParam(value="plan1_no",required=true) String plan1_no) {
		model.addAttribute("planInfo", planService.planGetInfo(plan1_no));
		return "thymeleaf/plan/planDetailLook";
	}
	
	@RequestMapping(value = "/planDetailAdd", method = RequestMethod.POST)
	public String planDetailAdd(
			@RequestParam(value="plan1_no",required=true) String plan1_no,
			@RequestParam(value="plan1_air",required=true) String plan1_air,
			@RequestParam(value="plan2_hotel_name",required=true) List<String> plan2_hotel_name,
			@RequestParam(value="plan2_hotel_check_in",required=true) List<String> plan2_hotel_check_in,
			@RequestParam(value="plan2_hotel_check_out",required=true) List<String> plan2_hotel_check_out,
			@RequestParam(value="plan2_hotel_address",required=true) List<String> plan2_hotel_address,
			@RequestParam(value="plan2_hotel_price",required=true) List<Integer> plan2_hotel_price,
			@RequestParam(value="plan2_schedule_day",required=true) List<String> plan2_schedule_day,
			@RequestParam(value="plan2_schedule_contents",required=true) List<String> plan2_schedule_contents,
			@RequestParam(value="landmark_code",required=true) List<String> landmark_code,
			@RequestParam(value="plan2_landmark_day",required=true) List<String> plan2_landmark_day,
			@RequestParam(value="plan2_landmark_address",required=true) List<String> plan2_landmark_address,
			@RequestParam(value="plan2_landmark_price",required=true) List<Integer> plan2_landmark_price,
			@RequestParam(value="plan2_landmark_contents",required=true) List<String> plan2_landmark_contents) {
		System.out.println("플랜2차상세정보 입력");
		List<PlanHotelDTO> planHotelList = new ArrayList<PlanHotelDTO>();
		List<PlanLandmarkDTO> planLandmarkList = new ArrayList<PlanLandmarkDTO>();
		List<PlanScheduleDTO> planScheduleList = new ArrayList<PlanScheduleDTO>();
		
		// 다중정보 객체묶기
		for(int i = 0; i<plan2_hotel_name.size(); i++) {
			PlanHotelDTO planHotelDTO = new PlanHotelDTO();
			System.out.println(plan2_hotel_name.get(i) + "<<이름확인");
			planHotelDTO.setPlan1_no(plan1_no);
			planHotelDTO.setPlan2_hotel_name(plan2_hotel_name.get(i));
			planHotelDTO.setPlan2_hotel_check_in(plan2_hotel_check_in.get(i));
			planHotelDTO.setPlan2_hotel_check_out(plan2_hotel_check_out.get(i));
			planHotelDTO.setPlan2_hotel_address(plan2_hotel_address.get(i));
			planHotelDTO.setPlan2_hotel_price(plan2_hotel_price.get(i));
			planHotelList.add(i, planHotelDTO);
		}
		
		for(int i = 0; i<plan2_landmark_day.size(); i++) {
			PlanLandmarkDTO planLandmarkDTO = new PlanLandmarkDTO();
			planLandmarkDTO.setLandmark_code(landmark_code.get(i));
			planLandmarkDTO.setPlan2_landmark_day(plan2_landmark_day.get(i));
			planLandmarkDTO.setPlan2_landmark_address(plan2_landmark_address.get(i));
			planLandmarkDTO.setPlan2_landmark_price(plan2_landmark_price.get(i));
			planLandmarkDTO.setPlan2_landmark_contents(plan2_landmark_contents.get(i));
			planLandmarkList.add(i, planLandmarkDTO);
		}
		
		for(int i = 0; i<plan2_schedule_day.size(); i++) {
			PlanScheduleDTO planScheduleDTO = new PlanScheduleDTO();
			planScheduleDTO.setPlan2_schedule_day(plan2_schedule_day.get(i));
			planScheduleDTO.setPlan2_schedule_contents(plan2_schedule_contents.get(i));
			planScheduleList.add(i, planScheduleDTO);
		}
		// 여기까지
		
		planService.planDetailAdd(plan1_no, plan1_air, planHotelList, planLandmarkList, planScheduleList);
		
		return "redirect:/Travel/planDetailAdd?plan1_no="+plan1_no;
	}
	
}
