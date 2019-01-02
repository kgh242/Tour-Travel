package com.travel.plan.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.travel.plan.dto.PlanDTO;
import com.travel.plan.dto.PlanHotelDTO;
import com.travel.plan.dto.PlanInterestDTO;
import com.travel.plan.dto.PlanLandmarkDTO;
import com.travel.plan.dto.PlanScheduleDTO;
import com.travel.plan.mapper.PlanMapper;

@Service
@Transactional
public class PlanService {

	@Autowired
	private PlanMapper planMapper;
	
	public int planAdd(PlanDTO planDTO,List<PlanInterestDTO> planInterestList) {

		planMapper.insertPlan(planDTO);
		for(int i = 0; i < planInterestList.size(); i++) {
			PlanInterestDTO planInterestDTO = new PlanInterestDTO();
			planInterestDTO.setPlan1_no(planDTO.getPlan1_no());
			planInterestDTO.setPlan1_interest(planInterestList.get(i).getPlan1_interest());
			System.out.println(planMapper.insertPlanInterest(planInterestDTO)+"<<<<<<");

		}
		return planDTO.getPlan1_no();
	}
	
	public List<PlanDTO> planList(PlanDTO planDTO){
		return planMapper.planList(planDTO);
	}
	
	public Map<String, Object> planGetInfo(String plan1_no) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("planInfo", planMapper.planGetInfo(plan1_no));
		map.put("planHotelInfo", planMapper.planGetHotelInfo(plan1_no));
		map.put("planLandmarkInfo", planMapper.planGetLandmarkInfo(plan1_no));
		map.put("planScheduleInfo", planMapper.planGetScheduleInfo(plan1_no));
		
		return map;
	}
	
	
	
	@Transactional
	public int planDetailAdd(String plan1_no, String plan1_air, List<PlanHotelDTO> planHotelList, List<PlanLandmarkDTO> planLandmarkList, List<PlanScheduleDTO> planScheduleList) {
		System.out.println("planDetailAdd 메서드 실행......PlanService.java");
		int result = 0;
		try {
			Map<String, Object> airUpdate = new HashMap<String, Object>();
			airUpdate.put("plan1_no", plan1_no);
			airUpdate.put("plan1_air", plan1_air);
			planMapper.planAirUpdate(airUpdate);
			System.out.println(planHotelList.get(0).getPlan2_hotel_name() + "5");
			
			//플랜 호텔/스케줄/관광지 정보 입력 전 삭제
			
			planMapper.planDeleteHotelInfo(plan1_no);
			planMapper.planDeleteLandmarkInfo(plan1_no);
			planMapper.planDeleteScheduleInfo(plan1_no);

			//플랜 호텔 추가
			for(int i = 0; i<planHotelList.size(); i++) {
				if(!planHotelList.get(i).getPlan2_hotel_name().equals("")
						&&!planHotelList.get(i).getPlan2_hotel_check_in().equals("")
						&&!planHotelList.get(i).getPlan2_hotel_check_out().equals("")
						&&!planHotelList.get(i).getPlan2_hotel_address().equals("")) {
					
					PlanHotelDTO planHotelDTO = new PlanHotelDTO();
					System.out.println(plan1_no + ", " +planHotelList.get(i).getPlan2_hotel_name() + ", "  + planHotelList.get(i).getPlan2_hotel_check_in() + ", "+  planHotelList.get(i).getPlan2_hotel_check_out() + ", " +planHotelList.get(i).getPlan2_hotel_address() + ", "+ planHotelList.get(i).getPlan2_hotel_price());
					planHotelDTO.setPlan1_no(plan1_no);
					planHotelDTO.setPlan2_hotel_name(planHotelList.get(i).getPlan2_hotel_name());
					planHotelDTO.setPlan2_hotel_check_in(planHotelList.get(i).getPlan2_hotel_check_in());
					planHotelDTO.setPlan2_hotel_check_out(planHotelList.get(i).getPlan2_hotel_check_out());
					planHotelDTO.setPlan2_hotel_address(planHotelList.get(i).getPlan2_hotel_address());
					planHotelDTO.setPlan2_hotel_price(planHotelList.get(i).getPlan2_hotel_price());
					
					planMapper.planHotelAdd(planHotelDTO);
				}
			}
	
			
			//플랜 스케줄 추가		
			for(int i = 0; i<planScheduleList.size(); i++) {
				if(!planScheduleList.get(i).getPlan2_schedule_day().equals("")
						&&!planScheduleList.get(i).getPlan2_schedule_contents().equals("")) {
				
					PlanScheduleDTO planScheduleDTO = new PlanScheduleDTO();
					System.out.println(planScheduleList.get(i).getPlan2_schedule_day()+", "+planScheduleList.get(i).getPlan2_schedule_contents());
					planScheduleDTO.setPlan1_no(plan1_no);
					planScheduleDTO.setPlan2_schedule_day(planScheduleList.get(i).getPlan2_schedule_day());
					planScheduleDTO.setPlan2_schedule_contents(planScheduleList.get(i).getPlan2_schedule_contents());
					
					planMapper.planScheduleAdd(planScheduleDTO);
					
				}
	
			}
			
			
			//플랜 관광지 추가
			for(int i = 0; i<planLandmarkList.size(); i++) {
				if(!planLandmarkList.get(i).getLandmark_code().equals("")
						&&!planLandmarkList.get(i).getPlan2_landmark_day().equals("")
						&&!planLandmarkList.get(i).getPlan2_landmark_address().equals("")
						&&!planLandmarkList.get(i).getPlan2_landmark_contents().equals("")) {
					
					PlanLandmarkDTO planLandmarkDTO = new PlanLandmarkDTO();
					System.out.println(planLandmarkList.get(i).getLandmark_code()+", " +planLandmarkList.get(i).getPlan2_landmark_day()+", " +planLandmarkList.get(i).getPlan2_landmark_address()+", " +planLandmarkList.get(i).getPlan2_landmark_price()+", " +planLandmarkList.get(i).getPlan2_landmark_contents());
					planLandmarkDTO.setLandmark_code(planLandmarkList.get(i).getLandmark_code());
					planLandmarkDTO.setPlan1_no(plan1_no);
					planLandmarkDTO.setPlan2_landmark_day(planLandmarkList.get(i).getPlan2_landmark_day());
					planLandmarkDTO.setPlan2_landmark_address(planLandmarkList.get(i).getPlan2_landmark_address());
					planLandmarkDTO.setPlan2_landmark_price(planLandmarkList.get(i).getPlan2_landmark_price());
					planLandmarkDTO.setPlan2_landmark_contents(planLandmarkList.get(i).getPlan2_landmark_contents());
					
					planMapper.planLandmarkAdd(planLandmarkDTO);
					
				}
			}

			
			result = 1;
		} catch (Exception e) {
			result = 0;
			System.out.println(e + " : 에러발생");
		}
		
	
		
		return result;
	}
}
