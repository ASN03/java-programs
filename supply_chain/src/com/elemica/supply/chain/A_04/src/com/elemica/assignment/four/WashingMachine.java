package com.elemica.assignment.four;

public class WashingMachine extends Appliance{
	
	
	public WashingMachine(String color, String model, int price) {
		super(color, model, price);
		// TODO Auto-generated constructor stub
	}

	public void getAppliance() {
		System.out.println("Washing Machine Details:");
		System.out.println("Color:" + this.getColor());
		System.out.println("Model: " + this.getModel());
		System.out.println("Price: " + this.getPrice());
	}

}
