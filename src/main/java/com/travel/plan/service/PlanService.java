package com.travel.plan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.plan.dto.PlanDTO;
import com.travel.plan.dto.PlanInterestDTO;
import com.travel.plan.mapper.PlanMapper;

@Service
@Transactional
public class PlanService {

	@Autowired
	private PlanMapper planMapper;
	
	public int planAdd(PlanDTO planDTO,List<PlanInterestDTO> planInterestList) {
		int result;
		result = planMapper.insertPlan(planDTO);
		for(int i = 0; i < planInterestList.size(); i++) {
			PlanInterestDTO planInterestDTO = new PlanInterestDTO();
			planInterestDTO.setPlan1_no(planDTO.getPlan1_no());
			planInterestDTO.setPlan1_interest(planInterestList.get(i).getPlan1_interest());
			planMapper.insertPlanInterest(planInterestDTO);
		}
		return result;
	}
	
	public List<PlanDTO> planList(PlanDTO planDTO){
		return planMapper.planList(planDTO);
	}
}
