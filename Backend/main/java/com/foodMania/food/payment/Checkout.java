package com.foodMania.food.payment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Checkout {
	@Id
	private int id;
	private int userId;
	private int restaurantId;
	private int orderTotal;
	private String name;
	private String address;
	private int number;
	private String nameOnCard;
	private int cardNumber;
	private int expMonth;
	private int expYear;
	private int cvv;
	private int zip;
	
	public Checkout(){}
	

	public Checkout(int id, int userId, int restaurantId, int orderTotal, String name, String address, int number,
			String nameOnCard, int cardNumber, int expMonth, int expYear, int cvv, int zip) {
		super();
		this.id = id;
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.orderTotal = orderTotal;
		this.name = name;
		this.address = address;
		this.number = number;
		this.nameOnCard = nameOnCard;
		this.cardNumber = cardNumber;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.cvv = cvv;
		this.zip = zip;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Checkout [id=" + id + ", userId=" + userId + ", restaurantId=" + restaurantId + ", orderTotal="
				+ orderTotal + ", name=" + name + ", address=" + address + ", number=" + number + ", nameOnCard="
				+ nameOnCard + ", cardNumber=" + cardNumber + ", expMonth=" + expMonth + ", expYear=" + expYear
				+ ", cvv=" + cvv + ", zip=" + zip + "]";
	};
	
	

}
