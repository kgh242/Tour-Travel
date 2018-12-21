package com.travel.pack.dto;

public class PackScheduleDTO {
	private int pack_info_no;
	private String company_id;
	private String pack_schedule_date;
	private String pack_schedule_contents;
	
	@Override
	public String toString() {
		return "PackScheduleDTO [pack_info_no=" + pack_info_no + ", company_id=" + company_id + ", pack_schedule_date="
				+ pack_schedule_date + ", pack_schedule_contents=" + pack_schedule_contents + "]";
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

	public String getPack_schedule_date() {
		return pack_schedule_date;
	}

	public void setPack_schedule_date(String pack_schedule_date) {
		this.pack_schedule_date = pack_schedule_date;
	}

	public String getPack_schedule_contents() {
		return pack_schedule_contents;
	}

	public void setPack_schedule_contents(String pack_schedule_contents) {
		this.pack_schedule_contents = pack_schedule_contents;
	}

}
