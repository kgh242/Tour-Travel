package com.travel.pack.reviewQuestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.pack.reviewQuestion.dto.PackAirQuestionDTO;
import com.travel.pack.reviewQuestion.dto.PackFoodQuestionDTO;
import com.travel.pack.reviewQuestion.mapper.PackReviewQuestionMapper;

@Service
@Transactional
public class PackReviewQuestionService {
	@Autowired
	private PackReviewQuestionMapper packReviewQuestionMapper;
	
	public int packAirQuestionAdd(PackAirQuestionDTO packAirQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackAirQuestion(packAirQuestionDTO);
		return result;
	}

	public List<PackAirQuestionDTO> packAirQuestionList(PackAirQuestionDTO packAirQuestionDTO) {
		return packReviewQuestionMapper.packAirQuestionList(packAirQuestionDTO);
	}
	
	public int packFoodQuestionAdd(PackFoodQuestionDTO packFoodQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackFoodQuestion(packFoodQuestionDTO);
		return result;
	}

	public List<PackFoodQuestionDTO> packFoodQuestionList(PackFoodQuestionDTO packFoodQuestionDTO) {
		return packReviewQuestionMapper.packFoodQuestionList(packFoodQuestionDTO);
	}
}
