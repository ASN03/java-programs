package com.elemica.assignment.three;

public class OnlineOrder extends Order {
	
	String deliveryAddress;
	
	@Override
	public double calculateOrderValue() {
		return product.getPrice()*quantityOrdered*1.25;
	}
}
