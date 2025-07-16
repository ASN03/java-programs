package com.elemica.assignment.five;

public interface Device {
	default void powerOn() {
		System.out.println("Device is up and running.");
	}
	static void deviceType() {
		System.out.println("Device type is ");
	}
}
