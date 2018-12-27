package com.travel.pack.reviewQuestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.pack.reviewQuestion.dto.*;
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

	public List<PackAirQuestionDTO> packAirQuestionList() {
		return packReviewQuestionMapper.packAirQuestionList();
	}
	
	public int packFoodQuestionAdd(PackFoodQuestionDTO packFoodQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackFoodQuestion(packFoodQuestionDTO);
		return result;
	}

	public List<PackFoodQuestionDTO> packFoodQuestionList() {
		return packReviewQuestionMapper.packFoodQuestionList();
	}
	
	public int packGuideQuestionAdd(PackGuideQuestionDTO packGuideQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackGuideQuestion(packGuideQuestionDTO);
		return result;
	}

	public List<PackGuideQuestionDTO> packGuideQuestionList() {
		return packReviewQuestionMapper.packGuideQuestionList();
	}
	
	public int packHotelQuestionAdd(PackHotelQuestionDTO packHotelQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackHotelQuestion(packHotelQuestionDTO);
		return result;
	}

	public List<PackHotelQuestionDTO> packHotelQuestionList() {
		return packReviewQuestionMapper.packHotelQuestionList();
	}
	
	public int packInfoQuestionAdd(PackInfoQuestionDTO packInfoQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackInfoQuestion(packInfoQuestionDTO);
		return result;
	}

	public List<PackInfoQuestionDTO> packInfoQuestionList() {
		return packReviewQuestionMapper.packInfoQuestionList();
	}
	
	public int packLandmarkQuestionAdd(PackLandmarkQuestionDTO packLandmarkQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackLandmarkQuestion(packLandmarkQuestionDTO);
		return result;
	}

	public List<PackLandmarkQuestionDTO> packLandmarkQuestionList() {
		return packReviewQuestionMapper.packLandmarkQuestionList();
	}
	
	public int packPriceQuestionAdd(PackPriceQuestionDTO packPriceQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackPriceQuestion(packPriceQuestionDTO);
		return result;
	}

	public List<PackPriceQuestionDTO> packPriceQuestionList() {
		return packReviewQuestionMapper.packPriceQuestionList();
	}
	
	public int packTrafficQuestionAdd(PackTrafficQuestionDTO packTrafficQuestionDTO) {
		int result = packReviewQuestionMapper.insertPackTrafficQuestion(packTrafficQuestionDTO);
		return result;
	}

	public List<PackTrafficQuestionDTO> packTrafficQuestionList() {
		return packReviewQuestionMapper.packTrafficQuestionList();
	}
}
