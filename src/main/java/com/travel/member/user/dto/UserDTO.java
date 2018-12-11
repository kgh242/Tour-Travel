package com.travel.member.user.dto;

import org.springframework.web.multipart.MultipartFile;

// 고객 정보 DTO

public class UserDTO {
	private String user_no;
	private String user_id;
	private String user_pw;
	private String user_pw_check;
	private String user_nickname;
	private String user_birth;
	private String user_gender;
	private String user_address;
	private String user_email;
	private String user_tell;
	private String user_join_date;
	private String user_update_date;
	private String user_pw_date;
	private boolean user_email_check;
	private boolean user_sns_check;
	private String user_introduction;
	private String user_check_path;
	private String user_filename;
	private String user_date;
	private String admin_id;
	private String user_auth_date;
	private boolean user_auth;
	private int user_point;
	private String user_img_path;
	private String user_img_true_name;
	private String user_img_false_name;
	private String user_img_ext;
	private long user_img_size;
	private String user_img_date;
	private int user_escate;
	private MultipartFile user_img;
	
	

	@Override
	public String toString() {
		return "UserDTO [user_no=" + user_no + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_pw_check="
				+ user_pw_check + ", user_nickname=" + user_nickname + ", user_birth=" + user_birth + ", user_gender="
				+ user_gender + ", user_address=" + user_address + ", user_email=" + user_email + ", user_tell="
				+ user_tell + ", user_join_date=" + user_join_date + ", user_update_date=" + user_update_date
				+ ", user_pw_date=" + user_pw_date + ", user_email_check=" + user_email_check + ", user_sns_check="
				+ user_sns_check + ", user_introduction=" + user_introduction + ", user_check_path=" + user_check_path
				+ ", user_filename=" + user_filename + ", user_date=" + user_date + ", admin_id=" + admin_id
				+ ", user_auth_date=" + user_auth_date + ", user_auth=" + user_auth + ", user_point=" + user_point
				+ ", user_img_path=" + user_img_path + ", user_img_true_name=" + user_img_true_name
				+ ", user_img_false_name=" + user_img_false_name + ", user_img_ext=" + user_img_ext + ", user_img_size="
				+ user_img_size + ", user_img_date=" + user_img_date + ", user_escate=" + user_escate + "]";
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUser_no() {
		return user_no;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_pw_check() {
		return user_pw_check;
	}
	public void setUser_pw_check(String user_pw_check) {
		this.user_pw_check = user_pw_check;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public String getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_tell() {
		return user_tell;
	}
	public void setUser_tell(String user_tell) {
		this.user_tell = user_tell;
	}
	public String getUser_join_date() {
		return user_join_date;
	}
	public void setUser_join_date(String user_join_date) {
		this.user_join_date = user_join_date;
	}
	public String getUser_update_date() {
		return user_update_date;
	}
	public void setUser_update_date(String user_update_date) {
		this.user_update_date = user_update_date;
	}
	public String getUser_pw_date() {
		return user_pw_date;
	}
	public void setUser_pw_date(String user_pw_date) {
		this.user_pw_date = user_pw_date;
	}
	public boolean isUser_email_check() {
		return user_email_check;
	}
	public void setUser_email_check(boolean user_email_check) {
		this.user_email_check = user_email_check;
	}
	public boolean isUser_sns_check() {
		return user_sns_check;
	}
	public void setUser_sns_check(boolean user_sns_check) {
		this.user_sns_check = user_sns_check;
	}
	public String getUser_introduction() {
		return user_introduction;
	}
	public void setUser_introduction(String user_introduction) {
		this.user_introduction = user_introduction;
	}
	public String getUser_check_path() {
		return user_check_path;
	}
	public void setUser_check_path(String user_check_path) {
		this.user_check_path = user_check_path;
	}
	public String getUser_filename() {
		return user_filename;
	}
	public void setUser_filename(String user_filename) {
		this.user_filename = user_filename;
	}
	public String getUser_date() {
		return user_date;
	}
	public void setUser_date(String user_date) {
		this.user_date = user_date;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getUser_auth_date() {
		return user_auth_date;
	}
	public void setUser_auth_date(String user_auth_date) {
		this.user_auth_date = user_auth_date;
	}
	public boolean isUser_auth() {
		return user_auth;
	}
	public void setUser_auth(boolean user_auth) {
		this.user_auth = user_auth;
	}
	public int getUser_point() {
		return user_point;
	}
	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}
	public String getUser_img_path() {
		return user_img_path;
	}
	public void setUser_img_path(String user_img_path) {
		this.user_img_path = user_img_path;
	}
	public String getUser_img_true_name() {
		return user_img_true_name;
	}
	public void setUser_img_true_name(String user_img_true_name) {
		this.user_img_true_name = user_img_true_name;
	}
	public String getUser_img_false_name() {
		return user_img_false_name;
	}
	public void setUser_img_false_name(String user_img_false_name) {
		this.user_img_false_name = user_img_false_name;
	}
	public String getUser_img_ext() {
		return user_img_ext;
	}
	public void setUser_img_ext(String user_img_ext) {
		this.user_img_ext = user_img_ext;
	}
	public long getUser_img_size() {
		return user_img_size;
	}
	public void setUser_img_size(long user_img_size) {
		this.user_img_size = user_img_size;
	}
	public String getUser_img_date() {
		return user_img_date;
	}
	public void setUser_img_date(String user_img_date) {
		this.user_img_date = user_img_date;
	}
	public int getUser_escate() {
		return user_escate;
	}
	public void setUser_escate(int user_escate) {
		this.user_escate = user_escate;
	}
	public MultipartFile getUser_img() {
		return user_img;
	}
	public void setUser_img(MultipartFile user_img) {
		this.user_img = user_img;
	}



}
