package com.kodewala.oops.inheritance.day28;
/** 
 * This class is for All product section
 */
public class Product {
	String productName;
	String description;
	int quantity;
	String status;
	
	public Product(String productName, String description, int quantity, String status) {
		super();
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;
	}
	
	public void viewProductDetails() {
		System.out.println(" Name - " + productName);
		System.out.println(" Description - " + description);
		System.out.println(" Quantity - " + quantity);
		System.out.println(" Status - " + status);
	}
}
