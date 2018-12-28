package com.travel.plan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.plan.dto.PlanDTO;
import com.travel.plan.mapper.PlanMapper;

@Service
@Transactional
public class PlanService {

	@Autowired
	private PlanMapper planMapper;
	
	public int planAdd(PlanDTO planDTO) {
		return planMapper.insertPlan(planDTO);
	}
}
