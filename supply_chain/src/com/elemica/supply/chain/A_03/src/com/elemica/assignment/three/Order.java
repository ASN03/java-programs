package com.elemica.assignment.three;

public class Order {
	String orderId;
	String orderDate;
	Product product;
	int quantityOrdered;
	String status;
	
	public double calculateOrderValue() {
		return product.getPrice()*quantityOrdered;
	}
}
