package com.jithendra.telecomapplication.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jithendra.telecomapplication.entity.CallDetails;


public interface CallDetailsRepository extends JpaRepository<CallDetails, Long> {
	List<CallDetails> findByCalledBy(long calledBy);
	

}

