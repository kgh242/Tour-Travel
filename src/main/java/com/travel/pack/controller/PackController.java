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
