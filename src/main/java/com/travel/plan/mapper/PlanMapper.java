package com.travel.plan.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.travel.pack.dto.PackDTO;
import com.travel.paging.PageMaker;
import com.travel.plan.dto.PlanApplyDTO;
import com.travel.plan.dto.PlanDTO;
import com.travel.plan.dto.PlanHotelDTO;
import com.travel.plan.dto.PlanInterestDTO;
import com.travel.plan.dto.PlanLandmarkDTO;
import com.travel.plan.dto.PlanScheduleDTO;

@Mapper
public interface PlanMapper {
	int insertPlan(PlanDTO planDTO);
	int insertPlanInterest(PlanInterestDTO planInterestDTO);
	
	
	List<PlanDTO> planList(PlanDTO planDTO);
	
	
	int applyPlan(PlanApplyDTO planApplyDTO);
	
	PlanDTO planGetInfo(String plan1_no);
	List<PlanHotelDTO> planGetHotelInfo(String plan1_no);
	List<PlanLandmarkDTO> planGetLandmarkInfo(String plan1_no);
	List<PlanScheduleDTO> planGetScheduleInfo(String plan1_no);
	int planDeleteHotelInfo(String plan1_no);
	int planDeleteLandmarkInfo(String plan1_no);
	int planDeleteScheduleInfo(String plan1_no);
	

	int planAirUpdate(Map<String, Object> map);
	int planHotelAdd(PlanHotelDTO planHotelDTO);
	int planLandmarkAdd(PlanLandmarkDTO planLandmarkDTO);
	int planScheduleAdd(PlanScheduleDTO planScheduleDTO);
	
	// 플랜 리스트관련 
	List<PlanDTO> planList(Map<String, Object> map);
	List<PlanDTO> planList1(PageMaker pageMaker);
	List<PlanDTO> planList2(Map<String, Object> map);
	List<PlanDTO> planList3(Map<String, Object> map);
	int planSelectCount();
	int planListCount(Map<String, Object> map);
	int planList2Count(Map<String, Object> map);
	int planList3Count(Map<String, Object> map);
}
