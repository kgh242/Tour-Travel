package com.travel.plan.dto;

public class PlanScheduleDTO {
	private int plan2_schedule_no;
	private String plan1_no;
	private String user_id;
	private String plan2_schedule_date;
	private String plan2_schedule_day;
	private String plan2_schedule_contents;
	@Override
	public String toString() {
		return "PlanScheduleDTO [plan2_schedule_no=" + plan2_schedule_no + ", plan1_no=" + plan1_no + ", user_id="
				+ user_id + ", plan2_schedule_date=" + plan2_schedule_date + ", plan2_schedule_day="
				+ plan2_schedule_day + ", plan2_schedule_contents=" + plan2_schedule_contents + "]";
	}
	public int getPlan2_schedule_no() {
		return plan2_schedule_no;
	}
	public void setPlan2_schedule_no(int plan2_schedule_no) {
		this.plan2_schedule_no = plan2_schedule_no;
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
	public String getPlan2_schedule_date() {
		return plan2_schedule_date;
	}
	public void setPlan2_schedule_date(String plan2_schedule_date) {
		this.plan2_schedule_date = plan2_schedule_date;
	}
	public String getPlan2_schedule_day() {
		return plan2_schedule_day;
	}
	public void setPlan2_schedule_day(String plan2_schedule_day) {
		this.plan2_schedule_day = plan2_schedule_day;
	}
	public String getPlan2_schedule_contents() {
		return plan2_schedule_contents;
	}
	public void setPlan2_schedule_contents(String plan2_schedule_contents) {
		this.plan2_schedule_contents = plan2_schedule_contents;
	}
	
	

}
