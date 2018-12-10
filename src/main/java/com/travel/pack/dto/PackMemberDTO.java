package com.travel.pack.dto;

//패키지 신청자 정보 DTO

public class PackMemberDTO {
	private String pack_book_person_no;
	private String pack_book_no;
	private String user_id;
	private int pack_book_person_age;
	private String pack_book_person_passport;
	private String pack_book_person_add;
	private boolean pack_book_person_self;
	
	@Override
	public String toString() {
		return "PackMemberDTO [pack_book_person_no=" + pack_book_person_no + ", pack_book_no=" + pack_book_no
				+ ", user_id=" + user_id + ", pack_book_person_age=" + pack_book_person_age
				+ ", pack_book_person_passport=" + pack_book_person_passport + ", pack_book_person_add="
				+ pack_book_person_add + ", pack_book_person_self=" + pack_book_person_self + "]";
	}
	public PackMemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPack_book_person_no() {
		return pack_book_person_no;
	}
	public void setPack_book_person_no(String pack_book_person_no) {
		this.pack_book_person_no = pack_book_person_no;
	}
	public String getPack_book_no() {
		return pack_book_no;
	}
	public void setPack_book_no(String pack_book_no) {
		this.pack_book_no = pack_book_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getPack_book_person_age() {
		return pack_book_person_age;
	}
	public void setPack_book_person_age(int pack_book_person_age) {
		this.pack_book_person_age = pack_book_person_age;
	}
	public String getPack_book_person_passport() {
		return pack_book_person_passport;
	}
	public void setPack_book_person_passport(String pack_book_person_passport) {
		this.pack_book_person_passport = pack_book_person_passport;
	}
	public String getPack_book_person_add() {
		return pack_book_person_add;
	}
	public void setPack_book_person_add(String pack_book_person_add) {
		this.pack_book_person_add = pack_book_person_add;
	}
	public boolean isPack_book_person_self() {
		return pack_book_person_self;
	}
	public void setPack_book_person_self(boolean pack_book_person_self) {
		this.pack_book_person_self = pack_book_person_self;
	}
	
}
