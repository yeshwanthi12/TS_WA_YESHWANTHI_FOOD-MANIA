package com.foodMania.food.finalorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	private FinalorderRepository finalorderRepository;
	@PostMapping("/api/finalOrder")
	public List<FinalOrder> finalOrder(@RequestBody List<FinalOrder> finalOrder) {
		
		
				List<FinalOrder> savedOrder = finalorderRepository.saveAll(finalOrder);
				
				return savedOrder;
	
	}
}
