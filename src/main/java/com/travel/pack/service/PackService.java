package com.travel.pack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.travel.image.ImgDTO;
import com.travel.image.ImgHelper;
import com.travel.pack.dto.PackDTO;
import com.travel.pack.dto.PackHotelDTO;
import com.travel.pack.dto.PackLandmarkDTO;
import com.travel.pack.dto.PackPriceDTO;
import com.travel.pack.dto.PackScheduleDTO;
import com.travel.pack.mapper.PackMapper;

//패키지 정보 Service

@Service
public class PackService {
	
	@Autowired
	private PackMapper packMapper;
	
	@Transactional
	public int packAdd(
			PackDTO packDTO, 
			PackHotelDTO packHotelDTO,
			PackScheduleDTO packScheduleDTO,
			PackLandmarkDTO packLandmarkDTO,
			PackPriceDTO packPriceDTO,
			MultipartFile hotelImgFileName[],
			MultipartFile scheduleFileName[],
			MultipartFile landMarkFileName[]) {
		System.out.println("패키지등록 액션......PackService.java");		
		System.out.println(packDTO.getPack_info_title() + "서비스!!글제목");
		System.out.println(packHotelDTO.getPack_hotel_no() + "서비스!!호텔");
		System.out.println(packHotelDTO.getPack_hotel_start_date() + "서비스!!호텔");
		System.out.println(packHotelDTO.getPack_hotel_end_date() + "서비스!!호텔");
		System.out.println(packScheduleDTO.getPack_schedule_date() + "서비스!!스케줄");
		System.out.println(packScheduleDTO.getPack_schedule_contents() + "서비스!!스케줄");
		System.out.println(packLandmarkDTO.getPack_landmark_code() + "서비스!!관광지");
		System.out.println(packLandmarkDTO.getPack_tour_date() + "서비스!!관광지");
		System.out.println(packLandmarkDTO.getPack_tour_contents() + "서비스!!관광지");
		System.out.println(packPriceDTO.getPack_price_adult() + "서비스!!가격");
		System.out.println(packPriceDTO.getPack_price_baby() + "서비스!!가격");
		System.out.println(packPriceDTO.getPack_price_child() + "서비스!!가격");

		System.out.println(packLandmarkDTO.getPack_tour_contents() + "textarea!!");
		
		int result = 0;
		ImgHelper imgHelper = new ImgHelper();
		int hotelImgCount = 0;
		int scheduleImgCount = 0;
		int landMarkImgCount = 0;
	
		for(int count = 0; !(hotelImgFileName[count].isEmpty()); count++) {
			hotelImgCount = count;
		}
		for(int count = 0; !(scheduleFileName[count].isEmpty()); count++) {
			scheduleImgCount = count;
		}
		for(int count = 0; !(landMarkFileName[count].isEmpty()); count++) {
			landMarkImgCount = count;
		}
		
		System.out.println(hotelImgCount+ "<<<<<<이미지개수");
		
		if(hotelImgCount == 0 && scheduleImgCount == 0 && landMarkImgCount == 0) {
			System.out.println("패키지등록 이미지업로드 없음......PackService.java");
			try {
				result = packMapper.packAdd(packDTO);
			} catch (Error e) {
				System.out.println("패키지등록(이미지없음) 액션 에러발생 ......Packservice.java : " + e);
			}
		}else {
			System.out.println(hotelImgFileName[0].getOriginalFilename() + "서비스!!호텔이미지오리지널네임");
			System.out.println(scheduleFileName[0].getOriginalFilename() + "서비스!!스케쥴이미지오리지널네임");
			System.out.println(landMarkFileName[0].getOriginalFilename() + "서비스!!관광지이미지오리지널네임");
			for(int i = 0; i < landMarkFileName.length; i ++) {
				ImgDTO imgDTO = new ImgDTO();
				imgDTO.setImgPath((imgHelper.imgHelper(landMarkFileName[i])).getImgPath());
				imgDTO.setImgTrueName((imgHelper.imgHelper(landMarkFileName[i])).getImgTrueName());
				imgDTO.setImgFalseName((imgHelper.imgHelper(landMarkFileName[i])).getImgFalseName());
				imgDTO.setImgExt((imgHelper.imgHelper(landMarkFileName[i])).getImgExt());
				imgDTO.setImgSize((imgHelper.imgHelper(landMarkFileName[i])).getImgSize());
				
				try {
					//for(int j = 0; j < packHotelDTO.getHotel_code().size(); j++) {
						//packMapper.packHotelAdd(packHotelDTO);
					//}
					//packMapper.packAdd(packDTO);
					//packMapper.packLandMarkImgInsert(imgDTO);
					result = 1;
				} catch (Error e) {
					System.out.println("패키지등록(이미지등록) 액션 에러발생 ......PackService.java : " + e);
				}
			}
		}

		return 0;
		
	}
	
	public List<PackDTO> packList() {
		System.out.println("패키지리스트 조회......PackService.java");
		List<PackDTO> result = new ArrayList<PackDTO>();
		try {
			result = packMapper.packList();
		} catch (Error e) {
			System.out.println("패키지리스트 조회 에러발생 ......Packservice.java : " + e);
		}
		
		return result;
		
	}
	
	public PackDTO packGetInfo(int pack_info_no) {
		System.out.println("패키지선택정보 조회......PackService.java");
		PackDTO result = new PackDTO();
		
		try {
			result = packMapper.packGetInfo(pack_info_no);
		} catch (Error e) {
			System.out.println("패키지선택정보 조회 에러발생 ......Packservice.java : " + e);
		}
		return result;
		
	}

}
