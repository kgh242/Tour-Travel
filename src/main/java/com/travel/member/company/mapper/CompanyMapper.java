package com.travel.member.company.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.company.dto.CompanyDTO;
import com.travel.member.company.dto.CompanyImgDTO;
import com.travel.paging.PageMaker;



@Mapper
public interface CompanyMapper {
	int insertCompany(CompanyDTO companyDTO);
	int insertCompanyImg(CompanyImgDTO companyImgDTO);
	List<CompanyDTO> companyList(PageMaker pageMaker);
	CompanyDTO companyAuthInfo(String company_id);
	int companyAuth(CompanyDTO companyDTO);
	int companyLogin(CompanyDTO companyDTO);
	boolean companyLoginCheck(CompanyDTO companyDTO);
	int companyListCount();
	CompanyDTO companyInfo(String company_id);
	int companyUpdate(CompanyDTO companyDTO);
}
