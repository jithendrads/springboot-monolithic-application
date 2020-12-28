package com.jithendra.telecomapplication.dto;


  
import com.jithendra.telecomapplication.entity.Plan;

public class PlanDTO {
	
	Integer planId;
	String planName;
	Integer nationalRate;
	Integer localRate;
	public PlanDTO() {
		
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getNationalRate() {
		return nationalRate;
	}
	public void setNationalRate(Integer nationalRate) {
		this.nationalRate = nationalRate;
	}
	public Integer getLocalRate() {
		return localRate;
	}
	public void setLocalRate(Integer localRate) {
		this.localRate = localRate;
	}
	@Override
	public String toString() {
		return "PlanDTO [planId=" + planId + ", planName=" + planName + ", nationalRate=" + nationalRate
				+ ", localRate=" + localRate + "]";
	}
	
	public static PlanDTO valueOf(Plan plan)
	{
		PlanDTO plandto=new PlanDTO();
		plandto.setLocalRate(plan.getLocalRate());
		plandto.setNationalRate(plan.getNationalRate());
		plandto.setPlanId(plan.getPlanId());
		plandto.setPlanName(plan.getPlanName());
		
		return plandto;

	}
	
	

}
