package com.travel.plan.dto;

//플랜 종합 평가 정보 DTO

public class PlanReviewDTO {
	private String plan_review_no;
	private String plan1_no;
	private String user_id;
	private float plan_review_hotel_score;
	private float plan_review_food_score;
	private float plan_review_traffic_score;
	private float plan_review_landmark_score;
	private float plan_review_total_score;
	private String plan_review_contents;
	private int plan_review_point;
	private String plan_review_date;
	
	
	@Override
	public String toString() {
		return "PlanReviewDTO [plan_review_no=" + plan_review_no + ", plan1_no=" + plan1_no + ", user_id=" + user_id
				+ ", plan_review_hotel_score=" + plan_review_hotel_score + ", plan_review_food_score="
				+ plan_review_food_score + ", plan_review_traffic_score=" + plan_review_traffic_score
				+ ", plan_review_landmark_score=" + plan_review_landmark_score + ", plan_review_total_score="
				+ plan_review_total_score + ", plan_review_contents=" + plan_review_contents + ", plan_review_point="
				+ plan_review_point + ", plan_review_date=" + plan_review_date + "]";
	}
	public PlanReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlan_review_no() {
		return plan_review_no;
	}
	public void setPlan_review_no(String plan_review_no) {
		this.plan_review_no = plan_review_no;
	}
	public String getPlan1_no() {
		return plan1_no;
	}
	public void setPlan1_no(String plan1_no) {
		this.plan1_no = plan1_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public float getPlan_review_hotel_score() {
		return plan_review_hotel_score;
	}
	public void setPlan_review_hotel_score(float plan_review_hotel_score) {
		this.plan_review_hotel_score = plan_review_hotel_score;
	}
	public float getPlan_review_food_score() {
		return plan_review_food_score;
	}
	public void setPlan_review_food_score(float plan_review_food_score) {
		this.plan_review_food_score = plan_review_food_score;
	}
	public float getPlan_review_traffic_score() {
		return plan_review_traffic_score;
	}
	public void setPlan_review_traffic_score(float plan_review_traffic_score) {
		this.plan_review_traffic_score = plan_review_traffic_score;
	}
	public float getPlan_review_landmark_score() {
		return plan_review_landmark_score;
	}
	public void setPlan_review_landmark_score(float plan_review_landmark_score) {
		this.plan_review_landmark_score = plan_review_landmark_score;
	}
	public float getPlan_review_total_score() {
		return plan_review_total_score;
	}
	public void setPlan_review_total_score(float plan_review_total_score) {
		this.plan_review_total_score = plan_review_total_score;
	}
	public String getPlan_review_contents() {
		return plan_review_contents;
	}
	public void setPlan_review_contents(String plan_review_contents) {
		this.plan_review_contents = plan_review_contents;
	}
	public int getPlan_review_point() {
		return plan_review_point;
	}
	public void setPlan_review_point(int plan_review_point) {
		this.plan_review_point = plan_review_point;
	}
	public String getPlan_review_date() {
		return plan_review_date;
	}
	public void setPlan_review_date(String plan_review_date) {
		this.plan_review_date = plan_review_date;
	}

	
}
