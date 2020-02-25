package com.foodMania.food.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutController {
	@Autowired
	private CheckoutRepository checkoutRepository; 
	@PostMapping("/api/Checkout")
	public Checkout checkout(@RequestBody Checkout checkout) {
	return checkoutRepository.save(checkout);
}
}

