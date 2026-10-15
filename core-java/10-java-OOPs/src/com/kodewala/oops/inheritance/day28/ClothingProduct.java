package com.kodewala.oops.inheritance.day28;
/** 
 * This class is for Clothing section
 */
public class ClothingProduct extends Product {
//	child specific fields
	String color;
	String gender;
	String size;
	
	public ClothingProduct(String productName, String description, int quantity, String status, String color,
			String gender, String size) {
//		initializing child object using Parent constructor
		super(productName, description, quantity, status);
		
//		initializing child specific fields
		this.color = color;
		this.gender = gender;
		this.size = size;
	}
	
	public void viewClothingDetails() {
//		resuing parent method
		viewProductDetails();
		System.out.println(" Color - " + color);
		System.out.println(" For - " + gender);
		System.out.println(" Size - " + size);
	}
}
