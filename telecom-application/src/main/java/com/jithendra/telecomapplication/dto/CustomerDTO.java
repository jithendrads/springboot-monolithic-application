package com.jithendra.telecomapplication.dto;



import java.util.ArrayList;
import java.util.List;

import com.jithendra.telecomapplication.entity.Customer;
import com.jithendra.telecomapplication.entity.FriendFamily;

public class CustomerDTO {
	
	long phoneNo;
	String name;
	int age;
	char gender;
	List<Long> friendAndFamily;
	String password;
	String address;
	PlanDTO currentPlan;
	
	
	
	
	public CustomerDTO() {
		
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public List<Long> getFriendAndFamily() {
		return friendAndFamily;
	}
	public void setFriendAndFamily(List<Long> friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public PlanDTO getCurrentPlan() {
		return currentPlan;
	}
	public void setCurrentPlan(PlanDTO currentPlan) {
		this.currentPlan = currentPlan;
	}
	@Override
	public String toString() {
		return "CustomerDTO [phoneNo=" + phoneNo + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", friendAndFamily=" + friendAndFamily + ", password=" + password + ", address=" + address + "]";
	}
	
	public static CustomerDTO valueOf(Customer customer)
	{
		CustomerDTO customerdto=new CustomerDTO();
		customerdto.setPhoneNo(customer.getPhoneNo());
		customerdto.setPassword(customer.getPassword());
		customerdto.setName(customer.getName());
		customerdto.setGender(customer.getGender());
		customerdto.setAddress(customer.getAddress());
		customerdto.setAge(customer.getAge());
		PlanDTO plandto=PlanDTO.valueOf(customer.getPlan());
		customerdto.setCurrentPlan(plandto);
		
		List<FriendFamily> friends=customer.getFriends();
		List<Long> friendList=new ArrayList<>();
		for(FriendFamily friend:friends)
		{
			friendList.add(friend.getFriendAndFamily());
		}
		customerdto.setFriendAndFamily(friendList);
		
		return customerdto;
	}
	
	
	public Customer createEntity()
	{
		Customer customer=new Customer();
		customer.setPhoneNo(this.getPhoneNo());
		customer.setPassword(this.getPassword());
		customer.setName(this.getName());
		customer.setGender(this.getGender());
		customer.setAge(this.getAge());
		customer.setAddress(this.getAddress());
		
		
		return customer;
	}

}

