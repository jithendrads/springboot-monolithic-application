package com.jithendra.telecomapplication.dto;

  
import com.jithendra.telecomapplication.entity.FriendFamily;

public class FriendFamilyDTO {
	
	long phoneNo;
	long friendAndFamily;
	public FriendFamilyDTO() {
	
	}
	public FriendFamilyDTO(long phoneNo, long friendAndFamily) {
	
		this.phoneNo = phoneNo;
		this.friendAndFamily = friendAndFamily;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getFriendAndFamily() {
		return friendAndFamily;
	}
	public void setFriendAndFamily(long friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}
	@Override
	public String toString() {
		return "FriendFamilyDTO [phoneNo=" + phoneNo + ", friendAndFamily=" + friendAndFamily + "]";
	}
	
	public FriendFamily createFriend()
	{
		FriendFamily friend=new FriendFamily();
		friend.setPhoneNo(this.getPhoneNo());
		friend.setFriendAndFamily(this.getFriendAndFamily());
		
		return friend;
	}
	
	
	
	

}
