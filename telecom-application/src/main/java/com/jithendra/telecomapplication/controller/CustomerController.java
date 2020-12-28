package com.jithendra.telecomapplication.controller;


import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jithendra.telecomapplication.dto.CallDetailsDTO;
import com.jithendra.telecomapplication.dto.CustomerDTO;
import com.jithendra.telecomapplication.dto.FriendFamilyDTO;
import com.jithendra.telecomapplication.service.CustomerService;


@RestController
public class CustomerController {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CustomerService customerservice;
	
	
	@PostMapping(value="/customers", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void createCustomer(@RequestBody CustomerDTO customerdto)
	{
		logger.info("Creation request for customer{}",customerdto);
		customerservice.createCustomer(customerdto);
	}
	

	@GetMapping(value="/customers/{phoneNo}", produces=MediaType.APPLICATION_JSON_VALUE)
	public CustomerDTO getCustomerProfile(@PathVariable Long phoneNo)
	{
		logger.info("profile request for customer {}",phoneNo);
		return customerservice.getCustomerProfile(phoneNo);
	}
	
	@GetMapping(value="/customers/{phoneNo}/calldetails", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<CallDetailsDTO> getCustomerCallDetails(@PathVariable long phoneNo)
	{
		logger.info("calldetail request for customer {}",phoneNo);
		return customerservice.getCustomerCallDetails(phoneNo);
	}
	
	@PostMapping(value = "/customers/{phoneNo}/friends", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveFriend(@PathVariable Long phoneNo, @RequestBody FriendFamilyDTO friendDTO) {
		logger.info("Creation request for customer {} with data {}", phoneNo, friendDTO);
		customerservice.saveFriend(phoneNo, friendDTO);
	}
	

}
