package com.elemica.assignment.four;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = {new Car(), new Bike(), new Truck()};
		
		for(Vehicle vehicle: vehicles) {
			vehicle.startEngine();
			vehicle.stopEngine();
		}
	}

}
