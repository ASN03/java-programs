package com.elemica.assignment.four;

public abstract class Appliance {
	private String color;
	private String model;
	private int price;
	
	public Appliance(String color, String model, int price) {
		this.color = color;
		this.model = model;
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void getAppliance();
	
}
