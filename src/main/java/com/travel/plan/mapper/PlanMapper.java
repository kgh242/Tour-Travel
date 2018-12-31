package com.travel.plan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.plan.dto.PlanDTO;
import com.travel.plan.dto.PlanInterestDTO;

@Mapper
public interface PlanMapper {
	int insertPlan(PlanDTO planDTO);
	int insertPlanInterest(PlanInterestDTO planInterestDTO);
	List<PlanDTO> planList(PlanDTO planDTO);
}
