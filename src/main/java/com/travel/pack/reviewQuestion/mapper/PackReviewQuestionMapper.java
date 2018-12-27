package com.travel.pack.reviewQuestion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.pack.reviewQuestion.dto.*;

@Mapper
public interface PackReviewQuestionMapper {
	int insertPackAirQuestion(PackAirQuestionDTO packAirQuestionDTO);
	List<PackAirQuestionDTO> packAirQuestionList();
	int insertPackFoodQuestion(PackFoodQuestionDTO packFoodQuestionDTO);
	List<PackFoodQuestionDTO> packFoodQuestionList();
	int insertPackGuideQuestion(PackGuideQuestionDTO packGuideQuestionDTO);
	List<PackGuideQuestionDTO> packGuideQuestionList();
	int insertPackHotelQuestion(PackHotelQuestionDTO packHotelQuestionDTO);
	List<PackHotelQuestionDTO> packHotelQuestionList();
	int insertPackInfoQuestion(PackInfoQuestionDTO packInfoQuestionDTO);
	List<PackInfoQuestionDTO> packInfoQuestionList();
	int insertPackLandmarkQuestion(PackLandmarkQuestionDTO packLandmarkQuestionDTO);
	List<PackLandmarkQuestionDTO> packLandmarkQuestionList();
	int insertPackPriceQuestion(PackPriceQuestionDTO packPriceQuestionDTO);
	List<PackPriceQuestionDTO> packPriceQuestionList();
	int insertPackTrafficQuestion(PackTrafficQuestionDTO packTrafficQuestionDTO);
	List<PackTrafficQuestionDTO> packTrafficQuestionList();
}
