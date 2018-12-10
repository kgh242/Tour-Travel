package com.travel.plan.dto;

//플랜 관광지 평가 정보 DTO

public class PlanLandmarkReviewDTO {
	private String plan_review_landmark_no;
	private String plan1_no;
	private String plan2_landmark_code;
	private String plan_review_landmark_category;
	private int plan_review_landmark_question_no;
	private float plan_review_landmark_score;
	private String plan_review_landmark_contents;
	private String user_id;
	private String plan_review_landmark_date;
	private int plan_review_landmark_point;
	
	@Override
	public String toString() {
		return "PlanLandmarkReviewDTO [plan_review_landmark_no=" + plan_review_landmark_no + ", plan1_no=" + plan1_no
				+ ", plan2_landmark_code=" + plan2_landmark_code + ", plan_review_landmark_category="
				+ plan_review_landmark_category + ", plan_review_landmark_question_no="
				+ plan_review_landmark_question_no + ", plan_review_landmark_score=" + plan_review_landmark_score
				+ ", plan_review_landmark_contents=" + plan_review_landmark_contents + ", user_id=" + user_id
				+ ", plan_review_landmark_date=" + plan_review_landmark_date + ", plan_review_landmark_point="
				+ plan_review_landmark_point + "]";
	}
	public PlanLandmarkReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlan_review_landmark_no() {
		return plan_review_landmark_no;
	}
	public void setPlan_review_landmark_no(String plan_review_landmark_no) {
		this.plan_review_landmark_no = plan_review_landmark_no;
	}
	public String getPlan1_no() {
		return plan1_no;
	}
	public void setPlan1_no(String plan1_no) {
		this.plan1_no = plan1_no;
	}
	public String getPlan2_landmark_code() {
		return plan2_landmark_code;
	}
	public void setPlan2_landmark_code(String plan2_landmark_code) {
		this.plan2_landmark_code = plan2_landmark_code;
	}
	public String getPlan_review_landmark_category() {
		return plan_review_landmark_category;
	}
	public void setPlan_review_landmark_category(String plan_review_landmark_category) {
		this.plan_review_landmark_category = plan_review_landmark_category;
	}
	public int getPlan_review_landmark_question_no() {
		return plan_review_landmark_question_no;
	}
	public void setPlan_review_landmark_question_no(int plan_review_landmark_question_no) {
		this.plan_review_landmark_question_no = plan_review_landmark_question_no;
	}
	public float getPlan_review_landmark_score() {
		return plan_review_landmark_score;
	}
	public void setPlan_review_landmark_score(float plan_review_landmark_score) {
		this.plan_review_landmark_score = plan_review_landmark_score;
	}
	public String getPlan_review_landmark_contents() {
		return plan_review_landmark_contents;
	}
	public void setPlan_review_landmark_contents(String plan_review_landmark_contents) {
		this.plan_review_landmark_contents = plan_review_landmark_contents;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPlan_review_landmark_date() {
		return plan_review_landmark_date;
	}
	public void setPlan_review_landmark_date(String plan_review_landmark_date) {
		this.plan_review_landmark_date = plan_review_landmark_date;
	}
	public int getPlan_review_landmark_point() {
		return plan_review_landmark_point;
	}
	public void setPlan_review_landmark_point(int plan_review_landmark_point) {
		this.plan_review_landmark_point = plan_review_landmark_point;
	}
	
}
