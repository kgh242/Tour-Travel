package com.travel.pack.dto;

import java.util.ArrayList;

public class PackScheduleDTO {
	private ArrayList<Integer> pack_info_no;
	private ArrayList<String> company_id;
	private ArrayList<String> pack_schedule_date;
	private ArrayList<String> pack_schedule_contents;
	
	@Override
	public String toString() {
		return "PackScheduleDTO [pack_info_no=" + pack_info_no + ", company_id=" + company_id + ", pack_schedule_date="
				+ pack_schedule_date + ", pack_schedule_contents=" + pack_schedule_contents + "]";
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

	public ArrayList<String> getPack_schedule_date() {
		return pack_schedule_date;
	}

	public void setPack_schedule_date(ArrayList<String> pack_schedule_date) {
		this.pack_schedule_date = pack_schedule_date;
	}

	public ArrayList<String> getPack_schedule_contents() {
		return pack_schedule_contents;
	}

	public void setPack_schedule_contents(ArrayList<String> pack_schedule_contents) {
		this.pack_schedule_contents = pack_schedule_contents;
	}

	

}
