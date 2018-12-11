package com.travel.member.company.dto;

//여행사 정보 DTO

public class CompanyDTO {
	private String company_no;
	private String company_id;
	private String company_pw;
	private String company_name;
	private String company_tell1;
	private String company_tell2;
	private String company_address;
	private String company_business_no;
	private String company_branch_tell;
	private String company_head_tell;
	private boolean company_auth;
	private String company_check_tell;
	private String company_check_business_no;
	private String company_check_ceo;
	private String company_check_address;
	private String admin_id;
	private String company_check_date;
	private String company_auth_date;
	private CompanyImgDTO companyImgDTO;
	
	@Override
	public String toString() {
		return "CompanyDTO [company_no=" + company_no + ", company_id=" + company_id + ", company_pw=" + company_pw
				+ ", company_name=" + company_name + ", company_tell1=" + company_tell1 + ", company_tell2="
				+ company_tell2 + ", company_address=" + company_address + ", company_business_no="
				+ company_business_no + ", company_branch_tell=" + company_branch_tell + ", company_head_tell="
				+ company_head_tell + ", company_auth=" + company_auth + ", company_check_tell=" + company_check_tell
				+ ", company_check_business_no=" + company_check_business_no + ", company_check_ceo="
				+ company_check_ceo + ", company_check_address=" + company_check_address + ", admin_id=" + admin_id
				+ ", company_check_date=" + company_check_date + ", company_auth_date=" + company_auth_date + "]";
	}
	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompany_no() {
		return company_no;
	}
	public void setCompany_no(String company_no) {
		this.company_no = company_no;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getCompany_pw() {
		return company_pw;
	}
	public void setCompany_pw(String company_pw) {
		this.company_pw = company_pw;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_tell1() {
		return company_tell1;
	}
	public void setCompany_tell1(String company_tell1) {
		this.company_tell1 = company_tell1;
	}
	public String getCompany_tell2() {
		return company_tell2;
	}
	public void setCompany_tell2(String company_tell2) {
		this.company_tell2 = company_tell2;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getCompany_business_no() {
		return company_business_no;
	}
	public void setCompany_business_no(String company_business_no) {
		this.company_business_no = company_business_no;
	}
	public String getCompany_branch_tell() {
		return company_branch_tell;
	}
	public void setCompany_branch_tell(String company_branch_tell) {
		this.company_branch_tell = company_branch_tell;
	}
	public String getCompany_head_tell() {
		return company_head_tell;
	}
	public void setCompany_head_tell(String company_head_tell) {
		this.company_head_tell = company_head_tell;
	}
	public boolean isCompany_auth() {
		return company_auth;
	}
	public void setCompany_auth(boolean company_auth) {
		this.company_auth = company_auth;
	}
	public String getCompany_check_tell() {
		return company_check_tell;
	}
	public void setCompany_check_tell(String company_check_tell) {
		this.company_check_tell = company_check_tell;
	}
	public String getCompany_check_business_no() {
		return company_check_business_no;
	}
	public void setCompany_check_business_no(String company_check_business_no) {
		this.company_check_business_no = company_check_business_no;
	}
	public String getCompany_check_ceo() {
		return company_check_ceo;
	}
	public void setCompany_check_ceo(String company_check_ceo) {
		this.company_check_ceo = company_check_ceo;
	}
	public String getCompany_check_address() {
		return company_check_address;
	}
	public void setCompany_check_address(String company_check_address) {
		this.company_check_address = company_check_address;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getCompany_check_date() {
		return company_check_date;
	}
	public void setCompany_check_date(String company_check_date) {
		this.company_check_date = company_check_date;
	}
	public String getCompany_auth_date() {
		return company_auth_date;
	}
	public void setCompany_auth_date(String company_auth_date) {
		this.company_auth_date = company_auth_date;
	}
	public CompanyImgDTO getCompanyImgDTO() {
		return companyImgDTO;
	}
	public void setCompanyImgDTO(CompanyImgDTO companyImgDTO) {
		this.companyImgDTO = companyImgDTO;
	}
	

}
