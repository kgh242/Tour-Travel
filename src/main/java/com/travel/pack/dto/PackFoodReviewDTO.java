package com.travel.pack.dto;

//패키지 음식점 평가 정보 DTO

public class PackFoodReviewDTO {
	private String pack_review_food_no;
	private String pack_info_no;
	private String pack_review_food_name;
	private String pack_review_food_category;
	private String pack_review_food_question_no;
	private float pack_review_food_score;
	private String pack_review_food_contents;
	private String user_id;
	private String pack_review_food_date;
	private int pack_review_food_point;
	
	
	@Override
	public String toString() {
		return "PackFoodReviewDTO [pack_review_food_no=" + pack_review_food_no + ", pack_info_no=" + pack_info_no
				+ ", pack_review_food_name=" + pack_review_food_name + ", pack_review_food_category="
				+ pack_review_food_category + ", pack_review_food_question_no=" + pack_review_food_question_no
				+ ", pack_review_food_score=" + pack_review_food_score + ", pack_review_food_contents="
				+ pack_review_food_contents + ", user_id=" + user_id + ", pack_review_food_date="
				+ pack_review_food_date + ", pack_review_food_point=" + pack_review_food_point + "]";
	}
	public PackFoodReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_food_no() {
		return pack_review_food_no;
	}
	public void setPack_review_food_no(String pack_review_food_no) {
		this.pack_review_food_no = pack_review_food_no;
	}
	public String getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(String pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public String getPack_review_food_name() {
		return pack_review_food_name;
	}
	public void setPack_review_food_name(String pack_review_food_name) {
		this.pack_review_food_name = pack_review_food_name;
	}
	public String getPack_review_food_category() {
		return pack_review_food_category;
	}
	public void setPack_review_food_category(String pack_review_food_category) {
		this.pack_review_food_category = pack_review_food_category;
	}
	public String getPack_review_food_question_no() {
		return pack_review_food_question_no;
	}
	public void setPack_review_food_question_no(String pack_review_food_question_no) {
		this.pack_review_food_question_no = pack_review_food_question_no;
	}
	public float getPack_review_food_score() {
		return pack_review_food_score;
	}
	public void setPack_review_food_score(float pack_review_food_score) {
		this.pack_review_food_score = pack_review_food_score;
	}
	public String getPack_review_food_contents() {
		return pack_review_food_contents;
	}
	public void setPack_review_food_contents(String pack_review_food_contents) {
		this.pack_review_food_contents = pack_review_food_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPack_review_food_date() {
		return pack_review_food_date;
	}
	public void setPack_review_food_date(String pack_review_food_date) {
		this.pack_review_food_date = pack_review_food_date;
	}
	public int getPack_review_food_point() {
		return pack_review_food_point;
	}
	public void setPack_review_food_point(int pack_review_food_point) {
		this.pack_review_food_point = pack_review_food_point;
	}
	
}
