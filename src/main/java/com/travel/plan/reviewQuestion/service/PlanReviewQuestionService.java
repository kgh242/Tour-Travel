package com.travel.plan.reviewQuestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.plan.reviewQuestion.dto.*;
import com.travel.plan.reviewQuestion.mapper.PlanReviewQuestionMapper;

@Service
@Transactional
public class PlanReviewQuestionService {
	@Autowired
	private PlanReviewQuestionMapper planReviewQuestionMapper;
	
	public int planFoodQuestionAdd(PlanFoodQuestionDTO planFoodQuestionDTO) {
		int result = planReviewQuestionMapper.insertPlanFoodQuestion(planFoodQuestionDTO);
		return result;
	}

	public List<PlanFoodQuestionDTO> planFoodQuestionList() {
		return planReviewQuestionMapper.planFoodQuestionList();
	}
	
	public int planHotelQuestionAdd(PlanHotelQuestionDTO planHotelQuestionDTO) {
		int result = planReviewQuestionMapper.insertPlanHotelQuestion(planHotelQuestionDTO);
		return result;
	}

	public List<PlanHotelQuestionDTO> planHotelQuestionList() {
		return planReviewQuestionMapper.planHotelQuestionList();
	}
	
	public int planLandmarkQuestionAdd(PlanLandmarkQuestionDTO planLandmarkQuestionDTO) {
		int result = planReviewQuestionMapper.insertPlanLandmarkQuestion(planLandmarkQuestionDTO);
		return result;
	}

	public List<PlanLandmarkQuestionDTO> planLandmarkQuestionList() {
		return planReviewQuestionMapper.planLandmarkQuestionList();
	}
	
	public int planTrafficQuestionAdd(PlanTrafficQuestionDTO planTrafficQuestionDTO) {
		int result = planReviewQuestionMapper.insertPlanTrafficQuestion(planTrafficQuestionDTO);
		return result;
	}

	public List<PlanTrafficQuestionDTO> planTrafficQuestionList() {
		return planReviewQuestionMapper.planTrafficQuestionList();
	}
}
