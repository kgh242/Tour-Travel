package com.travel.chat.dto;

//채팅 정보 DTO

public class ChatDTO {
	private String plan_chat_no;
	private String user_id;
	private String plan_chat_date;
	private String plan_message;
	
	@Override
	public String toString() {
		return "ChatDTO [plan_chat_no=" + plan_chat_no + ", user_id=" + user_id + ", plan_chat_date=" + plan_chat_date
				+ ", plan_message=" + plan_message + "]";
	}
	public ChatDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlan_chat_no() {
		return plan_chat_no;
	}
	public void setPlan_chat_no(String plan_chat_no) {
		this.plan_chat_no = plan_chat_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPlan_chat_date() {
		return plan_chat_date;
	}
	public void setPlan_chat_date(String plan_chat_date) {
		this.plan_chat_date = plan_chat_date;
	}
	public String getPlan_message() {
		return plan_message;
	}
	public void setPlan_message(String plan_message) {
		this.plan_message = plan_message;
	}
	
}
