package com.travel.pack.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.travel.image.ImgDTO;
import com.travel.pack.dto.PackDTO;
import com.travel.pack.dto.PackHotelDTO;
import com.travel.pack.dto.PackLandmarkDTO;
import com.travel.pack.dto.PackScheduleDTO;
import com.travel.pack.service.PackService;

//패키지 정보 Mapper Interface

@Mapper
public interface PackMapper {
	
	int packAdd(PackDTO packDTO);
	int packHotelAdd(PackHotelDTO packHotelDTO);
	int packScheduleAdd(PackScheduleDTO packScheduleDTO);
	int packLandmarkAdd(PackLandmarkDTO packLandmarkDTO);
	int packHotelImgAdd(Map<String, Object> map);
	int packScheduleImgAdd(Map<String, Object> map);
	int packLandmarkImgAdd(Map<String, Object> map);

	
	PackDTO packGetInfo(int pack_info_no);
	List<PackDTO> packList();
	
}
