package com.travel.member.company.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.company.dto.CompanyDTO;
import com.travel.member.company.dto.CompanyImgDTO;


@Mapper
public interface CompanyMapper {
	int insertCompany(CompanyDTO companyDTO);
	int insertCompanyImg(CompanyImgDTO companyImgDTO);
	List<CompanyDTO> companyList();
	int companyAuth(CompanyDTO companyDTO);
}
