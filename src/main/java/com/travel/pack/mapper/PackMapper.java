package com.travel.pack.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.image.ImgDTO;
import com.travel.pack.dto.PackDTO;
import com.travel.pack.dto.PackHotelDTO;
import com.travel.pack.dto.PackLandmarkDTO;
import com.travel.pack.dto.PackScheduleDTO;

//패키지 정보 Mapper Interface

@Mapper
public interface PackMapper {
	
	int packAdd(PackDTO packDTO);
	int packHotelAdd(PackHotelDTO packHotelDTO);
	int packScheduleAdd(PackScheduleDTO packScheduleDTO);
	int packLandmarkAdd(PackLandmarkDTO packLandmarkDTO);
	
	PackDTO packGetInfo(int pack_info_no);
	List<PackDTO> packList();
	int packLandMarkImgInsert(ImgDTO imgDTO);
	
}
