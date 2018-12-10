package com.travel.plan.dto;

//플랜 음식점 평가 정보 DTO

public class PlanFoodReviewDTO {
	private String plan_review_food_no;
	private String plan1_no;
	private String plan_review_food_name;
	private String plan_review_food_category;
	private int plan_review_food_question_no;
	private float plan_review_food_score;
	private String plan_review_food_contents;
	private String user_id;
	private String plan_review_food_date;
	private int plan_review_food_point;
	
	@Override
	public String toString() {
		return "PlanFoodReviewDTO [plan_review_food_no=" + plan_review_food_no + ", plan1_no=" + plan1_no
				+ ", plan_review_food_name=" + plan_review_food_name + ", plan_review_food_category="
				+ plan_review_food_category + ", plan_review_food_question_no=" + plan_review_food_question_no
				+ ", plan_review_food_score=" + plan_review_food_score + ", plan_review_food_contents="
				+ plan_review_food_contents + ", user_id=" + user_id + ", plan_review_food_date="
				+ plan_review_food_date + ", plan_review_food_point=" + plan_review_food_point + "]";
	}
	public PlanFoodReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlan_review_food_no() {
		return plan_review_food_no;
	}
	public void setPlan_review_food_no(String plan_review_food_no) {
		this.plan_review_food_no = plan_review_food_no;
	}
	public String getPlan1_no() {
		return plan1_no;
	}
	public void setPlan1_no(String plan1_no) {
		this.plan1_no = plan1_no;
	}
	public String getPlan_review_food_name() {
		return plan_review_food_name;
	}
	public void setPlan_review_food_name(String plan_review_food_name) {
		this.plan_review_food_name = plan_review_food_name;
	}
	public String getPlan_review_food_category() {
		return plan_review_food_category;
	}
	public void setPlan_review_food_category(String plan_review_food_category) {
		this.plan_review_food_category = plan_review_food_category;
	}
	public int getPlan_review_food_question_no() {
		return plan_review_food_question_no;
	}
	public void setPlan_review_food_question_no(int plan_review_food_question_no) {
		this.plan_review_food_question_no = plan_review_food_question_no;
	}
	public float getPlan_review_food_score() {
		return plan_review_food_score;
	}
	public void setPlan_review_food_score(float plan_review_food_score) {
		this.plan_review_food_score = plan_review_food_score;
	}
	public String getPlan_review_food_contents() {
		return plan_review_food_contents;
	}
	public void setPlan_review_food_contents(String plan_review_food_contents) {
		this.plan_review_food_contents = plan_review_food_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPlan_review_food_date() {
		return plan_review_food_date;
	}
	public void setPlan_review_food_date(String plan_review_food_date) {
		this.plan_review_food_date = plan_review_food_date;
	}
	public int getPlan_review_food_point() {
		return plan_review_food_point;
	}
	public void setPlan_review_food_point(int plan_review_food_point) {
		this.plan_review_food_point = plan_review_food_point;
	}
	
}
