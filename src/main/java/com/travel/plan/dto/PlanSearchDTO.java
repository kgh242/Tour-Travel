package com.travel.plan.dto;

public class PlanSearchDTO {

	private String planSearchCountry;
	private String planStartDate;
	
	
	public PlanSearchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PlanSearchDTO [planSearchCountry=" + planSearchCountry + ", planStartDate=" + planStartDate + "]";
	}
	public String getPlanSearchCountry() {
		return planSearchCountry;
	}
	public void setPlanSearchCountry(String planSearchCountry) {
		this.planSearchCountry = planSearchCountry;
	}
	public String getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}
}
