package com.jithendra.telecomapplication.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jithendra.telecomapplication.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{

}
