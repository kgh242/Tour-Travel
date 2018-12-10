package com.travel.pack.dto;

//패키지 가이드 평가 정보 DTO

public class PackGuideReviewDTO {
	private String pack_review_guide_no;
	private String pack_info_no;
	private String pack_review_guide_category;
	private String pack_review_guide_question_no;
	private float pack_review_guide_score;
	private String pack_review_guide_contents;
	private String user_id;
	private String pack_review_guide_date;
	private int pack_review_guide_point;
	
	
	@Override
	public String toString() {
		return "PackGuideReviewDTO [pack_review_guide_no=" + pack_review_guide_no + ", pack_info_no=" + pack_info_no
				+ ", pack_review_guide_category=" + pack_review_guide_category + ", pack_review_guide_question_no="
				+ pack_review_guide_question_no + ", pack_review_guide_score=" + pack_review_guide_score
				+ ", pack_review_guide_contents=" + pack_review_guide_contents + ", user_id=" + user_id
				+ ", pack_review_guide_date=" + pack_review_guide_date + ", pack_review_guide_point="
				+ pack_review_guide_point + "]";
	}
	public PackGuideReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_guide_no() {
		return pack_review_guide_no;
	}
	public void setPack_review_guide_no(String pack_review_guide_no) {
		this.pack_review_guide_no = pack_review_guide_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_review_guide_category() {
		return pack_review_guide_category;
	}
	public void setPack_review_guide_category(String pack_review_guide_category) {
		this.pack_review_guide_category = pack_review_guide_category;
	}
	public String getPack_review_guide_question_no() {
		return pack_review_guide_question_no;
	}
	public void setPack_review_guide_question_no(String pack_review_guide_question_no) {
		this.pack_review_guide_question_no = pack_review_guide_question_no;
	}
	public float getPack_review_guide_score() {
		return pack_review_guide_score;
	}
	public void setPack_review_guide_score(float pack_review_guide_score) {
		this.pack_review_guide_score = pack_review_guide_score;
	}
	public String getPack_review_guide_contents() {
		return pack_review_guide_contents;
	}
	public void setPack_review_guide_contents(String pack_review_guide_contents) {
		this.pack_review_guide_contents = pack_review_guide_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPack_review_guide_date() {
		return pack_review_guide_date;
	}
	public void setPack_review_guide_date(String pack_review_guide_date) {
		this.pack_review_guide_date = pack_review_guide_date;
	}
	public int getPack_review_guide_point() {
		return pack_review_guide_point;
	}
	public void setPack_review_guide_point(int pack_review_guide_point) {
		this.pack_review_guide_point = pack_review_guide_point;
	}
	
	
}
