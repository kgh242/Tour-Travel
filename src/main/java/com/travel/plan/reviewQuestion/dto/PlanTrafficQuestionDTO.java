package com.travel.plan.reviewQuestion.dto;

//플랜 교통 평점 문항 DTO ( 평점의 질문 )

public class PlanTrafficQuestionDTO {
	private String plan_review_traffic_question_no;
	private String plan_review_traffic_question_category;
	private String plan_review_traffic_question_contents;
	private String admin_id;
	private String plan_review_traffic_question_date;
	
	
	@Override
	public String toString() {
		return "PlanTrafficQuestionDTO [plan_review_traffic_question_no=" + plan_review_traffic_question_no
				+ ", plan_review_traffic_question_category=" + plan_review_traffic_question_category
				+ ", plan_review_traffic_question_contents=" + plan_review_traffic_question_contents + ", admin_id="
				+ admin_id + ", plan_review_traffic_question_date=" + plan_review_traffic_question_date + "]";
	}
	public PlanTrafficQuestionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlan_review_traffic_question_no() {
		return plan_review_traffic_question_no;
	}
	public void setPlan_review_traffic_question_no(String plan_review_traffic_question_no) {
		this.plan_review_traffic_question_no = plan_review_traffic_question_no;
	}
	public String getPlan_review_traffic_question_category() {
		return plan_review_traffic_question_category;
	}
	public void setPlan_review_traffic_question_category(String plan_review_traffic_question_category) {
		this.plan_review_traffic_question_category = plan_review_traffic_question_category;
	}
	public String getPlan_review_traffic_question_contents() {
		return plan_review_traffic_question_contents;
	}
	public void setPlan_review_traffic_question_contents(String plan_review_traffic_question_contents) {
		this.plan_review_traffic_question_contents = plan_review_traffic_question_contents;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getPlan_review_traffic_question_date() {
		return plan_review_traffic_question_date;
	}
	public void setPlan_review_traffic_question_date(String plan_review_traffic_question_date) {
		this.plan_review_traffic_question_date = plan_review_traffic_question_date;
	}
	
}
