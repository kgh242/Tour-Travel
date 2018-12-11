package com.travel.member.company.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.travel.member.company.dto.CompanyDTO;
import com.travel.member.company.dto.CompanyImgDTO;
import com.travel.member.company.dto.CompanyRequestDTO;
import com.travel.member.company.mapper.CompanyMapper;

@Service
@Transactional
public class CompanyService {
	@Autowired
	private CompanyMapper companyMapper;

	public int companyAdd(CompanyRequestDTO companyRequestDTO) {
		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setCompany_id(companyRequestDTO.getCompany_id());
		companyDTO.setCompany_pw(companyRequestDTO.getCompany_pw());
		companyDTO.setCompany_name(companyRequestDTO.getCompany_name());
		companyDTO.setCompany_tell1(companyRequestDTO.getCompany_tell1());
		companyDTO.setCompany_tell2(companyRequestDTO.getCompany_tell2());
		companyDTO.setCompany_address(companyRequestDTO.getCompany_address());
		companyDTO.setCompany_business_no(companyRequestDTO.getCompany_business_no());
		companyDTO.setCompany_branch_tell(companyRequestDTO.getCompany_branch_tell());
		companyDTO.setCompany_head_tell(companyRequestDTO.getCompany_head_tell());
		companyMapper.insertCompany(companyDTO);
		
		CompanyImgDTO companyImgDTO = new CompanyImgDTO();
		MultipartFile multipartFile = companyRequestDTO.getMultipartFile();
		
		companyImgDTO.setCompany_id(companyDTO.getCompany_id());
		
		File f = new File("");
		String path = f.getAbsolutePath();
		companyImgDTO.setCompany_img_path(path);
		
		String originalFileName = multipartFile.getOriginalFilename();
		companyImgDTO.setCompany_img_true_name(originalFileName);
		String ext = originalFileName.substring(0);
		companyImgDTO.setCompany_img_ext(ext);
		
		String fileName = UUID.randomUUID().toString();
		companyImgDTO.setCompany_img_false_name(fileName);
		
		companyImgDTO.setCompany_img_size(multipartFile.getSize());
		
		File file = new File(path+File.separator+"uploads");
		if(file.exists()) {
				try {
					multipartFile.transferTo(new File(path+File.separator+"uploads"+File.separator+fileName+"."+ext));
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		} else {
			file.mkdirs();
			try {
				multipartFile.transferTo(new File(path+File.separator+"uploads"+File.separator+fileName+"."+ext));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return companyMapper.insertCompanyImg(companyImgDTO);
	}

}
