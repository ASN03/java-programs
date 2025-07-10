package com.elemica.assignment.three;

public class Product {

	private String productId;
	private String name;
	private String category;
	private int price;
	private int quantityInStock;
	
	public Product() {
		setProductId("Default ID");
		setName("Default Name");
		setCategory("Default Category");
		setPrice(0);
		setQuantityInStock(0);
	}
	
	public Product(String prodId, String nam, String cat, int prc, int quantity) {
		setProductId(prodId);
		setName(nam);
		setCategory(cat);
		setPrice(prc);
		setQuantityInStock(quantity);
	}
	
	public String getProductId() {return productId;}
	public String getName() {return name;}
	public String getCategory() {return category;}
	public int getPrice() {return price;}
	public int getQuantityInStock() {return quantityInStock;}
	
	public void setProductId(String s) {productId = s;}
	public void setName(String s) {name = s;}
	public void setCategory(String s) {category = s;}
	public void setPrice(int i) {price = i;}
	public void setQuantityInStock(int i) {quantityInStock = i;}
	
	public void displayProductDetails() {
		System.out.println("Product Id: " + getProductId());
		System.out.println("Product Name: " + getName());
		System.out.println("Product Category: " + getCategory());
		System.out.println("Product Price: " + getPrice());
		System.out.println("Quantity in Stock: " + getQuantityInStock());
	}
	
	
	
}

