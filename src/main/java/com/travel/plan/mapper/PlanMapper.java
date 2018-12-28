package com.travel.plan.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.travel.plan.dto.PlanDTO;

@Mapper
public interface PlanMapper {
	int insertPlan(PlanDTO planDTO);
}
