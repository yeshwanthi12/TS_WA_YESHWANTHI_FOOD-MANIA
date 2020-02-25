package com.foodMania.food.restaurant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue
	private int id;
	private String restaurantName;
	private String description;
	private String minimumOrder;
	private String estimationTime;
	private String paymentOptions;
	private boolean orderOnline;
	
	public Restaurant() {};
	public Restaurant(int id, String restaurantName, String description, String minimumOrder, String estimationTime,
			String paymentOptions, boolean orderOnline) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.description = description;
		this.minimumOrder = minimumOrder;
		this.estimationTime = estimationTime;
		this.paymentOptions = paymentOptions;
		this.orderOnline = orderOnline;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMinimumOrder() {
		return minimumOrder;
	}
	public void setMinimumOrder(String minimumOrder) {
		this.minimumOrder = minimumOrder;
	}
	public String getEstimationTime() {
		return estimationTime;
	}
	public void setEstimationTime(String estimationTime) {
		this.estimationTime = estimationTime;
	}
	public String getPaymentOptions() {
		return paymentOptions;
	}
	public void setPaymentOptions(String paymentOptions) {
		this.paymentOptions = paymentOptions;
	}
	public boolean isOrderOnline() {
		return orderOnline;
	}
	public void setOrderOnline(boolean orderOnline) {
		this.orderOnline = orderOnline;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", restaurantName=" + restaurantName + ", description=" + description
				+ ", minimumOrder=" + minimumOrder + ", estimationTime=" + estimationTime + ", paymentOptions="
				+ paymentOptions + ", orderOnline=" + orderOnline + "]";
	}
	
	
    

}
