package com.elemica.assignment.five;

import java.util.Optional;

//creating this class for studying purposes - demonestrating various behaviours of the Optional container.
// took help from ChatGPT;
public class Optionals {
	public static void runner() {
		
		User nullUser = null;
		printCity(nullUser);
		
		User nullAddress = new User();
		printCity(nullAddress);
		
		User nullCity = new User();
		nullCity.setAddress(new Address());
		printCity(nullCity);
		
		User noNulls = new User();
		noNulls.setAddress(new Address());
		noNulls.address.setCity("Hi-Tech City");
		printCity(noNulls);
		
		
	}
	
	static void printCity(User user) {
		String city = Optional.ofNullable(user)
				.map(User::getAddress)
				.map(Address::getCity)
				.orElse("Unknown");
		
		System.out.println("City - " + city);
	}
	
}
;