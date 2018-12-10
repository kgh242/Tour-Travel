package com.travel.pack.dto;

//패키지 호텔 평가 정보 DTO

public class PackHotelReviewDTO {
	private String pack_review_hotel_no;
	private String pack_info_no;
	private String pack_hotel_code;
	private String pack_review_hotel_question_no;
	private String pack_review_hotel_question;
	private float pack_review_hotel_score;
	private String pack_review_hotel_contents;
	private String user_id;
	private String pack_review_hotel_date;
	private int pack_review_hotel_point;
	
	@Override
	public String toString() {
		return "PackHotelReviewDTO [pack_review_hotel_no=" + pack_review_hotel_no + ", pack_info_no=" + pack_info_no
				+ ", pack_hotel_code=" + pack_hotel_code + ", pack_review_hotel_question_no="
				+ pack_review_hotel_question_no + ", pack_review_hotel_question=" + pack_review_hotel_question
				+ ", pack_review_hotel_score=" + pack_review_hotel_score + ", pack_review_hotel_contents="
				+ pack_review_hotel_contents + ", user_id=" + user_id + ", pack_review_hotel_date="
				+ pack_review_hotel_date + ", pack_review_hotel_point=" + pack_review_hotel_point + "]";
	}
	public PackHotelReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_hotel_no() {
		return pack_review_hotel_no;
	}
	public void setPack_review_hotel_no(String pack_review_hotel_no) {
		this.pack_review_hotel_no = pack_review_hotel_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_hotel_code() {
		return pack_hotel_code;
	}
	public void setPack_hotel_code(String pack_hotel_code) {
		this.pack_hotel_code = pack_hotel_code;
	}
	public String getPack_review_hotel_question_no() {
		return pack_review_hotel_question_no;
	}
	public void setPack_review_hotel_question_no(String pack_review_hotel_question_no) {
		this.pack_review_hotel_question_no = pack_review_hotel_question_no;
	}
	public String getPack_review_hotel_question() {
		return pack_review_hotel_question;
	}
	public void setPack_review_hotel_question(String pack_review_hotel_question) {
		this.pack_review_hotel_question = pack_review_hotel_question;
	}
	public float getPack_review_hotel_score() {
		return pack_review_hotel_score;
	}
	public void setPack_review_hotel_score(float pack_review_hotel_score) {
		this.pack_review_hotel_score = pack_review_hotel_score;
	}
	public String getPack_review_hotel_contents() {
		return pack_review_hotel_contents;
	}
	public void setPack_review_hotel_contents(String pack_review_hotel_contents) {
		this.pack_review_hotel_contents = pack_review_hotel_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPack_review_hotel_date() {
		return pack_review_hotel_date;
	}
	public void setPack_review_hotel_date(String pack_review_hotel_date) {
		this.pack_review_hotel_date = pack_review_hotel_date;
	}
	public int getPack_review_hotel_point() {
		return pack_review_hotel_point;
	}
	public void setPack_review_hotel_point(int pack_review_hotel_point) {
		this.pack_review_hotel_point = pack_review_hotel_point;
	}
	
}
