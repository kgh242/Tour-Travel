package com.travel.pack.dto;

//패키지 가격 평가 정보 DTO

public class PackPriceReviewDTO {
	private String pack_review_price_no;
	private String pack_info_no;
	private String pack_review_price_category;
	private String pack_review_price_question_no;
	private float pack_review_price_score;
	private String pack_review_price_contents;
	private String user_id;
	private String pack_review_price_date;
	private int pack_review_price_point;
	
	
	@Override
	public String toString() {
		return "PackPriceReviewDTO [pack_review_price_no=" + pack_review_price_no + ", pack_info_no=" + pack_info_no
				+ ", pack_review_price_category=" + pack_review_price_category + ", pack_review_price_question_no="
				+ pack_review_price_question_no + ", pack_review_price_score=" + pack_review_price_score
				+ ", pack_review_price_contents=" + pack_review_price_contents + ", user_id=" + user_id
				+ ", pack_review_price_date=" + pack_review_price_date + ", pack_review_price_point="
				+ pack_review_price_point + "]";
	}
	public PackPriceReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_price_no() {
		return pack_review_price_no;
	}
	public void setPack_review_price_no(String pack_review_price_no) {
		this.pack_review_price_no = pack_review_price_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_review_price_category() {
		return pack_review_price_category;
	}
	public void setPack_review_price_category(String pack_review_price_category) {
		this.pack_review_price_category = pack_review_price_category;
	}
	public String getPack_review_price_question_no() {
		return pack_review_price_question_no;
	}
	public void setPack_review_price_question_no(String pack_review_price_question_no) {
		this.pack_review_price_question_no = pack_review_price_question_no;
	}
	public float getPack_review_price_score() {
		return pack_review_price_score;
	}
	public void setPack_review_price_score(float pack_review_price_score) {
		this.pack_review_price_score = pack_review_price_score;
	}
	public String getPack_review_price_contents() {
		return pack_review_price_contents;
	}
	public void setPack_review_price_contents(String pack_review_price_contents) {
		this.pack_review_price_contents = pack_review_price_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPack_review_price_date() {
		return pack_review_price_date;
	}
	public void setPack_review_price_date(String pack_review_price_date) {
		this.pack_review_price_date = pack_review_price_date;
	}
	public int getPack_review_price_point() {
		return pack_review_price_point;
	}
	public void setPack_review_price_point(int pack_review_price_point) {
		this.pack_review_price_point = pack_review_price_point;
	}
	
}
