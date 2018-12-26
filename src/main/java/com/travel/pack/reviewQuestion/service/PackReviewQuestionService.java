package com.travel.pack.reviewQuestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.pack.reviewQuestion.dto.PackAirQuestionDTO;
import com.travel.pack.reviewQuestion.mapper.PackReviewQuestionMapper;

//패키지 후기 평점 문항지 관련 Service

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
}
