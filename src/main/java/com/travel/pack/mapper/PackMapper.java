package com.travel.pack.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.travel.image.ImgDTO;
import com.travel.pack.dto.PackBookDTO;
import com.travel.pack.dto.PackDTO;
import com.travel.pack.dto.PackHotelDTO;
import com.travel.pack.dto.PackLandmarkDTO;
import com.travel.pack.dto.PackPriceDTO;
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
	int packBeforeNotice(Map<String, Object> map);
	int packAfterNotice(Map<String, Object> map);
	int packPriceInfo(PackPriceDTO packPriceDTO);
	
	int packOverBook(PackBookDTO packBookDTO);
	int packBook(PackBookDTO packBookDTO);
	PackBookDTO packBookSelect(PackBookDTO packBookDTO);
	
	int packPay(PackBookDTO packBookDTO);
	
	int packUpdate(PackDTO packDTO);
	int packHotelUpdate(PackHotelDTO packHotelDTO);
	int packScheduleUpdate(PackScheduleDTO packScheduleDTO);
	int packLandmarkUpdate(PackLandmarkDTO packLandmarkDTO);
	int packBeforeNoticeUpdate(Map<String, Object> map);
	int packAfterNoticeUpdate(Map<String, Object> map);
	int packPriceInfoUpdate(PackPriceDTO packPriceDTO);
	
	int packHotelDelete(int pack_info_no);
	int packScheduleDelete(int pack_info_no);
	int packLandmarkDelete(int pack_info_no);
	
	int packDeleteBookConfirmSelect(int pack_info_no);
	int packDeletePayConfirmSelect(int pack_info_no);
	List<ImgDTO> packLandmarkImgConfirmSelect(int pack_info_no);
	List<ImgDTO> packHotelImgConfirmSelect(int pack_info_no);
	List<ImgDTO> packScheduleImgConfirmSelect(int pack_info_no);
	int packDelete(int pack_info_no);
	
	PackDTO packGetPackInfo(int pack_info_no);
	List<PackHotelDTO> packGetHotelInfo(int pack_info_no);
	List<PackLandmarkDTO> packGetLandmarkInfo(int pack_info_no);
	List<PackScheduleDTO> packGetScheduleInfo(int pack_info_no);
	PackPriceDTO packGetPriceInfo(int pack_info_no);
	String packGetBeforeNoticeInfo(int pack_info_no);
	String packGetAfterNoticeInfo(int pack_info_no);
	List<PackDTO> packList();
	
}
