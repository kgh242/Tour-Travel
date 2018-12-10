package com.travel.plan.dto;

//플랜방 정보 DTO (1차정보)

public class PlanDTO {
	private String plan1_no;
	private String user_id;
	private String plan1_user_ip;
	private String plan1_conutry;
	private String plan1_city;
	private String plan1_info;
	private String plan1_start_date;
	private String plan1_end_date;
	private String plan1_budget;
	private String plan1_closing_date;
	private String plan1_age;
	private String plan1_preson_number;
	private String plan1_gender;
	
	@Override
	public String toString() {
		return "PlanDTO [plan1_no=" + plan1_no + ", user_id=" + user_id + ", plan1_user_ip=" + plan1_user_ip
				+ ", plan1_conutry=" + plan1_conutry + ", plan1_city=" + plan1_city + ", plan1_info=" + plan1_info
				+ ", plan1_start_date=" + plan1_start_date + ", plan1_end_date=" + plan1_end_date + ", plan1_budget="
				+ plan1_budget + ", plan1_closing_date=" + plan1_closing_date + ", plan1_age=" + plan1_age
				+ ", plan1_preson_number=" + plan1_preson_number + ", plan1_gender=" + plan1_gender + "]";
	}
	public PlanDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getPlan1_user_ip() {
		return plan1_user_ip;
	}
	public void setPlan1_user_ip(String plan1_user_ip) {
		this.plan1_user_ip = plan1_user_ip;
	}
	public String getPlan1_conutry() {
		return plan1_conutry;
	}
	public void setPlan1_conutry(String plan1_conutry) {
		this.plan1_conutry = plan1_conutry;
	}
	public String getPlan1_city() {
		return plan1_city;
	}
	public void setPlan1_city(String plan1_city) {
		this.plan1_city = plan1_city;
	}
	public String getPlan1_info() {
		return plan1_info;
	}
	public void setPlan1_info(String plan1_info) {
		this.plan1_info = plan1_info;
	}
	public String getPlan1_start_date() {
		return plan1_start_date;
	}
	public void setPlan1_start_date(String plan1_start_date) {
		this.plan1_start_date = plan1_start_date;
	}
	public String getPlan1_end_date() {
		return plan1_end_date;
	}
	public void setPlan1_end_date(String plan1_end_date) {
		this.plan1_end_date = plan1_end_date;
	}
	public String getPlan1_budget() {
		return plan1_budget;
	}
	public void setPlan1_budget(String plan1_budget) {
		this.plan1_budget = plan1_budget;
	}
	public String getPlan1_closing_date() {
		return plan1_closing_date;
	}
	public void setPlan1_closing_date(String plan1_closing_date) {
		this.plan1_closing_date = plan1_closing_date;
	}
	public String getPlan1_age() {
		return plan1_age;
	}
	public void setPlan1_age(String plan1_age) {
		this.plan1_age = plan1_age;
	}
	public String getPlan1_preson_number() {
		return plan1_preson_number;
	}
	public void setPlan1_preson_number(String plan1_preson_number) {
		this.plan1_preson_number = plan1_preson_number;
	}
	public String getPlan1_gender() {
		return plan1_gender;
	}
	public void setPlan1_gender(String plan1_gender) {
		this.plan1_gender = plan1_gender;
	}

}
