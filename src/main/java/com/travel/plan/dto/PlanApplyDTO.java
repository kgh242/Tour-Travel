package com.travel.plan.dto;

public class PlanApplyDTO {
	private int plan_apply_no;
	private int plan1_no;
	private String user_id;
	private String plan_apply_date;
	private String plan_apply_state;
	private String plan_apply_result_date;
	@Override
	public String toString() {
		return "PlanApplyDTO [plan_apply_no=" + plan_apply_no + ", plan1_no=" + plan1_no + ", user_id=" + user_id
				+ ", plan_apply_date=" + plan_apply_date + ", plan_apply_state=" + plan_apply_state
				+ ", plan_apply_result_date=" + plan_apply_result_date + "]";
	}
	public int getPlan_apply_no() {
		return plan_apply_no;
	}
	public void setPlan_apply_no(int plan_apply_no) {
		this.plan_apply_no = plan_apply_no;
	}
	public int getPlan1_no() {
		return plan1_no;
	}
	public void setPlan1_no(int plan1_no) {
		this.plan1_no = plan1_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPlan_apply_date() {
		return plan_apply_date;
	}
	public void setPlan_apply_date(String plan_apply_date) {
		this.plan_apply_date = plan_apply_date;
	}
	public String getPlan_apply_state() {
		return plan_apply_state;
	}
	public void setPlan_apply_state(String plan_apply_state) {
		this.plan_apply_state = plan_apply_state;
	}
	public String getPlan_apply_result_date() {
		return plan_apply_result_date;
	}
	public void setPlan_apply_result_date(String plan_apply_result_date) {
		this.plan_apply_result_date = plan_apply_result_date;
	}

	
	
}
