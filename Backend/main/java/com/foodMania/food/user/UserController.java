package com.foodMania.food.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@PostMapping("/api/createAccount")
	public User createAccount(@RequestBody User user) {
		return userRepository.save(user);
	
	}
	@GetMapping("/api/login/{name}/{password}") 
	 public Optional<User> login(@PathVariable String name, @PathVariable String password) { 
		 return userRepository.findByNameAndPassword(name,password); 
	}
}



