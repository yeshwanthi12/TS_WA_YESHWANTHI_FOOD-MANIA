package com.foodMania.food.finalorder;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FinalorderRepository extends JpaRepository<FinalOrder,Integer>{

	//List<FinalOrder> save(List<FinalOrder> finalOrder);

}
