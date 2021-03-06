package com.travel.pack.service;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.travel.image.ImgDTO;
import com.travel.image.ImgHelper;
import com.travel.pack.dto.PackBookDTO;
import com.travel.pack.dto.PackDTO;
import com.travel.pack.dto.PackHotelDTO;
import com.travel.pack.dto.PackLandmarkDTO;
import com.travel.pack.dto.PackPriceDTO;
import com.travel.pack.dto.PackScheduleDTO;
import com.travel.pack.dto.PackSearchDTO;
import com.travel.pack.mapper.PackMapper;
import com.travel.paging.PageMaker;

//패키지 정보 Service

@Service
public class PackService {
	
	@Autowired
	private PackMapper packMapper;

	@Transactional
	public int packAdd(
			PackDTO packDTO, List<PackHotelDTO> packHotelList
			, List<PackScheduleDTO> packScheduleList
			,List<PackLandmarkDTO> packLandmakList
			, PackPriceDTO packPriceDTO
			, List<MultipartFile> hotelImgFileName
			,List<MultipartFile> scheduleFileName
			, List<MultipartFile> landMarkFileName
			,String pack_notice_before_contents
			,String pack_notice_after_contents
			) {

		System.out.println("패키지등록 액션......PackService.java");

		int result;

		// 이미지 정보 추출/사용을 위한 ImgHelper/ImgDTO
		ImgHelper imgHelper = new ImgHelper();
		ImgDTO imgDTO = new ImgDTO();

		try {
			result = packMapper.packAdd(packDTO);

			

			try {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("pack_info_no", packDTO.getPack_info_no());
				map.put("pack_notice_before_contents", pack_notice_before_contents);
				map.put("pack_notice_after_contents", pack_notice_after_contents);
				
				packMapper.packBeforeNotice(map); // 여행 출발 전 사전정보 입력 쿼리
				packMapper.packAfterNotice(map); 	// 여행 출발 후 사전정보 입력 쿼리
				
			} catch (Exception e) {
				System.out.println("여행출발전후 정보 입력 에러 발생 : " + e);
			}
			
			try {

				packPriceDTO.setPack_info_no(packDTO.getPack_info_no());	
				packMapper.packPriceInfo(packPriceDTO);
				
			} catch (Exception e) {
				System.out.println("가격 정보 입력 에러 발생 : " + e);
			}
		
			// 숙소정보입력
			try {
				for (int i = 0; i < packHotelList.size(); i++) {
					System.out.println(i + "번째 숙소정보입력......packService......jav");
					// 숙소이름(코드), 숙박시작/종료일 입력값 누락시 입력되지않음
					if (!packHotelList.get(i).getPack_hotel_name().equals("")
							&& !packHotelList.get(i).getPack_hotel_start_date().equals("")
							&& !packHotelList.get(i).getPack_hotel_end_date().equals("")) {
						PackHotelDTO packHotelDTO = new PackHotelDTO();
						packHotelDTO.setPack_info_no(packDTO.getPack_info_no());
						packHotelDTO.setPack_hotel_name(packHotelList.get(i).getPack_hotel_name());
						packHotelDTO.setPack_hotel_start_date(packHotelList.get(i).getPack_hotel_start_date());
						packHotelDTO.setPack_hotel_end_date(packHotelList.get(i).getPack_hotel_end_date());
						packMapper.packHotelAdd(packHotelDTO);
					}
	
				}
			} catch (Exception e) {
				System.out.println("숙소 정보 입력 에러 발생 : " + e);
			}

			// 스케줄정보입력 
			try {
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
			} catch (Exception e) {
				System.out.println("스케줄 정보 입력 에러 발생 : " + e);
			}

			
			  //관광지정보입력  pack_landmark_code pack_tour_date pack_tour_contents
			try {
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
			} catch (Exception e) {
				System.out.println("관광지 정보 입력 에러 발생 : " + e);
			}
			 

			// 호텔 이미지 업로드 처리.
			for (int i = 0; i < hotelImgFileName.size(); i++) {

				if (!hotelImgFileName.get(i).equals("")) {
					System.out.println(i + "번째 호텔이미지 업로드 처리 시작");
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
					try {
						int hotelImgResult = packMapper.packHotelImgAdd(map);

						if (hotelImgResult == 1) {
							File file = new File(hotelImgDTO.getImgPath() + File.separator +"src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "hotelImg");
							if (file.exists()) {
								
								hotelImgFileName.get(i)
										.transferTo(new File(hotelImgDTO.getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "hotelImg" + File.separator
												+ hotelImgDTO.getImgFalseName() + "." + hotelImgDTO.getImgExt()));

							} else {
								file.mkdirs();

								hotelImgFileName.get(i)
										.transferTo(new File(hotelImgDTO.getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "hotelImg" + File.separator
												+ hotelImgDTO.getImgFalseName() + "." + hotelImgDTO.getImgExt()));

							}
						}

					} catch (Exception e) {
						System.out.println("호텔 이미지 입력 에러 발생 : " + e);
					}

				}
			}

			// 스케줄 이미지 업로드 처리.
			for (int i = 0; i < scheduleFileName.size(); i++) {

				if (!scheduleFileName.get(i).equals("")) {
					System.out.println(i + "번째 스케줄이미지 업로드 처리 시작");
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
					try {
						int scheduleImgResult = packMapper.packScheduleImgAdd(map);

						if (scheduleImgResult == 1) {
							File file = new File(scheduleImgDTO.getImgPath() + File.separator +"src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" +File.separator + "scheduleImg");
							if (file.exists()) {

								scheduleFileName.get(i)
										.transferTo(new File(scheduleImgDTO.getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" +File.separator 
												+ "scheduleImg" + File.separator
												+ scheduleImgDTO.getImgFalseName() + "." + scheduleImgDTO.getImgExt()));

							} else {
								file.mkdirs();

								scheduleFileName.get(i)
										.transferTo(new File(scheduleImgDTO.getImgPath() + File.separator +"src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" +File.separator + "scheduleImg" + File.separator
												+ scheduleImgDTO.getImgFalseName() + "." + scheduleImgDTO.getImgExt()));
							}
						}
					} catch (Exception e) {
						System.out.println("스케줄 이미지 입력 에러 발생 : " + e);
					}

				}

			}

			// 관광지 이미지 업로드 처리.
			for (int i = 0; i < landMarkFileName.size(); i++) {

				if (!landMarkFileName.get(i).equals("")) {
					System.out.println(i + "번째 관광지이미지 업로드 처리 시작");
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
					try {
						int landmarkImgResult = packMapper.packLandmarkImgAdd(map);

						if (landmarkImgResult == 1) {
							File file = new File(landmarkImgDTO.getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "landmarkImg");
							if (file.exists()) {
								System.out
										.println("transferTo" + landmarkImgDTO.getImgPath() + "......PackService.java");

								landMarkFileName.get(i)
										.transferTo(new File(landmarkImgDTO.getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "landmarkImg" + File.separator
												+ landmarkImgDTO.getImgFalseName() + "." + landmarkImgDTO.getImgExt()));

							} else {
								System.out
										.println("transferTo" + landmarkImgDTO.getImgPath() + "......PackService.java");
								file.mkdirs();
								landMarkFileName.get(i)
										.transferTo(new File(landmarkImgDTO.getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "landmarkImg" + File.separator
												+ landmarkImgDTO.getImgFalseName() + "." + landmarkImgDTO.getImgExt()));
							}
						}
					} catch (Exception e) {
						System.out.println("호텔 이미지 입력 에러 발생 : " + e);
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
	
	public List<PackDTO> packList(PageMaker pageMaker,PackSearchDTO packSearchDTO) {
		System.out.println("패키지리스트 조회......PackService.java");
		List<PackDTO> result = new ArrayList<PackDTO>();
		Map<String, Object> map = new HashMap<String, Object>();
		pageMaker.setRowPerPage(10);
		pageMaker.setPagePerBlock(10);
		pageMaker.setStartRow();
        
        if(packSearchDTO.getPackSearchCountry().equals("1")) {
        	packSearchDTO.setPackSearchCountry(null);
        }
        if(packSearchDTO.getPackStartDate().equals("1")) {
        	packSearchDTO.setPackStartDate(null);
        }
    	map.put("pageMaker", pageMaker);
		map.put("packSearchDTO", packSearchDTO);
		if(packSearchDTO.getPackSearchCountry() == null) {
			if(packSearchDTO.getPackStartDate() == null) {
				System.out.println("둘다널");
				 pageMaker.setAllCount(packMapper.packSelectCount());
				 System.out.println(pageMaker.getAllCount()+"<- allCount");
				result = packMapper.packList1(pageMaker);
			}else {
				System.out.println("나라명 널");
				pageMaker.setAllCount(packMapper.packList3Count(map));
				System.out.println(pageMaker.getAllCount()+"<- allCount");
				result = packMapper.packList3(map);
			}
		}
		
		if(packSearchDTO.getPackStartDate() == null) {
			if(packSearchDTO.getPackSearchCountry() != null) {
				System.out.println("날짜만 널");
				pageMaker.setAllCount(packMapper.packList2Count(map));
				System.out.println(pageMaker.getAllCount()+"<- allCount");
				result = packMapper.packList2(map);
			}
		}else if(packSearchDTO.getPackStartDate() != null) {
			if(packSearchDTO.getPackSearchCountry() != null) {
				System.out.println("둘다 널아님");
				pageMaker.setAllCount(packMapper.packListCount(map));
				System.out.println(pageMaker.getAllCount()+"<- allCount");
				result = packMapper.packList(map);
			}
		}
   
        // 페이징에 필요한 값 계산하여 설정
	
        pageMaker.setLastPage();
        pageMaker.setCurrentBlock();
        pageMaker.setLastBlock();
        pageMaker.setStartPage();
        pageMaker.setEndPage();
        // 이전 페이지와 다음 페이지를 컨트롤하는 조건문
        if(pageMaker.getCurrentBlock() != pageMaker.getLastBlock() && pageMaker.getCurrentBlock() >1){
        	pageMaker.setPrevPage(true);
            pageMaker.setNextPage(true);
        }else  if(pageMaker.getCurrentBlock() != pageMaker.getLastBlock() && pageMaker.getLastBlock() != 1) {
        	pageMaker.setPrevPage(false);
            pageMaker.setNextPage(true);
        }else if(pageMaker.getCurrentBlock() <= pageMaker.getLastBlock() && pageMaker.getCurrentBlock() != 1){
        	pageMaker.setPrevPage(true);
            pageMaker.setNextPage(false);   
        }else if(pageMaker.getLastBlock() == 1) {
        	pageMaker.setPrevPage(false);
            pageMaker.setNextPage(false); 
        }
		return result;
	}
	
	public Map<String, Object> packGetInfo(int pack_info_no) {
		System.out.println("패키지선택정보 조회......PackService.java");
		
		Map<String, Object> map = new HashMap<String, Object>();

		try {
			map.put("packInfo", packMapper.packGetPackInfo(pack_info_no));
			map.put("packHotelInfo", packMapper.packGetHotelInfo(pack_info_no));
			map.put("packLandmarkInfo", packMapper.packGetLandmarkInfo(pack_info_no));
			map.put("packScheduleInfo", packMapper.packGetScheduleInfo(pack_info_no));
			map.put("packPriceInfo", packMapper.packGetPriceInfo(pack_info_no));
			map.put("PackBeforeNoticeInfo", packMapper.packGetBeforeNoticeInfo(pack_info_no));
			map.put("PackAfterNoticeInfo", packMapper.packGetAfterNoticeInfo(pack_info_no));
			map.put("hotelImg", packMapper.packHotelImgConfirmSelect(pack_info_no));
			map.put("landmarkImg", packMapper.packLandmarkImgConfirmSelect(pack_info_no));
			map.put("scheduleImg", packMapper.packScheduleImgConfirmSelect(pack_info_no));
			
			System.out.println(map.get("hotelImg"));
			System.out.println(map.get("landmarkImg"));
			System.out.println(map.get("scheduleImg"));
			
			
		} catch (Error e) {
			System.out.println("패키지선택정보 조회 에러발생 ......Packservice.java : " + e);
		}
		return map;
		
	}
	public int packDelete(int pack_info_no) {
		System.out.println("패키지 삭제......PackService.java");
		int result=0;
		try {
			if(packMapper.packDeleteBookConfirmSelect(pack_info_no) == 0 && packMapper.packDeletePayConfirmSelect(pack_info_no) == 0) {
				List<ImgDTO> packHotelImg = packMapper.packHotelImgConfirmSelect(pack_info_no);
				List<ImgDTO> packScheduleImg = packMapper.packScheduleImgConfirmSelect(pack_info_no);
				List<ImgDTO> packLandmarkImg = packMapper.packLandmarkImgConfirmSelect(pack_info_no);
				
				if(packMapper.packDelete(pack_info_no)==1) {
					// 호텔이미지 실제 파일 삭제
					for(int i = 0; i<packHotelImg.size(); i++) {
						File file = new File(packHotelImg.get(i).getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "hotelImg" + File.separator + packHotelImg.get(i).getImgFalseName() + "." + packHotelImg.get(i).getImgExt());
						if(file.exists()) {
							if(file.delete()) {
								System.out.println(file.getName() + " <- 호텔 이미지 파일 삭제 성공......PackService.java");
							} else {
								System.out.println(file.getName() + " <- 호텔 이미지 파일 삭제 실패......PackService.java");
							}
						} else {
							System.out.println(file.getName() + " <- 호텔 이미지 파일 존재하지않음. 삭제 실패......PackService.java");
						}
					}
					// 스케줄 이미지 실제 파일 삭제
					for(int i = 0; i<packScheduleImg.size(); i++) {
						File file = new File(packScheduleImg.get(i).getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "scheduleImg" + File.separator + packScheduleImg.get(i).getImgFalseName() + "." + packScheduleImg.get(i).getImgExt());
						if(file.exists()) {
							if(file.delete()) {
								System.out.println(file.getName() + " <- 스케줄 이미지 파일 삭제 성공......PackService.java");
							} else {
								System.out.println(file.getName() + " <- 스케줄 이미지 파일 삭제 실패......PackService.java");
							}
						} else {
							System.out.println(file.getName() + " <- 스케줄 이미지 파일 존재하지않음. 삭제 실패......PackService.java");
						}
					}
					// 관광지 이미지 실제 파일 삭제
					for(int i = 0; i<packLandmarkImg.size(); i++) {
						File file = new File(packLandmarkImg.get(i).getImgPath() + File.separator + "src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" + File.separator+ "landmarkImg" + File.separator + packLandmarkImg.get(i).getImgFalseName() + "." + packLandmarkImg.get(i).getImgExt());
						if(file.exists()) {
							if(file.delete()) {
								System.out.println(file.getName() + " <- 관광지 이미지 파일 삭제 성공......PackService.java");
							} else {
								System.out.println(file.getName() + " <- 관광지 이미지 파일 삭제 실패......PackService.java");
							}
						} else {
							System.out.println(file.getName() + " <- 관광지 이미지 파일 존재하지않음. 삭제 실패......PackService.java");
						}
					}
					System.out.println("패키지 삭제 성공......PackService.java");
					result=1;
				}
			} else {
				System.out.println("패키지상품에 등록된 고객이 있어 삭제불가 ......PackService.java");
			}
		} catch (Exception e) {
			System.out.println("패키지 삭제 에러발생 ......Packservice.java : " + e);
		}
		return result;
	}
	
	
	public int packUpdate(
			int pack_info_no
			, PackDTO packDTO
			, List<PackHotelDTO> packHotelList
			, List<PackScheduleDTO> packScheduleList
			,List<PackLandmarkDTO> packLandmakList
			, PackPriceDTO packPriceDTO
			, List<MultipartFile> hotelImgFileName
			,List<MultipartFile> scheduleFileName
			, List<MultipartFile> landMarkFileName
			,String pack_notice_before_contents
			,String pack_notice_after_contents) {
		
		System.out.println("패키지 수정......PackService.java");
		System.out.println(hotelImgFileName.size() + "<<호텔이미지갯수");
		System.out.println(scheduleFileName.size() + "<<스케줄이미지갯수");
		System.out.println(landMarkFileName.size() + "<<관광지이미지갯수");
		System.out.println(packHotelList.get(0).getPack_hotel_name() + "<<<");
		
		int result;

/*		// 이미지 정보 추출/사용을 위한 ImgHelper/ImgDTO
		ImgHelper imgHelper = new ImgHelper();
		ImgDTO imgDTO = new ImgDTO();*/
		
		
		try {
			//여행 출발 전/후 정보 수정
			try {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("pack_info_no", packDTO.getPack_info_no());
				map.put("pack_notice_before_contents", pack_notice_before_contents);
				map.put("pack_notice_after_contents", pack_notice_after_contents);
				
				packMapper.packBeforeNoticeUpdate(map); // 여행 출발 전 사전정보 수정 쿼리
				packMapper.packAfterNoticeUpdate(map); 	// 여행 출발 후 사전정보 수정 쿼리
				
			} catch (Exception e) {
				System.out.println("여행출발전후 정보 수정 에러 발생 : " + e);
			}
			
			//가격 정보 수정
			try {
	
				packPriceDTO.setPack_info_no(packDTO.getPack_info_no());	
				packMapper.packPriceInfoUpdate(packPriceDTO);
				
			} catch (Exception e) {
				System.out.println("가격 정보 입력 에러 발생 : " + e);
			}

			// 숙소정보 삭제 후 입력
			try {
				packMapper.packHotelDelete(pack_info_no);
				for (int i = 0; i < packHotelList.size(); i++) {
					System.out.println(i + "번째 숙소정보입력......packService......jav");
					// 숙소이름(코드), 숙박시작/종료일 입력값 누락시 입력되지않음
					if (!packHotelList.get(i).getPack_hotel_name().equals("")
							&& !packHotelList.get(i).getPack_hotel_start_date().equals("")
							&& !packHotelList.get(i).getPack_hotel_end_date().equals("")) {
						PackHotelDTO packHotelDTO = new PackHotelDTO();
						packHotelDTO.setPack_info_no(packDTO.getPack_info_no());
						packHotelDTO.setPack_hotel_name(packHotelList.get(i).getPack_hotel_name());
						packHotelDTO.setPack_hotel_start_date(packHotelList.get(i).getPack_hotel_start_date());
						packHotelDTO.setPack_hotel_end_date(packHotelList.get(i).getPack_hotel_end_date());
						packMapper.packHotelAdd(packHotelDTO);
					}

				}
			} catch (Exception e) {
				System.out.println("숙소 정보 입력 에러 발생 : " + e);
			}

			// 스케줄 삭제 후 입력
			try {
				packMapper.packScheduleDelete(pack_info_no);
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
			} catch (Exception e) {
				System.out.println("스케줄 정보 입력 에러 발생 : " + e);
			}

			// 관광지 삭제 후 입력
			try {
				packMapper.packLandmarkDelete(pack_info_no);
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
			} catch (Exception e) {
				System.out.println("관광지 정보 입력 에러 발생 : " + e);
			}



			result = 1;
		} catch (Exception e) {
			result = 0;
			System.out.println("에러발생 : " + e);
		}
		
		return 0;
	}
	
	
	public int packBook(PackBookDTO packBookDTO) {
		System.out.println("패키지 예약......PackService.java");
		int result = 0;
		//중복예약방지. packOverBook 리턴값 0일 시 예약진행
		if(packMapper.packOverBook(packBookDTO)==0) {
			try {
				result = packMapper.packBook(packBookDTO);
			} catch (Exception e) {
				System.out.println("에러발생 : " + e);
			}
		}
		return result;
	}
	
	public PackBookDTO packBookSelect(PackBookDTO packBookDTO) {
		System.out.println("패키지 예약내역 조회......PackService.java");
		return packMapper.packBookSelect(packBookDTO);
	}
	
	@Transactional
	public int packPay(PackBookDTO packBookDTO) {
		System.out.println("패키지 결제......PackService.java");
		int result = 0;
		try {
			packMapper.packPay(packBookDTO);
			
		} catch (Exception e) {
			System.out.println("에러발생 : " + e);
		}
		
		return result;
	}
	
	public PackDTO packComList(String company_id) {
		System.out.println("packComList 서비스 계층");
		return packMapper.packComList(company_id);
	}
}
