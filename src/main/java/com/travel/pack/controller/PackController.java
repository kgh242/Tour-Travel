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

import com.travel.pack.dto.PackBookDTO;
import com.travel.pack.dto.PackDTO;
import com.travel.pack.dto.PackHotelDTO;
import com.travel.pack.dto.PackLandmarkDTO;
import com.travel.pack.dto.PackPriceDTO;
import com.travel.pack.dto.PackScheduleDTO;
import com.travel.pack.dto.PackSearchDTO;
import com.travel.pack.service.PackService;
import com.travel.paging.PageMaker;

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
			@RequestParam(value="pack_hotel_name",required=true) List<String> pack_hotel_name, 
			@RequestParam(value="pack_hotel_start_date",required=true) List<String> pack_hotel_start_date,
			@RequestParam(value="pack_hotel_end_date",required=true) List<String> pack_hotel_end_date,
			@RequestParam(value="pack_schedule_date",required=true) List<String> pack_schedule_date, 
			@RequestParam(value="pack_schedule_contents",required=true) List<String> pack_schedule_contents,
			@RequestParam(value="pack_landmark_code",required=true) List<String> pack_landmark_code,
			@RequestParam(value="pack_tour_date",required=true) List<String> pack_tour_date,
			@RequestParam(value="pack_tour_contents",required=true) List<String> pack_tour_contents,		
			PackPriceDTO packPriceDTO,
			String pack_notice_before_contents,
			String pack_notice_after_contents,
			@RequestParam(value="hotelImgFileName",required=false) List<MultipartFile> hotelImgFileName,
			@RequestParam(value="scheduleFileName",required=false) List<MultipartFile> scheduleFileName,
			@RequestParam(value="landMarkFileName",required=false) List<MultipartFile> landMarkFileName
			) {
		
		System.out.println("패키지등록 액션......PackController.java");
		List<PackHotelDTO> packHotelList = new ArrayList<PackHotelDTO>();
		List<PackScheduleDTO> packScheduleList = new ArrayList<PackScheduleDTO>();
		List<PackLandmarkDTO> packLandmakList = new ArrayList<PackLandmarkDTO>();
		

		// 다중정보 객체묶기
		for(int i = 0; i<pack_hotel_name.size(); i++) {
			PackHotelDTO packHotelDTO = new PackHotelDTO();
			System.out.println(pack_hotel_name.get(i) + "<<이름확인");
			packHotelDTO.setPack_hotel_name(pack_hotel_name.get(i));
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
	
		int result = packService.packAdd(packDTO, packHotelList, packScheduleList, packLandmakList, packPriceDTO, hotelImgFileName, scheduleFileName, landMarkFileName, pack_notice_before_contents, pack_notice_after_contents);
		System.out.println(result + "<최종결과 1성공, 0실패");
		if (result == 0) {
			//입력실패시 0 리턴
			return "";
		}
		return "redirect:/Travel/packList";
	}
	
	@RequestMapping(value = "/packList", method = RequestMethod.GET)
	public String packList(@RequestParam(value="currentPage", required=false, defaultValue = "1") int currentPage
			,Model model
			,PageMaker pageMaker
			,@RequestParam(value="packSearchCountry", required=false, defaultValue = "1") String packSearchCountry
			,@RequestParam(value="PackStartDate", required=false, defaultValue = "1") String packStartDate) {
		PackSearchDTO packSearchDTO = new PackSearchDTO();
		packSearchDTO.setPackSearchCountry(packSearchCountry);
		packSearchDTO.setPackStartDate(packStartDate);
		System.out.println(packSearchCountry+"<-packSearchCountry");
		System.out.println(packStartDate+"<-packStartDate");
		System.out.println("패키지 리스트......PackController.java");
		System.out.println(currentPage+"currentPage");
		pageMaker.setCurrentPage(currentPage);
		List<PackDTO> packList = packService.packList(pageMaker,packSearchDTO);
		model.addAttribute("packList", packList);
		model.addAttribute("currentPage", currentPage);
        model.addAttribute("pagePerBlock", pageMaker.getPagePerBlock());
        model.addAttribute("currentBlock", pageMaker.getCurrentBlock());
        model.addAttribute("startPage", pageMaker.getStartPage());
        model.addAttribute("endPage", pageMaker.getEndPage());
        model.addAttribute("prevPage", pageMaker.isPrevPage());
        model.addAttribute("nextPage", pageMaker.isNextPage());
		model.addAttribute("packSearchCountry",packSearchCountry);
		model.addAttribute("packStartDate",packStartDate);
		return "pack/packList";
	}

	
	@RequestMapping(value = "/packGetInfo", method = RequestMethod.GET)
	public String packGetInfo(Model model, @RequestParam("pack_info_no") int pack_info_no,
			@RequestParam(value="result", defaultValue = "sucess") String result,
			@RequestParam(value="deleteResult", defaultValue = "sucess") String deleteResult) {
		System.out.println("패키지선택정보 조회......PackController.java");
		model.addAttribute("packInfo", packService.packGetInfo(pack_info_no));
		model.addAttribute("result", result);
		model.addAttribute("deleteResult", deleteResult);
		return "pack/packDetail";
	}

	@RequestMapping(value = "/packDelete", method = RequestMethod.GET)
	public String packDelete(@RequestParam("pack_info_no") int pack_info_no) {
		System.out.println("패키지 삭제......PackController.java");
		int result=packService.packDelete(pack_info_no);
		if(result==0) {
			System.out.println("패키지 삭제 실패......PackController.java");
			return "redirect:/Travel/packGetInfo?pack_info_no=" + pack_info_no + "&deleteResult=fail";
		}else if(result==1) {
			System.out.println("패키지 삭제 성공......PackController.java");
			return "redirect:/Travel/packList";
		}else {
			System.out.println("패키지 삭제 예외 번호 확인 .......PackCountroller.java ---->: " + result);
			System.out.println("패키지 삭제 실패....예외발생......PackController.java");
			return "redirect:/Travel/packGetInfo?pack_info_no="+pack_info_no;
		}

	}
	
	@RequestMapping(value = "/packUpdate", method = RequestMethod.GET)
	public String packUpdate(Model model, @RequestParam("pack_info_no") int pack_info_no) {
		System.out.println("패키지정보 수정(업데이트) 창으로 이동......PackController.java");
		model.addAttribute("packInfo", packService.packGetInfo(pack_info_no));
		return "pack/packUpdate";
	}
	
	@RequestMapping(value = "/packUpdate", method = RequestMethod.POST)
	public String packUpdate(
			@RequestParam("pack_info_no") int pack_info_no,
			PackDTO packDTO,
			@RequestParam(value="pack_hotel_name",required=true) List<String> pack_hotel_name, 
			@RequestParam(value="pack_hotel_start_date",required=true) List<String> pack_hotel_start_date,
			@RequestParam(value="pack_hotel_end_date",required=true) List<String> pack_hotel_end_date,
			@RequestParam(value="pack_schedule_date",required=true) List<String> pack_schedule_date, 
			@RequestParam(value="pack_schedule_contents",required=true) List<String> pack_schedule_contents,
			@RequestParam(value="pack_landmark_code",required=true) List<String> pack_landmark_code,
			@RequestParam(value="pack_tour_date",required=true) List<String> pack_tour_date,
			@RequestParam(value="pack_tour_contents",required=true) List<String> pack_tour_contents,		
			PackPriceDTO packPriceDTO,
			String pack_notice_before_contents,
			String pack_notice_after_contents,
			@RequestParam(value="hotelImgFileName",required=false) List<MultipartFile> hotelImgFileName,
			@RequestParam(value="scheduleFileName",required=false) List<MultipartFile> scheduleFileName,
			@RequestParam(value="landMarkFileName",required=false) List<MultipartFile> landMarkFileName
			) {
		System.out.println("패키지정보 수정(업데이트) 액션......PackController.java");
		List<PackHotelDTO> packHotelList = new ArrayList<PackHotelDTO>();
		List<PackScheduleDTO> packScheduleList = new ArrayList<PackScheduleDTO>();
		List<PackLandmarkDTO> packLandmakList = new ArrayList<PackLandmarkDTO>();
		
		// 다중정보 객체묶기
		for(int i = 0; i<pack_hotel_name.size(); i++) {
			PackHotelDTO packHotelDTO = new PackHotelDTO();
			System.out.println(pack_hotel_name.get(i) + "<<이름확인");
			packHotelDTO.setPack_hotel_name(pack_hotel_name.get(i));
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
		}// 여기까지
		
		packService.packUpdate(pack_info_no, packDTO, packHotelList, packScheduleList, packLandmakList, packPriceDTO, hotelImgFileName, scheduleFileName, landMarkFileName, pack_notice_before_contents, pack_notice_after_contents);
		
		return "redirect:/Travel/packGetInfo?pack_info_no=" + pack_info_no;
	}
	
	@RequestMapping(value = "/packBook", method = RequestMethod.GET)
	public String packBook(
			Model model
			, @RequestParam("pack_info_no") int pack_info_no) {
		System.out.println("예약 정보 입력 창으로 이동......PackController.java");
		model.addAttribute("packInfo", packService.packGetInfo(pack_info_no));
		return "pack/packBook";
	}
	
	@RequestMapping(value = "/packBook", method = RequestMethod.POST)
	public String packBook(Model model, PackBookDTO packBookDTO) {
		System.out.println("예약 정보 입력 후 액션......PackController.java");

		if(packService.packBook(packBookDTO)==1) {
			System.out.println("예약 성공 ......PackController.java");
			model.addAttribute("packInfo", packService.packGetInfo(packBookDTO.getPack_info_no()));
			model.addAttribute("packBookSelect", packService.packBookSelect(packBookDTO));
			return "pack/packBookInfo";
		} else {
			System.out.println("예약 실패 ......PackController.java");
			return "redirect:/Travel/packGetInfo?pack_info_no=" + packBookDTO.getPack_info_no() + "&result=fail";
		}
		
	}
	
	@RequestMapping(value = "/packPay", method = RequestMethod.POST)
	public String packPay(PackBookDTO packBookDTO) {
		System.out.println("예약 결제 ......PackController.java");
		
		packService.packPay(packBookDTO);
		
		return null;
	}
	
}
