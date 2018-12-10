package com.travel.pack.dto;

//패키지 항공 평가 정보 DTO

public class PackAirReviewDTO {
	private String pack_review_air_no;
	private String pack_info_no;
	private String pack_review_air_name;
	private String pack_review_air_category;
	private String pack_review_air_question_no;
	private float pack_review_air_score;
	private String pack_review_air_contents;
	private String pack_review_air_date;
	private String user_id;
	private int pack_review_air_point;
	
	
	@Override
	public String toString() {
		return "PackAirReviewDTO [pack_review_air_no=" + pack_review_air_no + ", pack_info_no=" + pack_info_no
				+ ", pack_review_air_name=" + pack_review_air_name + ", pack_review_air_category="
				+ pack_review_air_category + ", pack_review_air_question_no=" + pack_review_air_question_no
				+ ", pack_review_air_score=" + pack_review_air_score + ", pack_review_air_contents="
				+ pack_review_air_contents + ", pack_review_air_date=" + pack_review_air_date + ", user_id=" + user_id
				+ ", pack_review_air_point=" + pack_review_air_point + "]";
	}
	public PackAirReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_air_no() {
		return pack_review_air_no;
	}
	public void setPack_review_air_no(String pack_review_air_no) {
		this.pack_review_air_no = pack_review_air_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_review_air_name() {
		return pack_review_air_name;
	}
	public void setPack_review_air_name(String pack_review_air_name) {
		this.pack_review_air_name = pack_review_air_name;
	}
	public String getPack_review_air_category() {
		return pack_review_air_category;
	}
	public void setPack_review_air_category(String pack_review_air_category) {
		this.pack_review_air_category = pack_review_air_category;
	}
	public String getPack_review_air_question_no() {
		return pack_review_air_question_no;
	}
	public void setPack_review_air_question_no(String pack_review_air_question_no) {
		this.pack_review_air_question_no = pack_review_air_question_no;
	}
	public float getPack_review_air_score() {
		return pack_review_air_score;
	}
	public void setPack_review_air_score(float pack_review_air_score) {
		this.pack_review_air_score = pack_review_air_score;
	}
	public String getPack_review_air_contents() {
		return pack_review_air_contents;
	}
	public void setPack_review_air_contents(String pack_review_air_contents) {
		this.pack_review_air_contents = pack_review_air_contents;
	}
	public String getPack_review_air_date() {
		return pack_review_air_date;
	}
	public void setPack_review_air_date(String pack_review_air_date) {
		this.pack_review_air_date = pack_review_air_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getPack_review_air_point() {
		return pack_review_air_point;
	}
	public void setPack_review_air_point(int pack_review_air_point) {
		this.pack_review_air_point = pack_review_air_point;
	}
	
	
	
}
