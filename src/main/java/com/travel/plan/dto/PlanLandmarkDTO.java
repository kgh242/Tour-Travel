package com.travel.plan.dto;

public class PlanLandmarkDTO {
	private int plan2_landmark_no;
	private String plan1_no;
	private String user_id;
	private String plan2_landmark_date;
	private String plan2_landmark_day;
	private String plan2_landmark_address;
	private String plan2_landmark_contents;
	private String landmark_code;
	private int plan2_landmark_price;
	@Override
	public String toString() {
		return "PlanLandmarkDTO [plan2_landmark_no=" + plan2_landmark_no + ", plan1_no=" + plan1_no + ", user_id="
				+ user_id + ", plan2_landmark_date=" + plan2_landmark_date + ", plan2_landmark_day="
				+ plan2_landmark_day + ", plan2_landmark_address=" + plan2_landmark_address
				+ ", plan2_landmark_contents=" + plan2_landmark_contents + ", landmark_code=" + landmark_code
				+ ", plan2_landmark_price=" + plan2_landmark_price + "]";
	}
	public int getPlan2_landmark_no() {
		return plan2_landmark_no;
	}
	public void setPlan2_landmark_no(int plan2_landmark_no) {
		this.plan2_landmark_no = plan2_landmark_no;
	}
	public String getPlan1_no() {
		return plan1_no;
	}
	public void setPlan1_no(String plan1_no) {
		this.plan1_no = plan1_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPlan2_landmark_date() {
		return plan2_landmark_date;
	}
	public void setPlan2_landmark_date(String plan2_landmark_date) {
		this.plan2_landmark_date = plan2_landmark_date;
	}
	public String getPlan2_landmark_day() {
		return plan2_landmark_day;
	}
	public void setPlan2_landmark_day(String plan2_landmark_day) {
		this.plan2_landmark_day = plan2_landmark_day;
	}
	public String getPlan2_landmark_address() {
		return plan2_landmark_address;
	}
	public void setPlan2_landmark_address(String plan2_landmark_address) {
		this.plan2_landmark_address = plan2_landmark_address;
	}
	public String getPlan2_landmark_contents() {
		return plan2_landmark_contents;
	}
	public void setPlan2_landmark_contents(String plan2_landmark_contents) {
		this.plan2_landmark_contents = plan2_landmark_contents;
	}
	public String getLandmark_code() {
		return landmark_code;
	}
	public void setLandmark_code(String landmark_code) {
		this.landmark_code = landmark_code;
	}
	public int getPlan2_landmark_price() {
		return plan2_landmark_price;
	}
	public void setPlan2_landmark_price(int plan2_landmark_price) {
		this.plan2_landmark_price = plan2_landmark_price;
	}
	
	

}
