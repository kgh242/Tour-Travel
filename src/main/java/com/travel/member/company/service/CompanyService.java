package com.travel.member.company.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.travel.member.company.dto.CompanyDTO;
import com.travel.member.company.dto.CompanyImgDTO;
import com.travel.member.company.mapper.CompanyMapper;

@Service
@Transactional
public class CompanyService {
	@Autowired
	private CompanyMapper companyMapper;

	public int companyAdd(CompanyDTO companyDTO, CompanyImgDTO companyImgDTO) {
		companyMapper.insertCompany(companyDTO);
		
		MultipartFile multipartFile = companyImgDTO.getCompany_img();
		
		companyImgDTO.setCompany_id(companyDTO.getCompany_id());
		
		File f = new File("");
		String path = f.getAbsolutePath();
		companyImgDTO.setCompany_img_path(path);
		f.delete();
		
		String trueName = multipartFile.getOriginalFilename();
		companyImgDTO.setCompany_img_true_name(trueName);

		String fileName = UUID.randomUUID().toString();
		companyImgDTO.setCompany_img_false_name(fileName);
		
		String originalFileName = multipartFile.getOriginalFilename();
		String ext = originalFileName.substring(originalFileName.lastIndexOf("."));
		companyImgDTO.setCompany_img_ext(ext);
		
		companyImgDTO.setCompany_img_size(multipartFile.getSize());
		
		companyMapper.insertCompanyImg(companyImgDTO);
		
		File file = new File(path+File.separator+"uploads"+File.separator+"companyImg");
		if(file.exists()) {
				try {
					multipartFile.transferTo(new File(path+File.separator+"uploads"+File.separator+"companyImg"+File.separator+fileName+"."+ext));
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		} else {
			file.mkdirs();
			try {
				multipartFile.transferTo(new File(path+File.separator+"uploads"+File.separator+"companyImg"+File.separator+fileName+"."+ext));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}
	
	public List<CompanyDTO> companyList(){
		List<CompanyDTO> list = companyMapper.companyList();
		return list;
	}
	
	public int companyAuth(CompanyDTO companyDTO) {
		companyMapper.companyAuth(companyDTO);
		return 0;
	}

}
