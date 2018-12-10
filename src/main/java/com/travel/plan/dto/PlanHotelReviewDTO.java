package com.travel.plan.dto;

//플랜 호텔 평가 정보 DTO

public class PlanHotelReviewDTO {
	private String plan_review_hotel_no;
	private String plan1_no;
	private String plan2_hotel_code;
	private String plan_review_hotel_category;
	private int plan_review_hotel_question_no;
	private float plan_review_hotel_score;
	private String plan_review_hotel_contents;
	private String user_id;
	private String plan_review_hotel_date;
	private int plan_review_hotel_point;
	
	@Override
	public String toString() {
		return "PlanHotelReviewDTO [plan_review_hotel_no=" + plan_review_hotel_no + ", plan1_no=" + plan1_no
				+ ", plan2_hotel_code=" + plan2_hotel_code + ", plan_review_hotel_category="
				+ plan_review_hotel_category + ", plan_review_hotel_question_no=" + plan_review_hotel_question_no
				+ ", plan_review_hotel_score=" + plan_review_hotel_score + ", plan_review_hotel_contents="
				+ plan_review_hotel_contents + ", user_id=" + user_id + ", plan_review_hotel_date="
				+ plan_review_hotel_date + ", plan_review_hotel_point=" + plan_review_hotel_point + "]";
	}
	public PlanHotelReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlan_review_hotel_no() {
		return plan_review_hotel_no;
	}
	public void setPlan_review_hotel_no(String plan_review_hotel_no) {
		this.plan_review_hotel_no = plan_review_hotel_no;
	}
	public String getPlan1_no() {
		return plan1_no;
	}
	public void setPlan1_no(String plan1_no) {
		this.plan1_no = plan1_no;
	}
	public String getPlan2_hotel_code() {
		return plan2_hotel_code;
	}
	public void setPlan2_hotel_code(String plan2_hotel_code) {
		this.plan2_hotel_code = plan2_hotel_code;
	}
	public String getPlan_review_hotel_category() {
		return plan_review_hotel_category;
	}
	public void setPlan_review_hotel_category(String plan_review_hotel_category) {
		this.plan_review_hotel_category = plan_review_hotel_category;
	}
	public int getPlan_review_hotel_question_no() {
		return plan_review_hotel_question_no;
	}
	public void setPlan_review_hotel_question_no(int plan_review_hotel_question_no) {
		this.plan_review_hotel_question_no = plan_review_hotel_question_no;
	}
	public float getPlan_review_hotel_score() {
		return plan_review_hotel_score;
	}
	public void setPlan_review_hotel_score(float plan_review_hotel_score) {
		this.plan_review_hotel_score = plan_review_hotel_score;
	}
	public String getPlan_review_hotel_contents() {
		return plan_review_hotel_contents;
	}
	public void setPlan_review_hotel_contents(String plan_review_hotel_contents) {
		this.plan_review_hotel_contents = plan_review_hotel_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPlan_review_hotel_date() {
		return plan_review_hotel_date;
	}
	public void setPlan_review_hotel_date(String plan_review_hotel_date) {
		this.plan_review_hotel_date = plan_review_hotel_date;
	}
	public int getPlan_review_hotel_point() {
		return plan_review_hotel_point;
	}
	public void setPlan_review_hotel_point(int plan_review_hotel_point) {
		this.plan_review_hotel_point = plan_review_hotel_point;
	}
	
}
