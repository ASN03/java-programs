package com.elemica.assignment.three;

public class BulkOrder extends Order{
	
	double discountPercentage;
	
	@Override
	public double calculateOrderValue() {
		return product.getPrice()*quantityOrdered*0.01*(100.00-discountPercentage);
	}
}
