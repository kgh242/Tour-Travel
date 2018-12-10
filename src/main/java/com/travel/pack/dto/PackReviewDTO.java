package com.travel.pack.dto;

//패키지 종합 평가 정보 DTO

public class PackReviewDTO {
	private String pack_review_no;
	private String pack_info_no;
	private String user_id;
	private float pack_review_landmark;
	private float pack_review_traffic;
	private float pack_review_hotel;
	private float pack_review_food;
	private float pack_review_guide;
	private float pack_review_info;
	
	
	@Override
	public String toString() {
		return "PackReviewDTO [pack_review_no=" + pack_review_no + ", pack_info_no=" + pack_info_no + ", user_id="
				+ user_id + ", pack_review_landmark=" + pack_review_landmark + ", pack_review_traffic="
				+ pack_review_traffic + ", pack_review_hotel=" + pack_review_hotel + ", pack_review_food="
				+ pack_review_food + ", pack_review_guide=" + pack_review_guide + ", pack_review_info="
				+ pack_review_info + "]";
	}
	public PackReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_no() {
		return pack_review_no;
	}
	public void setPack_review_no(String pack_review_no) {
		this.pack_review_no = pack_review_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public float getPack_review_landmark() {
		return pack_review_landmark;
	}
	public void setPack_review_landmark(float pack_review_landmark) {
		this.pack_review_landmark = pack_review_landmark;
	}
	public float getPack_review_traffic() {
		return pack_review_traffic;
	}
	public void setPack_review_traffic(float pack_review_traffic) {
		this.pack_review_traffic = pack_review_traffic;
	}
	public float getPack_review_hotel() {
		return pack_review_hotel;
	}
	public void setPack_review_hotel(float pack_review_hotel) {
		this.pack_review_hotel = pack_review_hotel;
	}
	public float getPack_review_food() {
		return pack_review_food;
	}
	public void setPack_review_food(float pack_review_food) {
		this.pack_review_food = pack_review_food;
	}
	public float getPack_review_guide() {
		return pack_review_guide;
	}
	public void setPack_review_guide(float pack_review_guide) {
		this.pack_review_guide = pack_review_guide;
	}
	public float getPack_review_info() {
		return pack_review_info;
	}
	public void setPack_review_info(float pack_review_info) {
		this.pack_review_info = pack_review_info;
	}
	
}
