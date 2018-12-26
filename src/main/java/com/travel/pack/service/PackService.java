package com.travel.pack.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
	public int packAdd(PackDTO packDTO, List<PackHotelDTO> packHotelList, List<PackScheduleDTO> packScheduleList,
			List<PackLandmarkDTO> packLandmakList, PackPriceDTO packPriceDTO, List<MultipartFile> hotelImgFileName,
			List<MultipartFile> scheduleFileName, List<MultipartFile> landMarkFileName) {

		System.out.println("패키지등록 액션......PackService.java");

		int result = 0;

		// 이미지 정보 추출/사용을 위한 ImgHelper/ImgDTO
		ImgHelper imgHelper = new ImgHelper();
		ImgDTO imgDTO = new ImgDTO();

		System.out.println(hotelImgFileName.size() + "<<호텔이미지갯수");
		System.out.println(scheduleFileName.size() + "<<스케줄이미지갯수");
		System.out.println(landMarkFileName.size() + "<<관광지이미지갯수");



		try {
			result = packMapper.packAdd(packDTO);
			System.out.println(packDTO.getPack_info_no() + "<-PK value");

			// 숙소정보입력
			for (int i = 0; i < packHotelList.size(); i++) {
				System.out.println(i + "번째 숙소정보입력......packService......jav");
				// 숙소이름(코드), 숙박시작/종료일 입력값 누락시 입력되지않음
				if (!packHotelList.get(i).getPack_hotel_no().equals("")
						&& !packHotelList.get(i).getPack_hotel_start_date().equals("")
						&& !packHotelList.get(i).getPack_hotel_end_date().equals("")) {
					PackHotelDTO packHotelDTO = new PackHotelDTO();
					packHotelDTO.setPack_info_no(packDTO.getPack_info_no());
					packHotelDTO.setPack_hotel_no(packHotelList.get(i).getPack_hotel_no());
					packHotelDTO.setPack_hotel_start_date(packHotelList.get(i).getPack_hotel_start_date());
					packHotelDTO.setPack_hotel_end_date(packHotelList.get(i).getPack_hotel_end_date());
					packMapper.packHotelAdd(packHotelDTO);
				}

			}

			// 스케줄정보입력 
			for (int i = 0; i < packScheduleList.size(); i++) {
				System.out.println(i + "번째 스케줄정보입력......packService......jav");
				// 스케줄해당날짜, 스케줄내용 입력값 누락시 입력되지않음
				if (!packScheduleList.get(i).getPack_schedule_date().equals("")
						&& !packScheduleList.get(i).getPack_schedule_contents().equals("")) {
					PackScheduleDTO packScheduleDTO = new PackScheduleDTO();
					packScheduleDTO.setCompany_id(packDTO.getCompany_id());
					packScheduleDTO.setPack_info_no(packDTO.getPack_info_no());
					packScheduleDTO.setPack_schedule_date(packScheduleList.get(i).getPack_schedule_date());
					packScheduleDTO.setPack_schedule_contents(packScheduleList.get(i).getPack_schedule_contents());

					packMapper.packScheduleAdd(packScheduleDTO);
				}

			}

			
			  //관광지정보입력  pack_landmark_code pack_tour_date pack_tour_contents
			for (int i = 0; i < packLandmakList.size(); i++) {
				System.out.println(i + "번째 관광지정보입력......packService......jav"); // 숙소이름(코드),
				// 숙박시작/종료일 입력값 누락시 입력되지않음
				if (!packLandmakList.get(i).getPack_landmark_code().equals("")
						&& !packLandmakList.get(i).getPack_tour_date().equals("")
						&& !packLandmakList.get(i).getPack_tour_contents().equals("")) {
					PackLandmarkDTO packLandmarkDTO = new PackLandmarkDTO();
					packLandmarkDTO.setPack_info_no(packDTO.getPack_info_no());
					packLandmarkDTO.setCompany_id(packDTO.getCompany_id());
					packLandmarkDTO.setPack_landmark_code(packLandmakList.get(i).getPack_landmark_code());
					packLandmarkDTO.setPack_tour_date(packLandmakList.get(i).getPack_tour_date());
					packLandmarkDTO.setPack_tour_contents(packLandmakList.get(i).getPack_tour_contents());
					
					packMapper.packLandmarkAdd(packLandmarkDTO);
				}

			}
			 

			// 호텔 이미지 업로드 처리.
			for (int i = 0; i < hotelImgFileName.size(); i++) {

				if (!hotelImgFileName.get(i).equals("")) {
					
					imgDTO = imgHelper.imgHelper(hotelImgFileName.get(i));
					ImgDTO hotelImgDTO = new ImgDTO();
					hotelImgDTO.setImgExt(imgDTO.getImgExt());
					hotelImgDTO.setImgTrueName(imgDTO.getImgTrueName());
					hotelImgDTO.setImgFalseName(imgDTO.getImgFalseName());
					hotelImgDTO.setImgPath(imgDTO.getImgPath());
					hotelImgDTO.setImgSize(imgDTO.getImgSize());

					Map<String, Object> map = new HashMap<String, Object>();
					map.put("pack_info_no", packDTO.getPack_info_no());
					map.put("imgDTO", hotelImgDTO);

					int hotelImgResult = packMapper.packHotelImgAdd(map);

					if (hotelImgResult == 1) {
						File file = new File(
								hotelImgDTO.getImgPath() + File.separator + "uploads" + File.separator + "hotelImg");
						if (file.exists()) {
							try {
								hotelImgFileName.get(i)
										.transferTo(new File(hotelImgDTO.getImgPath() + File.separator + "uploads"
												+ File.separator + "hotelImg" + File.separator
												+ hotelImgDTO.getImgFalseName() + "." + hotelImgDTO.getImgExt()));
							} catch (IllegalStateException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						} else {
							file.mkdirs();
							try {
								hotelImgFileName.get(i)
										.transferTo(new File(hotelImgDTO.getImgPath() + File.separator + "uploads"
												+ File.separator + "hotelImg" + File.separator
												+ hotelImgDTO.getImgFalseName() + "." + hotelImgDTO.getImgExt()));
							} catch (IllegalStateException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}

						}
					}

				}
			}

			// 스케줄 이미지 업로드 처리.
			for (int i = 0; i < scheduleFileName.size(); i++) {

				if (!scheduleFileName.get(i).equals("")) {

					imgDTO = imgHelper.imgHelper(scheduleFileName.get(i));
					ImgDTO scheduleImgDTO = new ImgDTO();
					scheduleImgDTO.setImgExt(imgDTO.getImgExt());
					scheduleImgDTO.setImgTrueName(imgDTO.getImgTrueName());
					scheduleImgDTO.setImgFalseName(imgDTO.getImgFalseName());
					scheduleImgDTO.setImgPath(imgDTO.getImgPath());
					scheduleImgDTO.setImgSize(imgDTO.getImgSize());

					Map<String, Object> map = new HashMap<String, Object>();
					map.put("pack_info_no", packDTO.getPack_info_no());
					map.put("imgDTO", scheduleImgDTO);

					int scheduleImgResult = packMapper.packScheduleImgAdd(map);

					if (scheduleImgResult == 1) {
						File file = new File(scheduleImgDTO.getImgPath() + File.separator + "uploads" + File.separator
								+ "scheduleImg");
						if (file.exists()) {
							try {
								scheduleFileName.get(i)
										.transferTo(new File(scheduleImgDTO.getImgPath() + File.separator + "uploads"
												+ File.separator + "scheduleImg" + File.separator
												+ scheduleImgDTO.getImgFalseName() + "." + scheduleImgDTO.getImgExt()));
							} catch (IllegalStateException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						} else {
							file.mkdirs();
							try {
								scheduleFileName.get(i)
										.transferTo(new File(scheduleImgDTO.getImgPath() + File.separator + "uploads"
												+ File.separator + "scheduleImg" + File.separator
												+ scheduleImgDTO.getImgFalseName() + "." + scheduleImgDTO.getImgExt()));
							} catch (IllegalStateException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}

						}
					}

				}

			}

			// 관광지 이미지 업로드 처리.
			for (int i = 0; i < landMarkFileName.size(); i++) {

				if (!landMarkFileName.get(i).equals("")) {
					imgDTO = imgHelper.imgHelper(landMarkFileName.get(i));
					ImgDTO landmarkImgDTO = new ImgDTO();
					landmarkImgDTO.setImgExt(imgDTO.getImgExt());
					landmarkImgDTO.setImgTrueName(imgDTO.getImgTrueName());
					landmarkImgDTO.setImgFalseName(imgDTO.getImgFalseName());
					landmarkImgDTO.setImgPath(imgDTO.getImgPath());
					landmarkImgDTO.setImgSize(imgDTO.getImgSize());

					Map<String, Object> map = new HashMap<String, Object>();
					map.put("pack_info_no", packDTO.getPack_info_no());
					map.put("imgDTO", landmarkImgDTO);

					int landmarkImgResult = packMapper.packLandmarkImgAdd(map);

					if (landmarkImgResult == 1) {
						File file = new File(
								landmarkImgDTO.getImgPath() + File.separator + "uploads" + File.separator + "landmarkImg");
						if (file.exists()) {
							System.out.println("transferTo" + landmarkImgDTO.getImgPath() + "......PackService.java");
							try {
								landMarkFileName.get(i)
										.transferTo(new File(landmarkImgDTO.getImgPath() + File.separator + "uploads"
												+ File.separator + "landmarkImg" + File.separator
												+ landmarkImgDTO.getImgFalseName() + "." + landmarkImgDTO.getImgExt()));
							} catch (IllegalStateException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						} else {
							System.out.println("transferTo" + landmarkImgDTO.getImgPath() + "......PackService.java");
							file.mkdirs();
							try {
								landMarkFileName.get(i)
										.transferTo(new File(landmarkImgDTO.getImgPath() + File.separator + "uploads"
												+ File.separator + "landmarkImg" + File.separator
												+ landmarkImgDTO.getImgFalseName() + "." + landmarkImgDTO.getImgExt()));
							} catch (IllegalStateException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}

						}
					}

				}
			}
			result = 1;
		} catch (Exception e) {
			result = 0;
			System.out.println("에러발생 : " + e);
		}

		return result;

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
