package com.foodMania.food.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepository;
	@GetMapping("/api/restaurants")
	private List<Restaurant> restaurants() {
    	return restaurantRepository.findAll();
	}
}
