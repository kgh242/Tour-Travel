package com.travel.plan.dto;

//플랜 교통 평가 정보 DTO

public class PlanTrafficReviewDTO {
	private String plan_review_traffic_no;
	private String plan1_no;
	private String plan_review_traffic_name;
	private String plan_review_traffic_category;
	private int plan_review_traffic_question_no;
	private float plan_review_traffic_score;
	private String plan_review_traffic_contents;
	private String user_id;
	private String plan_review_traffic_date;
	private int plan_review_traffic_point;
	
	@Override
	public String toString() {
		return "PlanTrafficReviewDTO [plan_review_traffic_no=" + plan_review_traffic_no + ", plan1_no=" + plan1_no
				+ ", plan_review_traffic_name=" + plan_review_traffic_name + ", plan_review_traffic_category="
				+ plan_review_traffic_category + ", plan_review_traffic_question_no=" + plan_review_traffic_question_no
				+ ", plan_review_traffic_score=" + plan_review_traffic_score + ", plan_review_traffic_contents="
				+ plan_review_traffic_contents + ", user_id=" + user_id + ", plan_review_traffic_date="
				+ plan_review_traffic_date + ", plan_review_traffic_point=" + plan_review_traffic_point + "]";
	}
	public PlanTrafficReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlan_review_traffic_no() {
		return plan_review_traffic_no;
	}
	public void setPlan_review_traffic_no(String plan_review_traffic_no) {
		this.plan_review_traffic_no = plan_review_traffic_no;
	}
	public String getPlan1_no() {
		return plan1_no;
	}
	public void setPlan1_no(String plan1_no) {
		this.plan1_no = plan1_no;
	}
	public String getPlan_review_traffic_name() {
		return plan_review_traffic_name;
	}
	public void setPlan_review_traffic_name(String plan_review_traffic_name) {
		this.plan_review_traffic_name = plan_review_traffic_name;
	}
	public String getPlan_review_traffic_category() {
		return plan_review_traffic_category;
	}
	public void setPlan_review_traffic_category(String plan_review_traffic_category) {
		this.plan_review_traffic_category = plan_review_traffic_category;
	}
	public int getPlan_review_traffic_question_no() {
		return plan_review_traffic_question_no;
	}
	public void setPlan_review_traffic_question_no(int plan_review_traffic_question_no) {
		this.plan_review_traffic_question_no = plan_review_traffic_question_no;
	}
	public float getPlan_review_traffic_score() {
		return plan_review_traffic_score;
	}
	public void setPlan_review_traffic_score(float plan_review_traffic_score) {
		this.plan_review_traffic_score = plan_review_traffic_score;
	}
	public String getPlan_review_traffic_contents() {
		return plan_review_traffic_contents;
	}
	public void setPlan_review_traffic_contents(String plan_review_traffic_contents) {
		this.plan_review_traffic_contents = plan_review_traffic_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPlan_review_traffic_date() {
		return plan_review_traffic_date;
	}
	public void setPlan_review_traffic_date(String plan_review_traffic_date) {
		this.plan_review_traffic_date = plan_review_traffic_date;
	}
	public int getPlan_review_traffic_point() {
		return plan_review_traffic_point;
	}
	public void setPlan_review_traffic_point(int plan_review_traffic_point) {
		this.plan_review_traffic_point = plan_review_traffic_point;
	}
	
}
