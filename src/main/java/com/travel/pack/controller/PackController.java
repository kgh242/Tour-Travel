package com.travel.pack.controller;

import java.util.ArrayList;

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
			PackHotelDTO packHotelDTO,
			PackScheduleDTO packScheduleDTO,
			PackLandmarkDTO packLandmarkDTO,
			PackPriceDTO packPriceDTO,
			@RequestParam("hotelImgFileName[]") MultipartFile hotelImgFileName[],
			@RequestParam("scheduleFileName[]") MultipartFile scheduleFileName[],
			@RequestParam("landMarkFileName[]") MultipartFile landMarkFileName[]
			) {
		System.out.println("패키지등록 액션......PackController.java");
		System.out.println(packDTO.getPack_info_title() + "글제목");
		System.out.println(packHotelDTO.getPack_hotel_no() + "호텔");
		System.out.println(packHotelDTO.getPack_hotel_start_date() + "호텔");
		System.out.println(packHotelDTO + "호텔");
		System.out.println(packScheduleDTO + "스케줄");
		System.out.println(packScheduleDTO.getPack_schedule_contents() + "스케줄");
		System.out.println(packLandmarkDTO.getPack_landmark_code() + "관광지");
		System.out.println(packLandmarkDTO.getPack_tour_date() + "관광지");
		System.out.println(packLandmarkDTO.getPack_tour_contents() + "관광지");
		System.out.println(packPriceDTO.getPack_price_adult() + "가격");
		System.out.println(packPriceDTO.getPack_price_baby() + "가격");
		System.out.println(packPriceDTO.getPack_price_child() + "가격");
		System.out.println(hotelImgFileName[0].getOriginalFilename() + "호텔이미지오리지널네임");
		System.out.println(hotelImgFileName[1].getOriginalFilename() + "호텔이미지오리지널네임");
		System.out.println(scheduleFileName[0].getOriginalFilename() + "스케쥴이미지오리지널네임");
		System.out.println(scheduleFileName[1].getOriginalFilename() + "스케쥴이미지오리지널네임");
		System.out.println(landMarkFileName[0].getOriginalFilename() + "관광지이미지오리지널네임");
		System.out.println(landMarkFileName[1].getOriginalFilename() + "관광지이미지오리지널네임");
		System.out.println(packLandmarkDTO.getPack_tour_contents() + "textarea!!");
		
		packService.packAdd(packDTO, packHotelDTO, packScheduleDTO, packLandmarkDTO, packPriceDTO, hotelImgFileName, scheduleFileName, landMarkFileName);
		return "redirect:/packList";
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
