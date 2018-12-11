package com.travel.member.company.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.travel.member.company.dto.CompanyDTO;
import com.travel.member.company.dto.CompanyImgDTO;


@Mapper
public interface CompanyMapper {
	int insertCompany(CompanyDTO companyDTO);
	int insertCompanyImg(CompanyImgDTO companyImgDTO);
	CompanyDTO selectCompanyImgName(String company_id);
}
