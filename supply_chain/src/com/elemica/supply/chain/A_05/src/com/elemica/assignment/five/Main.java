package com.elemica.assignment.five;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
		
		//	**** using lambda functions, NOT streams.
		
		numbers.forEach(n -> {if (n % 2 == 0) System.out.println(n);});
		
		
		List<String> strings = new ArrayList<>(List.of("ABC", "AABC", "xyz", "0123"));
		
		strings.sort((a,b) -> b.compareTo(a));
		strings.forEach(name -> System.out.println(name));
		
		numbers.forEach(n -> {
			System.out.println(n*3);
		});
		
		
		int x = 50; int y = 10;
		List<MathOperation> mathOperations = List.of(
				(a,b) -> a+b,
				(a,b) -> a - b,
				(a,b) -> a*b);
		mathOperations.forEach(ops -> System.out.println(ops.operate(x,y)));
		
		
		
		//	**** using streams
		
		ArrayList<Product> products = new ArrayList<>(List.of(new Product("mouse", 2000, "electronics"),
				new Product("keyboard", 2500, "electronics"),
				new Product("table", 1750, "furniture"),
				new Product("chair", 500, "furniture")));
		System.out.println("Products with price > 2000");
		products.stream()
			.filter(product -> product.getPrice() > 1000)
			.forEach(product -> System.out.println(product));
		
		
		//	*** to group products, we need a separate variable.
		// 		we cannot do it within list itself. so we will use Maps.
		
		Map<String, List<Product>> grouped = products.stream()
				.collect(Collectors.groupingBy(Product::getCategory));
		
		//now to count, operating on the map is sufficient.
		System.out.println("Count by group");
		
		//using lambda we can do the below,
		//grouped.forEach((category, list) -> System.out.println(category + " count- " + list.size()));
		
		//using streams
		
		grouped.entrySet().stream()
			.forEach(entry -> {
				String category = entry.getKey();
				long count = entry.getValue().size();
				System.out.println(category + " count- " + count);
			});
		//max price for each category
		grouped.entrySet().stream()
			.forEach(entry -> {
				String category = entry.getKey();
				List<Product> sortedProducts = entry.getValue();
				sortedProducts.sort(Comparator.comparingDouble(Product::getPrice));
				double maxPrice = sortedProducts.get(sortedProducts.size()-1).getPrice();
				System.out.println("Max price of " + category + " is " + maxPrice);
			});
		
		
		//Devices and Laptops
		
		Device laptop1 = new Laptop();
		Laptop laptop2 = new Laptop();
		
		laptop1.powerOn();
		laptop2.powerOn();
		
		
		//using method reference
		strings.forEach(System.out::println);
		
		//predicate
		Predicate<Integer> isEven = Main::isEven;
		
		numbers.forEach(num -> System.out.println(num + " is even. " + isEven.test(num)));
		
		//	**** Optionals implementation
		Optionals.runner();
		
		///*** question 7
		
		// sample employees
		List<Employee> employees = new ArrayList<Employee>(List.of(
				new Employee("HUM01", "ABC", "HR", 40000),
				new Employee("CS01", "DEF", "CS", 45000),
				new Employee("IT01", "HIJ", "IT", 60000),
				new Employee("SDE01", "KLM", "DEV", 80000)));
		
		System.out.println("Employees with Salary greater than 50k");
		employees.forEach(emp -> {if(emp.getSalary() > 50000) System.out.println(emp);});
		
		System.out.println("HR employees");
		employees.forEach(emp -> {if(emp.getDepartment().equals("HR")) System.out.println(emp);});
		
		System.out.println("Count of employees by department");
		Map<String, List<Employee>> empGroupedByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
		empGroupedByDept.forEach((dept, list) -> System.out.println(dept + " count is " + list.size()));
		
		employees.forEach(emp -> emp.setSalary(emp.getSalary()*1.10));
		
		employees.sort(Comparator.comparingDouble(Employee::getSalary));
		employees = employees.reversed();
		
		System.out.println("Sorted from highest to lowest salary:");
		employees.forEach(System.out::println);
		
		
	}
	
	public static boolean isEven (Integer number) {
		return (number % 2 == 0);
	}
	
	@FunctionalInterface
	interface Predicate<T> {
	    boolean test(T t);
	}

}
