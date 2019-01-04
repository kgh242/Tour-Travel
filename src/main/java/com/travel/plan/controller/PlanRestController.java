package com.travel.plan.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travel.plan.dto.PlanHotelDTO;
import com.travel.plan.dto.PlanLandmarkDTO;
import com.travel.plan.dto.PlanScheduleDTO;
import com.travel.plan.service.PlanService;

@RestController
@RequestMapping("/Travel")
public class PlanRestController {
	
	@Autowired
	private PlanService planService;
	
	@RequestMapping(value = "/planDetailAjax.do", method=RequestMethod.GET)
	public Map<String, Object> PlanDetailAddAjax(
	//public String test(
			@RequestParam(value="plan1_no") String plan1_no,
			@RequestParam(value="plan1_air") String plan1_air,
			@RequestParam(value="plan2_hotel_name_Array[]", required=false) List<String> plan2_hotel_name_list,
			@RequestParam(value="plan2_hotel_check_in_Array[]", required=false) List<String> plan2_hotel_check_in_list,
			@RequestParam(value="plan2_hotel_check_out_Array[]", required=false) List<String> plan2_hotel_check_out_list,
			@RequestParam(value="plan2_hotel_address_Array[]", required=false) List<String> plan2_hotel_address_list,
			@RequestParam(value="plan2_hotel_price_Array[]", required=false) List<String> plan2_hotel_price_list,
			@RequestParam(value="plan2_schedule_day_Array[]", required=false) List<String> plan2_schedule_day_list,
			@RequestParam(value="plan2_schedule_contents_Array[]", required=false) List<String> plan2_schedule_contents_list,
			@RequestParam(value="landmark_code_Array[]", required=false) List<String> landmark_code_list,
			@RequestParam(value="plan2_landmark_day_Array[]", required=false) List<String> plan2_landmark_day_list,
			@RequestParam(value="plan2_landmark_address_Array[]", required=false) List<String> plan2_landmark_address_list,
			@RequestParam(value="plan2_landmark_price_Array[]", required=false) List<String> plan2_landmark_price_list,
			@RequestParam(value="plan2_landmark_contents_Array[]", required=false) List<String> plan2_landmark_contents_list
			
			) {
		System.out.println("플랜2차상세정보 AJAX 입력");
		List<PlanHotelDTO> planHotelList = new ArrayList<PlanHotelDTO>();
		List<PlanLandmarkDTO> planLandmarkList = new ArrayList<PlanLandmarkDTO>();
		List<PlanScheduleDTO> planScheduleList = new ArrayList<PlanScheduleDTO>();
		
		// 다중정보 객체묶기
		for(int i = 0; i<plan2_hotel_name_list.size(); i++) {
			PlanHotelDTO planHotelDTO = new PlanHotelDTO();
			planHotelDTO.setPlan1_no(plan1_no);
			planHotelDTO.setPlan2_hotel_name(plan2_hotel_name_list.get(i));
			planHotelDTO.setPlan2_hotel_check_in(plan2_hotel_check_in_list.get(i));
			planHotelDTO.setPlan2_hotel_check_out(plan2_hotel_check_out_list.get(i));
			planHotelDTO.setPlan2_hotel_address(plan2_hotel_address_list.get(i));
			planHotelDTO.setPlan2_hotel_price(Integer.parseInt(plan2_hotel_price_list.get(i)));
			planHotelList.add(i, planHotelDTO);
		}
		
		for(int i = 0; i<landmark_code_list.size(); i++) {
			PlanLandmarkDTO planLandmarkDTO = new PlanLandmarkDTO();
			planLandmarkDTO.setPlan1_no(plan1_no);
			planLandmarkDTO.setLandmark_code(landmark_code_list.get(i));
			planLandmarkDTO.setPlan2_landmark_day(plan2_landmark_day_list.get(i));
			planLandmarkDTO.setPlan2_landmark_address(plan2_landmark_address_list.get(i));
			planLandmarkDTO.setPlan2_landmark_price(Integer.parseInt(plan2_landmark_price_list.get(i)));
			planLandmarkDTO.setPlan2_landmark_contents(plan2_landmark_contents_list.get(i));
			planLandmarkList.add(i, planLandmarkDTO);
		}
		
		for(int i = 0; i<plan2_schedule_day_list.size(); i++) {
			PlanScheduleDTO planScheduleDTO = new PlanScheduleDTO();
			planScheduleDTO.setPlan1_no(plan1_no);
			planScheduleDTO.setPlan2_schedule_day(plan2_schedule_day_list.get(i));
			planScheduleDTO.setPlan2_schedule_contents(plan2_schedule_contents_list.get(i));
			planScheduleList.add(i, planScheduleDTO);
		}
		
		planService.planDetailAdd(plan1_no, plan1_air, planHotelList, planLandmarkList, planScheduleList);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("planInfo", planService.planGetInfo(plan1_no));
		
		return map;
	}
	
	@RequestMapping(value = "/planDetailLookAjax.do", method=RequestMethod.GET)
	public Map<String, Object> PlanDetailLookAjax(@RequestParam(value="plan1_no") String plan1_no) {
		System.out.println("플랜2차상세정보 AJAX 조회");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("planInfo", planService.planGetInfo(plan1_no));
		
		return map;
	}

}
