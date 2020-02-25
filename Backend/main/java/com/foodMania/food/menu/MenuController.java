package com.foodMania.food.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MenuController {
	@Autowired
	private MenuRepository menuRepository;
	
	@GetMapping("/api/{restaurantId}/menu")
	private List<Menu> restaurants(@PathVariable int restaurantId) {
    	return menuRepository.findByRestaurantId(restaurantId);
	}
	
}
