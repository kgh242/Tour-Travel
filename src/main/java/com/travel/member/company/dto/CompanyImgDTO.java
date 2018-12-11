package com.travel.member.company.dto;

import org.springframework.web.multipart.MultipartFile;

public class CompanyImgDTO {
	private String company_img_no;
	private String company_id;
	private String company_img_path;
	private String company_img_true_name;
	private String company_img_false_name;
	private String company_img_ext;
	private long company_img_size;
	private String company_img_date;
	private MultipartFile company_img;
	
	@Override
	public String toString() {
		return "CompanyImgDTO [company_img_no=" + company_img_no + ", company_id=" + company_id + ", company_img_path="
				+ company_img_path + ", company_img_true_name=" + company_img_true_name + ", company_img_false_name="
				+ company_img_false_name + ", company_img_ext=" + company_img_ext + ", company_img_size="
				+ company_img_size + ", company_img_date=" + company_img_date + "]";
	}
	public CompanyImgDTO() {
		super();
	}
	public String getCompany_img_no() {
		return company_img_no;
	}
	public void setCompany_img_no(String company_img_no) {
		this.company_img_no = company_img_no;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getCompany_img_path() {
		return company_img_path;
	}
	public void setCompany_img_path(String company_img_path) {
		this.company_img_path = company_img_path;
	}
	public String getCompany_img_true_name() {
		return company_img_true_name;
	}
	public void setCompany_img_true_name(String company_img_true_name) {
		this.company_img_true_name = company_img_true_name;
	}
	public String getCompany_img_false_name() {
		return company_img_false_name;
	}
	public void setCompany_img_false_name(String company_img_false_name) {
		this.company_img_false_name = company_img_false_name;
	}
	public String getCompany_img_ext() {
		return company_img_ext;
	}
	public void setCompany_img_ext(String company_img_ext) {
		this.company_img_ext = company_img_ext;
	}
	public long getCompany_img_size() {
		return company_img_size;
	}
	public void setCompany_img_size(long company_img_size) {
		this.company_img_size = company_img_size;
	}
	public String getCompany_img_date() {
		return company_img_date;
	}
	public void setCompany_img_date(String company_img_date) {
		this.company_img_date = company_img_date;
	}
	public MultipartFile getCompany_img() {
		return company_img;
	}
	public void setCompany_img(MultipartFile company_img) {
		this.company_img = company_img;
	}
	
}
