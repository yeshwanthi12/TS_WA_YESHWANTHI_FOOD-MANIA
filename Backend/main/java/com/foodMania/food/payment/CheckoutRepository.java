package com.foodMania.food.payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface CheckoutRepository extends JpaRepository<Checkout,Integer>{

}
