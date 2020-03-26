package com.capgemini.entity;

public class TimeReportProduct {
	private int productId;
	private String productName;

	private String deliveryproductTime;
	public TimeReportProduct(int productId, String productName,  String deliveryproductTime) {
		super();
		this.productId = productId;
		this.productName = productName;
	
		this.deliveryproductTime = deliveryproductTime;
	}
	
		// TODO Auto-generated constructor stub
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getDeliveryproductTime() {
		return deliveryproductTime;
	}
	public void setDeliveryproductTime(String deliveryproductTime) {
		this.deliveryproductTime = deliveryproductTime;
	}
}
