package com.elemica.assignment.three;

public class Supplier {
	private String supplierId;
	private String name;
	private String location;
	private Product[] suppliedProducts;
	
	public Supplier() {
		supplierId = "Default ID";
		name = "Default name";
		location = "Default Location";
		suppliedProducts = new Product[0];
	}
	
	public Supplier(String id, String nam, String loc, Product[] suppliedProds) {
			supplierId = id;
			name = nam;
			location = loc;
			suppliedProducts = suppliedProds;
	}
	
	public void addProduct(Product prod) {
		Product[] prodArray = new Product[suppliedProducts.length + 1];
		for(int i = 0; i < suppliedProducts.length; i++) {
			prodArray[i] = suppliedProducts[i];
		}
		prodArray[suppliedProducts.length] = prod;
		
		suppliedProducts = prodArray;
	}
	
	public void printProduct() {
		System.out.println();
		System.out.println("Products Supplied: ");
		System.out.println();
		for(int i = 0; i < suppliedProducts.length; i++) {
			System.out.println("Product #" + (i+1));
			suppliedProducts[i].displayProductDetails();
			System.out.println();
		}
	}
}
