package com.capgemini.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("serial")
public class TimeReportItem
{
private int itemId;
private String itemName;
private String itemPrice;
private String deliveryitemTime;
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
public String getItemPrice() {
	return itemPrice;
}
public void setItemPrice(String itemPrice) {
	this.itemPrice = itemPrice;
}
public String getDeliveryitemTime() {
	return deliveryitemTime;
}
public void setDeliveryitemTime(String deliveryitemTime) {
	this.deliveryitemTime = deliveryitemTime;
}
public TimeReportItem(int itemId, String itemName, String itemPrice, String deliveryitemTime) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.itemPrice = itemPrice;
	this.deliveryitemTime = deliveryitemTime;
}


	}
	
	
	

