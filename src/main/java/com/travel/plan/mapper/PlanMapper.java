package com.travel.plan.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.travel.plan.dto.PlanDTO;
import com.travel.plan.dto.PlanInterestDTO;

@Mapper
public interface PlanMapper {
	int insertPlan(PlanDTO planDTO);
	int insertPlanInterest(PlanInterestDTO planInterestDTO);
}
