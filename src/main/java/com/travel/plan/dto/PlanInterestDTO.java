package com.travel.plan.dto;

public class PlanInterestDTO {
	private int plan1_concept_no;
	private int plan1_no;
	private String plan1_interest;
	@Override
	public String toString() {
		return "PlanInterestDTO [plan1_concept_no=" + plan1_concept_no + ", plan1_no=" + plan1_no + ", plan1_interest="
				+ plan1_interest + "]";
	}
	public int getPlan1_concept_no() {
		return plan1_concept_no;
	}
	public void setPlan1_concept_no(int plan1_concept_no) {
		this.plan1_concept_no = plan1_concept_no;
	}
	public int getPlan1_no() {
		return plan1_no;
	}
	public void setPlan1_no(int plan1_no) {
		this.plan1_no = plan1_no;
	}
	public String getPlan1_interest() {
		return plan1_interest;
	}
	public void setPlan1_interest(String plan1_interest) {
		this.plan1_interest = plan1_interest;
	}
}
