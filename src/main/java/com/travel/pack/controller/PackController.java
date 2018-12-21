package com.travel.pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.travel.pack.dto.PackDTO;
import com.travel.pack.dto.PackHotelDTO;
import com.travel.pack.dto.PackLandmarkDTO;
import com.travel.pack.dto.PackPriceDTO;
import com.travel.pack.dto.PackScheduleDTO;
import com.travel.pack.service.PackService;

//패키지 기능 분배 컨트롤러

@Controller
@RequestMapping(value = "/Travel")
public class PackController {
	
	@Autowired
	private PackService packService;
	
	@RequestMapping(value = "/packAdd", method = RequestMethod.GET)
	public String packAdd() {
		System.out.println("패키지등록 창으로 이동......PackController.java");
		return "pack/packAdd";
	}
	
	//pack_info_course
	
	@RequestMapping(value = "/packAdd", method = RequestMethod.POST)
	public String packAdd(
			PackDTO packDTO,
			@RequestParam(value="pack_hotel_no",required=true) List<String> pack_hotel_no, 
			@RequestParam(value="pack_hotel_start_date",required=true) List<String> pack_hotel_start_date,
			@RequestParam(value="pack_hotel_end_date",required=true) List<String> pack_hotel_end_date,
			@RequestParam(value="pack_schedule_date",required=true) List<String> pack_schedule_date, 
			@RequestParam(value="pack_schedule_contents",required=true) List<String> pack_schedule_contents,
			@RequestParam(value="pack_landmark_code",required=true) List<String> pack_landmark_code,
			@RequestParam(value="pack_tour_date",required=true) List<String> pack_tour_date,
			@RequestParam(value="pack_tour_contents",required=true) List<String> pack_tour_contents,		
			PackPriceDTO packPriceDTO,
			@RequestParam(value="hotelImgFileName",required=false) List<MultipartFile> hotelImgFileName,
			@RequestParam(value="scheduleFileName",required=false) List<MultipartFile> scheduleFileName,
			@RequestParam(value="landMarkFileName",required=false) List<MultipartFile> landMarkFileName
			) {
		
		System.out.println("패키지등록 액션......PackController.java");
		List<PackHotelDTO> packHotelList = new ArrayList<PackHotelDTO>();
		List<PackScheduleDTO> packScheduleList = new ArrayList<PackScheduleDTO>();
		List<PackLandmarkDTO> packLandmakList = new ArrayList<PackLandmarkDTO>();

		// 다중정보 객체묶기
		for(int i = 0; i<pack_hotel_no.size(); i++) {
			PackHotelDTO packHotelDTO = new PackHotelDTO();
			packHotelDTO.setPack_hotel_no(pack_hotel_no.get(i));
			packHotelDTO.setPack_hotel_start_date(pack_hotel_start_date.get(i));
			packHotelDTO.setPack_hotel_end_date(pack_hotel_end_date.get(i));
			packHotelList.add(i, packHotelDTO);
		}
		
		for(int i = 0; i<pack_schedule_date.size(); i++) {
			PackScheduleDTO packScheduleDTO = new PackScheduleDTO();
			packScheduleDTO.setPack_schedule_date(pack_schedule_date.get(i));
			packScheduleDTO.setPack_schedule_contents(pack_schedule_contents.get(i));
			packScheduleList.add(i, packScheduleDTO);
		}
		
		for(int i = 0; i<pack_landmark_code.size(); i++) {
			PackLandmarkDTO packLandmarkDTO = new PackLandmarkDTO();
			packLandmarkDTO.setPack_landmark_code(pack_landmark_code.get(i));
			packLandmarkDTO.setPack_tour_date(pack_tour_date.get(i));
			packLandmarkDTO.setPack_tour_contents(pack_tour_contents.get(i));
			packLandmakList.add(i, packLandmarkDTO);
		}
		// 여기까지
		System.out.println(scheduleFileName.size() + "<<contro");
		
	
		packService.packAdd(packDTO, packHotelList, packScheduleList, packLandmakList, packPriceDTO, hotelImgFileName, scheduleFileName, landMarkFileName);
		return "";
	}
	
	@RequestMapping(value = "/packList", method = RequestMethod.GET)
	public String packList(Model model) {
		System.out.println("패키지 리스트......PackController.java");
		model.addAttribute("packList", packService.packList());
		return "pack/packList";
	}

	
	@RequestMapping(value = "/packGetInfo", method = RequestMethod.GET)
	public String packGetInfo(Model model, @RequestParam("pack_info_no") int pack_info_no) {
		System.out.println("패키지선택정보 조회......PackController.java");
		model.addAttribute("packDTO", packService.packGetInfo(pack_info_no));
		return "pack/packDetail";
	}
	
}
