package com.travel.pack.dto;

import java.util.ArrayList;

public class PackLandmarkDTO {
	private ArrayList<Integer> pack_info_no;
	private ArrayList<String> company_id;
	private ArrayList<String> pack_landmark_code;
	private ArrayList<String> pack_tour_date;
	private ArrayList<String> pack_tour_contents;
	@Override
	public String toString() {
		return "PackLandmarkDTO [pack_info_no=" + pack_info_no + ", company_id=" + company_id + ", pack_landmark_code="
				+ pack_landmark_code + ", pack_tour_date=" + pack_tour_date + ", pack_tour_contents="
				+ pack_tour_contents + "]";
	}
	public ArrayList<Integer> getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(ArrayList<Integer> pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public ArrayList<String> getCompany_id() {
		return company_id;
	}
	public void setCompany_id(ArrayList<String> company_id) {
		this.company_id = company_id;
	}
	public ArrayList<String> getPack_landmark_code() {
		return pack_landmark_code;
	}
	public void setPack_landmark_code(ArrayList<String> pack_landmark_code) {
		this.pack_landmark_code = pack_landmark_code;
	}
	public ArrayList<String> getPack_tour_date() {
		return pack_tour_date;
	}
	public void setPack_tour_date(ArrayList<String> pack_tour_date) {
		this.pack_tour_date = pack_tour_date;
	}
	public ArrayList<String> getPack_tour_contents() {
		return pack_tour_contents;
	}
	public void setPack_tour_contents(ArrayList<String> pack_tour_contents) {
		this.pack_tour_contents = pack_tour_contents;
	}
	
}
