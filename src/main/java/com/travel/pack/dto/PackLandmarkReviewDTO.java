package com.travel.pack.dto;

//패키지 관광지 평가 정보 DTO

public class PackLandmarkReviewDTO {
	private String pack_review_landmark_no;
	private String pack_info_no;
	private String pack_landmark_code;
	private String pack_review_landmark_category;
	private String pack_review_landmark_question_no;
	private float pack_review_landmark_score;
	private String pack_review_landmark_contents;
	private String user_id;
	private String pack_review_landmark_date;
	private int pack_review_landmark_point;
	
	@Override
	public String toString() {
		return "PackLandmarkReviewDTO [pack_review_landmark_no=" + pack_review_landmark_no + ", pack_info_no="
				+ pack_info_no + ", pack_landmark_code=" + pack_landmark_code + ", pack_review_landmark_category="
				+ pack_review_landmark_category + ", pack_review_landmark_question_no="
				+ pack_review_landmark_question_no + ", pack_review_landmark_score=" + pack_review_landmark_score
				+ ", pack_review_landmark_contents=" + pack_review_landmark_contents + ", user_id=" + user_id
				+ ", pack_review_landmark_date=" + pack_review_landmark_date + ", pack_review_landmark_point="
				+ pack_review_landmark_point + "]";
	}
	public PackLandmarkReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_landmark_no() {
		return pack_review_landmark_no;
	}
	public void setPack_review_landmark_no(String pack_review_landmark_no) {
		this.pack_review_landmark_no = pack_review_landmark_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_landmark_code() {
		return pack_landmark_code;
	}
	public void setPack_landmark_code(String pack_landmark_code) {
		this.pack_landmark_code = pack_landmark_code;
	}
	public String getPack_review_landmark_category() {
		return pack_review_landmark_category;
	}
	public void setPack_review_landmark_category(String pack_review_landmark_category) {
		this.pack_review_landmark_category = pack_review_landmark_category;
	}
	public String getPack_review_landmark_question_no() {
		return pack_review_landmark_question_no;
	}
	public void setPack_review_landmark_question_no(String pack_review_landmark_question_no) {
		this.pack_review_landmark_question_no = pack_review_landmark_question_no;
	}
	public float getPack_review_landmark_score() {
		return pack_review_landmark_score;
	}
	public void setPack_review_landmark_score(float pack_review_landmark_score) {
		this.pack_review_landmark_score = pack_review_landmark_score;
	}
	public String getPack_review_landmark_contents() {
		return pack_review_landmark_contents;
	}
	public void setPack_review_landmark_contents(String pack_review_landmark_contents) {
		this.pack_review_landmark_contents = pack_review_landmark_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPack_review_landmark_date() {
		return pack_review_landmark_date;
	}
	public void setPack_review_landmark_date(String pack_review_landmark_date) {
		this.pack_review_landmark_date = pack_review_landmark_date;
	}
	public int getPack_review_landmark_point() {
		return pack_review_landmark_point;
	}
	public void setPack_review_landmark_point(int pack_review_landmark_point) {
		this.pack_review_landmark_point = pack_review_landmark_point;
	}
	
}
