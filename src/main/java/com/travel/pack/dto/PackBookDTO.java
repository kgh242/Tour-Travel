package com.travel.pack.dto;

public class PackBookDTO {
	private int pack_book_no;
	private int pack_info_no;
	private String user_id;
	private int pack_book_tell;
	private int pack_book_adult;
	private int pack_book_child;
	private int pack_book_baby;
	private int pack_book_price;
	private String pack_book_date;
	private String pack_book_states;
	
	@Override
	public String toString() {
		return "PackBookDTO [pack_book_no=" + pack_book_no + ", pack_info_no=" + pack_info_no + ", user_id=" + user_id
				+ ", pack_book_tell=" + pack_book_tell + ", pack_book_adult=" + pack_book_adult + ", pack_book_child="
				+ pack_book_child + ", pack_book_baby=" + pack_book_baby + ", pack_book_price=" + pack_book_price
				+ ", pack_book_date=" + pack_book_date + ", pack_book_states=" + pack_book_states + "]";
	}

	public int getPack_book_no() {
		return pack_book_no;
	}

	public void setPack_book_no(int pack_book_no) {
		this.pack_book_no = pack_book_no;
	}

	public int getPack_info_no() {
		return pack_info_no;
	}

	public void setPack_info_no(int pack_info_no) {
		this.pack_info_no = pack_info_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getPack_book_tell() {
		return pack_book_tell;
	}

	public void setPack_book_tell(int pack_book_tell) {
		this.pack_book_tell = pack_book_tell;
	}

	public int getPack_book_adult() {
		return pack_book_adult;
	}

	public void setPack_book_adult(int pack_book_adult) {
		this.pack_book_adult = pack_book_adult;
	}

	public int getPack_book_child() {
		return pack_book_child;
	}

	public void setPack_book_child(int pack_book_child) {
		this.pack_book_child = pack_book_child;
	}

	public int getPack_book_baby() {
		return pack_book_baby;
	}

	public void setPack_book_baby(int pack_book_baby) {
		this.pack_book_baby = pack_book_baby;
	}

	public int getPack_book_price() {
		return pack_book_price;
	}

	public void setPack_book_price(int pack_book_price) {
		this.pack_book_price = pack_book_price;
	}

	public String getPack_book_date() {
		return pack_book_date;
	}

	public void setPack_book_date(String pack_book_date) {
		this.pack_book_date = pack_book_date;
	}

	public String getPack_book_states() {
		return pack_book_states;
	}

	public void setPack_book_states(String pack_book_states) {
		this.pack_book_states = pack_book_states;
	}
	
	
	
}
