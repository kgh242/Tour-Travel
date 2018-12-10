package com.travel.pack.dto;

//패키지 사전제공 정보 평가 정보 DTO

public class PackInfoReviewDTO {
	private String pack_review_info_no;
	private String pack_info_no;
	private String pack_review_info_category;
	private String pack_review_info_question_no;
	private float pack_review_info_score;
	private String pack_review_info_contents;
	private String user_id;
	private String pack_review_info_date;
	private int pack_review_info_point;
	
	@Override
	public String toString() {
		return "PackInfoReviewDTO [pack_review_info_no=" + pack_review_info_no + ", pack_info_no=" + pack_info_no
				+ ", pack_review_info_category=" + pack_review_info_category + ", pack_review_info_question_no="
				+ pack_review_info_question_no + ", pack_review_info_score=" + pack_review_info_score
				+ ", pack_review_info_contents=" + pack_review_info_contents + ", user_id=" + user_id
				+ ", pack_review_info_date=" + pack_review_info_date + ", pack_review_info_point="
				+ pack_review_info_point + "]";
	}
	public PackInfoReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_info_no() {
		return pack_review_info_no;
	}
	public void setPack_review_info_no(String pack_review_info_no) {
		this.pack_review_info_no = pack_review_info_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_review_info_category() {
		return pack_review_info_category;
	}
	public void setPack_review_info_category(String pack_review_info_category) {
		this.pack_review_info_category = pack_review_info_category;
	}
	public String getPack_review_info_question_no() {
		return pack_review_info_question_no;
	}
	public void setPack_review_info_question_no(String pack_review_info_question_no) {
		this.pack_review_info_question_no = pack_review_info_question_no;
	}
	public float getPack_review_info_score() {
		return pack_review_info_score;
	}
	public void setPack_review_info_score(float pack_review_info_score) {
		this.pack_review_info_score = pack_review_info_score;
	}
	public String getPack_review_info_contents() {
		return pack_review_info_contents;
	}
	public void setPack_review_info_contents(String pack_review_info_contents) {
		this.pack_review_info_contents = pack_review_info_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPack_review_info_date() {
		return pack_review_info_date;
	}
	public void setPack_review_info_date(String pack_review_info_date) {
		this.pack_review_info_date = pack_review_info_date;
	}
	public int getPack_review_info_point() {
		return pack_review_info_point;
	}
	public void setPack_review_info_point(int pack_review_info_point) {
		this.pack_review_info_point = pack_review_info_point;
	}
	
}
