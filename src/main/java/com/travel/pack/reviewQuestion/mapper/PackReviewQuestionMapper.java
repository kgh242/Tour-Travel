package com.travel.pack.reviewQuestion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.pack.reviewQuestion.dto.PackAirQuestionDTO;

@Mapper
public interface PackReviewQuestionMapper {
	int insertPackAirQuestion(PackAirQuestionDTO packAirQuestionDTO);
	List<PackAirQuestionDTO> packAirQuestionList(PackAirQuestionDTO packAirQuestionDTO);
}
