package com.travel.pack.dto;

public class PackSearchDTO {
	String packSearchCountry;
	String PackStartDate;


	public PackSearchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PackSearchDTO [packSearchCountry=" + packSearchCountry + ", PackStartDate=" + PackStartDate + "]";
	}
	
	public String getPackSearchCountry() {
		return packSearchCountry;
	}
	public void setPackSearchCountry(String packSearchCountry) {
		this.packSearchCountry = packSearchCountry;
	}
	public String getPackStartDate() {
		return PackStartDate;
	}
	public void setPackStartDate(String packStartDate) {
		PackStartDate = packStartDate;
	}

}
