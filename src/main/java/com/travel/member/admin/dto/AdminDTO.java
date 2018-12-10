package com.travel.member.admin.dto;

//관리자 정보 DTO

public class AdminDTO {
	private String admin_no;
	private String admin_id;
	private String admin_pw;
	private String admin_level;
	private String admin_team;
	private String admin_employee_no;
	private String admin_employee_tell;
	private String admin_date;
	
	@Override
	public String toString() {
		return "AdminDTO [admin_no=" + admin_no + ", admin_id=" + admin_id + ", admin_pw=" + admin_pw + ", admin_level="
				+ admin_level + ", admin_team=" + admin_team + ", admin_employee_no=" + admin_employee_no
				+ ", admin_employee_tell=" + admin_employee_tell + ", admin_date=" + admin_date + "]";
	}
	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAdmin_no() {
		return admin_no;
	}
	public void setAdmin_no(String admin_no) {
		this.admin_no = admin_no;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_pw() {
		return admin_pw;
	}
	public void setAdmin_pw(String admin_pw) {
		this.admin_pw = admin_pw;
	}
	public String getAdmin_level() {
		return admin_level;
	}
	public void setAdmin_level(String admin_level) {
		this.admin_level = admin_level;
	}
	public String getAdmin_team() {
		return admin_team;
	}
	public void setAdmin_team(String admin_team) {
		this.admin_team = admin_team;
	}
	public String getAdmin_employee_no() {
		return admin_employee_no;
	}
	public void setAdmin_employee_no(String admin_employee_no) {
		this.admin_employee_no = admin_employee_no;
	}
	public String getAdmin_employee_tell() {
		return admin_employee_tell;
	}
	public void setAdmin_employee_tell(String admin_employee_tell) {
		this.admin_employee_tell = admin_employee_tell;
	}
	public String getAdmin_date() {
		return admin_date;
	}
	public void setAdmin_date(String admin_date) {
		this.admin_date = admin_date;
	}
	
}
