package com.travel.pack.dto;

//패키지 상품 정보 DTO

public class PackDTO {
	private int pack_info_no;
	private String company_id;
	private String pack_info_title;
	private String pack_info_country;
	private String pack_info_safe;
	private String pack_info_air;
	private String pack_info_start_date;
	private String pack_info_end_date;
	private String pack_info_course;
	private int pack_info_person_number;
	private String pack_info_closing_date;
	private boolean pack_info_sale;
	private String pack_info_apply_date;
	
	public PackDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "PackDTO [pack_info_no=" + pack_info_no + ", company_id=" + company_id + ", pack_info_country="
				+ pack_info_country + ", pack_info_safe=" + pack_info_safe + ", pack_info_air=" + pack_info_air
				+ ", pack_info_start_date=" + pack_info_start_date + ", pack_info_end_date=" + pack_info_end_date
				+ ", pack_info_course=" + pack_info_course + ", pack_info_person_number=" + pack_info_person_number
				+ ", pack_info_closing_date=" + pack_info_closing_date + ", pack_info_sale=" + pack_info_sale
				+ ", pack_info_apply_date=" + pack_info_apply_date + ", pack_info_title=" + pack_info_title + "]";
	}



	public String getPack_info_title() {
		return pack_info_title;
	}
	public void setPack_info_title(String pack_info_title) {
		this.pack_info_title = pack_info_title;
	}
	public int getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(int pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getPack_info_country() {
		return pack_info_country;
	}
	public void setPack_info_country(String pack_info_country) {
		this.pack_info_country = pack_info_country;
	}
	public String getPack_info_safe() {
		return pack_info_safe;
	}
	public void setPack_info_safe(String pack_info_safe) {
		this.pack_info_safe = pack_info_safe;
	}
	public String getPack_info_air() {
		return pack_info_air;
	}
	public void setPack_info_air(String pack_info_air) {
		this.pack_info_air = pack_info_air;
	}
	public String getPack_info_start_date() {
		return pack_info_start_date;
	}
	public void setPack_info_start_date(String pack_info_start_date) {
		this.pack_info_start_date = pack_info_start_date;
	}
	public String getPack_info_end_date() {
		return pack_info_end_date;
	}
	public void setPack_info_end_date(String pack_info_end_date) {
		this.pack_info_end_date = pack_info_end_date;
	}
	public String getPack_info_course() {
		return pack_info_course;
	}
	public void setPack_info_course(String pack_info_course) {
		this.pack_info_course = pack_info_course;
	}
	public int getPack_info_person_number() {
		return pack_info_person_number;
	}
	public void setPack_info_person_number(int pack_info_person_number) {
		this.pack_info_person_number = pack_info_person_number;
	}
	public String getPack_info_closing_date() {
		return pack_info_closing_date;
	}
	public void setPack_info_closing_date(String pack_info_closing_date) {
		this.pack_info_closing_date = pack_info_closing_date;
	}
	public boolean isPack_info_sale() {
		return pack_info_sale;
	}
	public void setPack_info_sale(boolean pack_info_sale) {
		this.pack_info_sale = pack_info_sale;
	}
	public String getPack_info_apply_date() {
		return pack_info_apply_date;
	}
	public void setPack_info_apply_date(String pack_info_apply_date) {
		this.pack_info_apply_date = pack_info_apply_date;
	}
	
}
