package com.jithendra.telecomapplication.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infytelcopy.dto.CallDetailsDTO;
import com.infytelcopy.dto.CustomerDTO;
import com.infytelcopy.dto.FriendFamilyDTO;
import com.infytelcopy.entity.CallDetails;
import com.infytelcopy.entity.Customer;
import com.infytelcopy.entity.FriendFamily;
import com.infytelcopy.entity.Plan;
import com.infytelcopy.repository.CallDetailsRepository;
import com.infytelcopy.repository.CustomerRepository;



@Service
public class CustomerService {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CallDetailsRepository callDetailsRepository;

	public void createCustomer(CustomerDTO customerdto) {
		logger.info("creation request for customer {}", customerdto);
		Customer customer=customerdto.createEntity();
		Plan plan=new Plan();
		plan.setPlanId(customerdto.getCurrentPlan().getPlanId());
		customer.setPlan(plan);
		customerRepository.save(customer);
		
	}

	public CustomerDTO getCustomerProfile(Long phoneNo) {
		CustomerDTO customerDTO=null;
		logger.info("profile request for customer {}", phoneNo);
		Optional<Customer> customer=customerRepository.findById(phoneNo);
		if(customer.isPresent())
		{
			customerDTO=CustomerDTO.valueOf(customer.get());
		}
		logger.info("profile for customer :{}",customerDTO);
		return customerDTO;
	}

	public List<CallDetailsDTO> getCustomerCallDetails(long phoneNo) {
		logger.info("Call details request for customer {}", phoneNo);
		List<CallDetails> callDetails=callDetailsRepository.findByCalledBy(phoneNo);
		List<CallDetailsDTO> callDetailsDTO=new ArrayList<>();
		for(CallDetails call:callDetails)
		{
			callDetailsDTO.add(CallDetailsDTO.valueOf(call));
		}
		
		logger.info("call details for the customer {}", callDetailsDTO);
		return callDetailsDTO;
		
	}

	public void saveFriend(Long phoneNo, FriendFamilyDTO friendDTO) {
		logger.info("Creation request for customer {} with data {}", phoneNo, friendDTO);
		friendDTO.setPhoneNo(phoneNo);
		FriendFamily friend=friendDTO.createFriend();
		List<FriendFamily> friendList= new ArrayList<>();
		friendList.add(friend);
		
		Customer c=customerRepository.getOne(phoneNo);
		c.getFriends().add(friend);
		c.setFriends(c.getFriends());
		customerRepository.save(c);
		
		
		
	}
	
	
	
	

	
	
}
