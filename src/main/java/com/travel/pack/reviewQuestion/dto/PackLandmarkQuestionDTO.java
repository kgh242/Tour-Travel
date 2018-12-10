package com.travel.pack.reviewQuestion.dto;

//패키지 관광지 평점 문항 DTO ( 평점의 질문 )

public class PackLandmarkQuestionDTO {
	private String pack_review_landmark_question_no;
	private int pack_review_landmark_question_category;
	private String pack_review_landmark_question_contents;
	private String admin_id;
	private String pack_review_landmark_question_date;
	
	
	@Override
	public String toString() {
		return "PackLandmarkQuestionDTO [pack_review_landmark_question_no=" + pack_review_landmark_question_no
				+ ", pack_review_landmark_question_category=" + pack_review_landmark_question_category
				+ ", pack_review_landmark_question_contents=" + pack_review_landmark_question_contents + ", admin_id="
				+ admin_id + ", pack_review_landmark_question_date=" + pack_review_landmark_question_date + "]";
	}
	public PackLandmarkQuestionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_review_landmark_question_no() {
		return pack_review_landmark_question_no;
	}
	public void setPack_review_landmark_question_no(String pack_review_landmark_question_no) {
		this.pack_review_landmark_question_no = pack_review_landmark_question_no;
	}
	public int getPack_review_landmark_question_category() {
		return pack_review_landmark_question_category;
	}
	public void setPack_review_landmark_question_category(int pack_review_landmark_question_category) {
		this.pack_review_landmark_question_category = pack_review_landmark_question_category;
	}
	public String getPack_review_landmark_question_contents() {
		return pack_review_landmark_question_contents;
	}
	public void setPack_review_landmark_question_contents(String pack_review_landmark_question_contents) {
		this.pack_review_landmark_question_contents = pack_review_landmark_question_contents;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getPack_review_landmark_question_date() {
		return pack_review_landmark_question_date;
	}
	public void setPack_review_landmark_question_date(String pack_review_landmark_question_date) {
		this.pack_review_landmark_question_date = pack_review_landmark_question_date;
	}
	
	
	
}
