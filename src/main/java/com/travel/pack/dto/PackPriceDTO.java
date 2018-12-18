package com.travel.pack.dto;

public class PackPriceDTO {
	private int pack_info_no;
	private int pack_price_adult;
	private int pack_price_child;
	private int pack_price_baby;

	@Override
	public String toString() {
		return "PackPriceDTO [pack_info_no=" + pack_info_no + ", pack_price_adult=" + pack_price_adult
				+ ", pack_price_child=" + pack_price_child + ", pack_price_baby=" + pack_price_baby + "]";
	}
	public int getPack_info_no() {
		return pack_info_no;
	}
	public void setPack_info_no(int pack_info_no) {
		this.pack_info_no = pack_info_no;
	}
	public int getPack_price_adult() {
		return pack_price_adult;
	}
	public void setPack_price_adult(int pack_price_adult) {
		this.pack_price_adult = pack_price_adult;
	}
	public int getPack_price_child() {
		return pack_price_child;
	}
	public void setPack_price_child(int pack_price_child) {
		this.pack_price_child = pack_price_child;
	}
	public int getPack_price_baby() {
		return pack_price_baby;
	}
	public void setPack_price_baby(int pack_price_baby) {
		this.pack_price_baby = pack_price_baby;
	}
	
}
