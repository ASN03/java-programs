package com.elemica.assignment.six;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Inventory> inventoryList = new ArrayList<Inventory>(List.of(
				new Inventory("Keyboard", 1, "kb123", 5 ),
				new Inventory("Monitor", 3, "monitor123", 6),
				new Inventory("Mouse", 2, "mouse123", 3),
				new Inventory("Laptop", 4, "lap123", 2)
				));
		
		Set<Inventory> inventorySet = new TreeSet<Inventory>(Comparator.comparing(Inventory::getItemNo)); // using tree set for sorting
		inventorySet.add(inventoryList.get(0));
		inventorySet.add(inventoryList.get(0));
		inventorySet.add(inventoryList.get(1));
		inventorySet.add(inventoryList.get(2));
		inventorySet.add(inventoryList.get(3));
		
		
		inventoryList.add(inventoryList.get(3));
		
		
		System.out.println("List items: ");
		inventoryList.forEach(item -> System.out.println(item));
		
		System.out.println("\n Set items:");
		inventorySet.forEach(item -> System.out.println(item));
		
		System.out.println("\n Sorting items based on item no, and then reversing it:");
		
		inventoryList.sort(Comparator.comparingInt(Inventory::getItemNo));
		System.out.println("List items: ");
		inventoryList.forEach(item -> System.out.println(item));
		
		inventoryList = inventoryList.reversed();
		
		System.out.println("List items: ");
		inventoryList.forEach(item -> System.out.println(item));
		
		System.out.println("Cannot reverse a set in place");

		
		
		

	}

}
