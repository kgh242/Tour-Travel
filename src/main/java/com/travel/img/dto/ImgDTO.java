package com.travel.img.dto;

//이미지 DTO

public class ImgDTO {
	private String img_no;
	private String user_id;
	private String img_path;
	private String img_true_name;
	private String img_false_name;
	private String img_ext;
	private String img_size;
	private String img_date;
	
	
	@Override
	public String toString() {
		return "ImgDTO [img_no=" + img_no + ", user_id=" + user_id + ", img_path=" + img_path + ", img_true_name="
				+ img_true_name + ", img_false_name=" + img_false_name + ", img_ext=" + img_ext + ", img_size="
				+ img_size + ", img_date=" + img_date + "]";
	}
	public ImgDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getImg_no() {
		return img_no;
	}
	public void setImg_no(String img_no) {
		this.img_no = img_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public String getImg_true_name() {
		return img_true_name;
	}
	public void setImg_true_name(String img_true_name) {
		this.img_true_name = img_true_name;
	}
	public String getImg_false_name() {
		return img_false_name;
	}
	public void setImg_false_name(String img_false_name) {
		this.img_false_name = img_false_name;
	}
	public String getImg_ext() {
		return img_ext;
	}
	public void setImg_ext(String img_ext) {
		this.img_ext = img_ext;
	}
	public String getImg_size() {
		return img_size;
	}
	public void setImg_size(String img_size) {
		this.img_size = img_size;
	}
	public String getImg_date() {
		return img_date;
	}
	public void setImg_date(String img_date) {
		this.img_date = img_date;
	}
	
}
