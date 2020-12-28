package com.jithendra.telecomapplication.entity;


  
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Customer {
	@Id 
	@Column(name="phone_no",nullable=false)
	long phoneNo;
	@Column(nullable=false,length=50)
	String name;
	@Column(nullable=false)
	Integer age;
	@Column(nullable=false,length=50)
	String address;
	@Column(nullable=false,length=50)
	String password;
	@Column(nullable=false,length=1)
	char gender;
	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="plan_id")
	Plan plan;
	
	
	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name="phone_no")
	List<FriendFamily> friends=new ArrayList<>();
	
	public Customer()
	{
		
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public List<FriendFamily> getFriends() {
		return friends;
	}

	public void setFriends(List<FriendFamily> friends) {
		this.friends = friends;
	}
	
	

}

