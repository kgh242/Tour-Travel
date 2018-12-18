package com.travel.pack.dto;

import java.util.ArrayList;

public class PackHotelDTO {
	private ArrayList<String> pack_hotel_no;
	private ArrayList<Integer> pack_info_no;
	private ArrayList<String> pack_hotel_start_date;
	private ArrayList<String> pack_hotel_end_date;
	private ArrayList<String> pack_hotel_day;
	private ArrayList<String> hotel_code;
	private ArrayList<String> hotel_name;
	
	

	
	public ArrayList<String> getPack_hotel_no() {
		return pack_hotel_no;
	}




	public void setPack_hotel_no(ArrayList<String> pack_hotel_no) {
		this.pack_hotel_no = pack_hotel_no;
	}




	public ArrayList<String> getPack_hotel_start_date() {
		return pack_hotel_start_date;
	}




	public void setPack_hotel_start_date(ArrayList<String> pack_hotel_start_date) {
		this.pack_hotel_start_date = pack_hotel_start_date;
	}




	public ArrayList<String> getPack_hotel_end_date() {
		return pack_hotel_end_date;
	}




	public void setPack_hotel_end_date(ArrayList<String> pack_hotel_end_date) {
		this.pack_hotel_end_date = pack_hotel_end_date;
	}


	


	public ArrayList<Integer> getPack_info_no() {
		return pack_info_no;
	}




	public void setPack_info_no(ArrayList<Integer> pack_info_no) {
		this.pack_info_no = pack_info_no;
	}




	public ArrayList<String> getPack_hotel_day() {
		return pack_hotel_day;
	}




	public void setPack_hotel_day(ArrayList<String> pack_hotel_day) {
		this.pack_hotel_day = pack_hotel_day;
	}




	public ArrayList<String> getHotel_code() {
		return hotel_code;
	}




	public void setHotel_code(ArrayList<String> hotel_code) {
		this.hotel_code = hotel_code;
	}




	public ArrayList<String> getHotel_name() {
		return hotel_name;
	}




	public void setHotel_name(ArrayList<String> hotel_name) {
		this.hotel_name = hotel_name;
	}




	@Override
	public String toString() {
		return "PackHotelDTO [pack_hotel_no=" + pack_hotel_no + ", pack_info_no=" + pack_info_no
				+ ", pack_hotel_start_date=" + pack_hotel_start_date + ", pack_hotel_end_date=" + pack_hotel_end_date
				+ ", pack_hotel_day=" + pack_hotel_day + ", hotel_code=" + hotel_code + ", hotel_name=" + hotel_name
				+ "]";
	}

	


	

	
	
}
