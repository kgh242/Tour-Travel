package com.travel.pack.dto;

public class PackHotelDTO {
	private String pack_hotel_no;
	private int pack_info_no;
	private String pack_hotel_start_date;
	private String pack_hotel_end_date;
	private String pack_hotel_day;
	private String hotel_code;
	private String pack_hotel_name;
	

	@Override
	public String toString() {
		return "PackHotelDTO [pack_hotel_no=" + pack_hotel_no + ", pack_info_no=" + pack_info_no
				+ ", pack_hotel_start_date=" + pack_hotel_start_date + ", pack_hotel_end_date=" + pack_hotel_end_date
				+ ", pack_hotel_day=" + pack_hotel_day + ", hotel_code=" + hotel_code + ", pack_hotel_name="
				+ pack_hotel_name + "]";
	}

	public String getPack_hotel_name() {
		return pack_hotel_name;
	}

	public void setPack_hotel_name(String pack_hotel_name) {
		this.pack_hotel_name = pack_hotel_name;
	}

	public String getPack_hotel_no() {
		return pack_hotel_no;
	}

	public void setPack_hotel_no(String pack_hotel_no) {
		this.pack_hotel_no = pack_hotel_no;
	}

	public int getPack_info_no() {
		return pack_info_no;
	}

	public void setPack_info_no(int pack_info_no) {
		this.pack_info_no = pack_info_no;
	}

	public String getPack_hotel_start_date() {
		return pack_hotel_start_date;
	}

	public void setPack_hotel_start_date(String pack_hotel_start_date) {
		this.pack_hotel_start_date = pack_hotel_start_date;
	}

	public String getPack_hotel_end_date() {
		return pack_hotel_end_date;
	}

	public void setPack_hotel_end_date(String pack_hotel_end_date) {
		this.pack_hotel_end_date = pack_hotel_end_date;
	}

	public String getPack_hotel_day() {
		return pack_hotel_day;
	}

	public void setPack_hotel_day(String pack_hotel_day) {
		this.pack_hotel_day = pack_hotel_day;
	}

	public String getHotel_code() {
		return hotel_code;
	}

	public void setHotel_code(String hotel_code) {
		this.hotel_code = hotel_code;
	}



}
