package com.travel.pack.dto;

public class PackLandmarkDTO {
	private int pack_info_no;
	private String company_id;
	private String pack_landmark_code;
	private String pack_tour_date;
	private String pack_tour_contents;
	@Override
	public String toString() {
		return "PackLandmarkDTO [pack_info_no=" + pack_info_no + ", company_id=" + company_id + ", pack_landmark_code="
				+ pack_landmark_code + ", pack_tour_date=" + pack_tour_date + ", pack_tour_contents="
				+ pack_tour_contents + "]";
	}
	public int getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(int pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_landmark_code() {
		return pack_landmark_code;
	}
	public void setPack_landmark_code(String pack_landmark_code) {
		this.pack_landmark_code = pack_landmark_code;
	}
	public String getPack_tour_date() {
		return pack_tour_date;
	}
	public void setPack_tour_date(String pack_tour_date) {
		this.pack_tour_date = pack_tour_date;
	}
	public String getPack_tour_contents() {
		return pack_tour_contents;
	}
	public void setPack_tour_contents(String pack_tour_contents) {
		this.pack_tour_contents = pack_tour_contents;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	
	
}
