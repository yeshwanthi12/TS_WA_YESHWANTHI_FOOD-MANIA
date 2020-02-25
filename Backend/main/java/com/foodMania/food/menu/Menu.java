package com.foodMania.food.menu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Menu {
	@Id
	@GeneratedValue
	private int Id;
	private int restaurantId;
	private int itemId;
	private String itemName;
	private String itemDescription;
	private int itemPrice;
	private String itemImage;
	
	public Menu() {};
    public Menu(int id, int restaurantId, int itemId, String itemName, String itemDescription, int itemPrice,
			String itemImage) {
		super();
		Id = id;
		this.restaurantId = restaurantId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemImage = itemImage;
	}
	public int getId() {
		return Id;
		
	}
	public void setId(int id) {
		Id = id;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	@Override
	public String toString() {
		return "Menu [Id=" + Id + ", restaurantId=" + restaurantId + ", itemId=" + itemId + ", itemName=" + itemName
				+ ", itemDescription=" + itemDescription + ", itemPrice=" + itemPrice + ", itemImage=" + itemImage
				+ "]";
	}

	
	

}
