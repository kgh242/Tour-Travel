package com.travel.pack.dto;

//패키지 교통 평가 정보 DTO

public class PackTrafficReviewDTO {
	private String pack_review_traffic_no;
	private String pack_info_no;
	private String pack_review_traffic_name;
	private String pack_review_traffic_category;
	private String pack_review_traffic_question_no;
	private float pack_review_traffic_score;
	private String pack_review_traffic_contents;
	private String user_id;
	private String pack_review_traffic_date;
	private int pack_review_traffic_point;
	
	@Override
	public String toString() {
		return "PackTrafficReviewDTO [pack_review_traffic_no=" + pack_review_traffic_no + ", pack_info_no="
				+ pack_info_no + ", pack_review_traffic_name=" + pack_review_traffic_name
				+ ", pack_review_traffic_category=" + pack_review_traffic_category
				+ ", pack_review_traffic_question_no=" + pack_review_traffic_question_no
				+ ", pack_review_traffic_score=" + pack_review_traffic_score + ", pack_review_traffic_contents="
				+ pack_review_traffic_contents + ", user_id=" + user_id + ", pack_review_traffic_date="
				+ pack_review_traffic_date + ", pack_review_traffic_point=" + pack_review_traffic_point + "]";
	}
	public PackTrafficReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_traffic_no() {
		return pack_review_traffic_no;
	}
	public void setPack_review_traffic_no(String pack_review_traffic_no) {
		this.pack_review_traffic_no = pack_review_traffic_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_review_traffic_name() {
		return pack_review_traffic_name;
	}
	public void setPack_review_traffic_name(String pack_review_traffic_name) {
		this.pack_review_traffic_name = pack_review_traffic_name;
	}
	public String getPack_review_traffic_category() {
		return pack_review_traffic_category;
	}
	public void setPack_review_traffic_category(String pack_review_traffic_category) {
		this.pack_review_traffic_category = pack_review_traffic_category;
	}
	public String getPack_review_traffic_question_no() {
		return pack_review_traffic_question_no;
	}
	public void setPack_review_traffic_question_no(String pack_review_traffic_question_no) {
		this.pack_review_traffic_question_no = pack_review_traffic_question_no;
	}
	public float getPack_review_traffic_score() {
		return pack_review_traffic_score;
	}
	public void setPack_review_traffic_score(float pack_review_traffic_score) {
		this.pack_review_traffic_score = pack_review_traffic_score;
	}
	public String getPack_review_traffic_contents() {
		return pack_review_traffic_contents;
	}
	public void setPack_review_traffic_contents(String pack_review_traffic_contents) {
		this.pack_review_traffic_contents = pack_review_traffic_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPack_review_traffic_date() {
		return pack_review_traffic_date;
	}
	public void setPack_review_traffic_date(String pack_review_traffic_date) {
		this.pack_review_traffic_date = pack_review_traffic_date;
	}
	public int getPack_review_traffic_point() {
		return pack_review_traffic_point;
	}
	public void setPack_review_traffic_point(int pack_review_traffic_point) {
		this.pack_review_traffic_point = pack_review_traffic_point;
	}
	
}
