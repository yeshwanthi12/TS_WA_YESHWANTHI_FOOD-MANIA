package com.foodMania.food.menu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodMania.food.restaurant.Restaurant;

public interface MenuRepository extends JpaRepository<Menu,Integer>{

	List<Menu> findByRestaurantId(int restaurantId);



}
