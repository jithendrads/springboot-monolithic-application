package com.jithendra.telecomapplication.dto;



import java.sql.Date;

import com.jithendra.telecomapplication.entity.CallDetails;

public class CallDetailsDTO {

	long calledBy;
	long calledTo;
	Date calledOn;
	Integer duration;
	
	
	public CallDetailsDTO() {
		
	}


	public CallDetailsDTO(long calledBy, long calledTo, Date calledOn, Integer duration) {
		this.calledBy = calledBy;
		this.calledTo = calledTo;
		this.calledOn = calledOn;
		this.duration = duration;
	}


	public long getCalledBy() {
		return calledBy;
	}


	public void setCalledBy(long calledBy) {
		this.calledBy = calledBy;
	}


	public long getCalledTo() {
		return calledTo;
	}


	public void setCalledTo(long calledTo) {
		this.calledTo = calledTo;
	}


	public Date getCalledOn() {
		return calledOn;
	}


	public void setCalledOn(Date calledOn) {
		this.calledOn = calledOn;
	}


	public Integer getDuration() {
		return duration;
	}


	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "CallDetailsDTO [calledBy=" + calledBy + ", calledTo=" + calledTo + ", calledOn=" + calledOn
				+ ", duration=" + duration + "]";
	}
	
	
	public static CallDetailsDTO valueOf(CallDetails calldetails)
	{
		CallDetailsDTO calldetailsdto=new CallDetailsDTO();
		calldetailsdto.setCalledBy(calldetails.getCalledBy());
		calldetailsdto.setCalledOn(calldetails.getCalledOn());
		calldetailsdto.setCalledTo(calldetails.getCalledTo());
		calldetailsdto.setDuration(calldetails.getDuration());
		
		return calldetailsdto;
	}
	
	
	
	
}
