package com.foodMania.food.finalorder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FinalOrder {
	
	private int userId;
	private int restaurantId;
	private int itemId;
	private String itemName;
	private String itemDescription;
	private int itemPrice;
	private String itemImage;
	@Id
	//@GeneratedValue
	private int id;
	private boolean showAdd;
	private int qty;
	private int itemTotalPrice;
	public FinalOrder() {
		
	}
	public FinalOrder(int userId, int restaurantId, int itemId, String itemName, String itemDescription, int itemPrice,
			String itemImage, int id, boolean showAdd, int qty, int itemTotalPrice) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemImage = itemImage;
		this.id = id;
		this.showAdd = showAdd;
		this.qty = qty;
		this.itemTotalPrice = itemTotalPrice;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isShowAdd() {
		return showAdd;
	}
	public void setShowAdd(boolean showAdd) {
		this.showAdd = showAdd;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getItemTotalPrice() {
		return itemTotalPrice;
	}
	public void setItemTotalPrice(int itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}
	@Override
	public String toString() {
		return "FinalOrder [userId=" + userId + ", restaurantId=" + restaurantId + ", itemId=" + itemId + ", itemName="
				+ itemName + ", itemDescription=" + itemDescription + ", itemPrice=" + itemPrice + ", itemImage="
				+ itemImage + ", id=" + id + ", showAdd=" + showAdd + ", qty=" + qty + ", itemTotalPrice="
				+ itemTotalPrice + "]";
	}
	

}
