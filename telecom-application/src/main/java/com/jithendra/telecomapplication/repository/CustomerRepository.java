package com.jithendra.telecomapplication.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.jithendra.telecomapplication.entity.Customer;

  
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

