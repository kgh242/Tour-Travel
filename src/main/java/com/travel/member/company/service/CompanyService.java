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
import com.travel.paging.PageMaker;

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

		String originalFileName = multipartFile.getOriginalFilename();
		String trueName = originalFileName.substring(0, originalFileName.lastIndexOf('.'));
		companyImgDTO.setCompany_img_true_name(trueName);

		String fileName = UUID.randomUUID().toString();
		companyImgDTO.setCompany_img_false_name(fileName);

		String ext = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
		companyImgDTO.setCompany_img_ext(ext);

		companyImgDTO.setCompany_img_size(multipartFile.getSize());

		companyMapper.insertCompanyImg(companyImgDTO);

		File file = new File(path + File.separator +"src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" +File.separator +"companyImg");
		if (file.exists()) {
			try {
				multipartFile.transferTo(new File(path + File.separator +"src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" +File.separator + "companyImg" + File.separator + fileName + "." + ext));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			file.mkdirs();
			try {
				multipartFile.transferTo(new File(path + File.separator +"src" +File.separator + "main" +File.separator + "resources" + File.separator + "static" +File.separator + "companyImg" + File.separator + fileName + "." + ext));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}

	public List<CompanyDTO> companyList(PageMaker pageMaker) {
		pageMaker.setRowPerPage(10);
		pageMaker.setPagePerBlock(10);
		pageMaker.setAllCount(companyMapper.companyListCount());
		pageMaker.setStartRow();
		pageMaker.setLastPage();
		pageMaker.setCurrentBlock();
		pageMaker.setLastBlock();
		pageMaker.setStartPage();
		pageMaker.setEndPage();
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
		return companyMapper.companyList(pageMaker);
	}
	
	public int companyListCount() {
		return companyMapper.companyListCount();
	}

	public CompanyDTO companyAuthInfo(String company_id) {
		return companyMapper.companyAuthInfo(company_id);
	}

	public int companyAuth(CompanyDTO companyDTO) {
		return companyMapper.companyAuth(companyDTO);
	}

	public int companyLogin(CompanyDTO companyDTO) {
		return companyMapper.companyLogin(companyDTO);
	}
	
	public boolean companyLoginCheck(CompanyDTO companyDTO) {
		return companyMapper.companyLoginCheck(companyDTO);
	}
	
	public CompanyDTO companyInfo(String company_id) {
		return companyMapper.companyInfo(company_id);
	}
}
