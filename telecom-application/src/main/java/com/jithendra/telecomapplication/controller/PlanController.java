package com.jithendra.telecomapplication.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jithendra.telecomapplication.dto.PlanDTO;
import com.jithendra.telecomapplication.service.PlanService;

@RestController
public class PlanController {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PlanService planService;
	
	@GetMapping(value="/plans", produces="application/json")
	public List<PlanDTO> getAllPlans()
	{
		return planService.getAllPlans(); 
	}

}
