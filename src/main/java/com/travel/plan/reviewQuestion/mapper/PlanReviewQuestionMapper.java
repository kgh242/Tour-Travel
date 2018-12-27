package com.travel.plan.reviewQuestion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.plan.reviewQuestion.dto.*;

@Mapper
public interface PlanReviewQuestionMapper {
	int insertPlanFoodQuestion(PlanFoodQuestionDTO planFoodQuestionDTO);
	List<PlanFoodQuestionDTO> planFoodQuestionList();
	int insertPlanHotelQuestion(PlanHotelQuestionDTO planHotelQuestionDTO);
	List<PlanHotelQuestionDTO> planHotelQuestionList();
	int insertPlanLandmarkQuestion(PlanLandmarkQuestionDTO planLandmarkQuestionDTO);
	List<PlanLandmarkQuestionDTO> planLandmarkQuestionList();
	int insertPlanTrafficQuestion(PlanTrafficQuestionDTO planTrafficQuestionDTO);
	List<PlanTrafficQuestionDTO> planTrafficQuestionList();
}
