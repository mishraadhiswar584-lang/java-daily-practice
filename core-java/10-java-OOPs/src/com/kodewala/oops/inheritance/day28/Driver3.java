package com.kodewala.oops.inheritance.day28;

public class Driver3 {
	public static void main(String[] args) {
		Product product = new Product("IPhone", "Phone for rich", 4, "available");
		product.viewProductDetails();
		
		ElectronicProduct electronicProduct = new ElectronicProduct("Asus Laptop", 
				"It's Asus Zenbook", 3, "available", true, 3);
		
		electronicProduct.viewElectronicProductDetails();
		
		ClothingProduct clothingProduct = new ClothingProduct("Shirt", "Full sleeve", 4, "delivery not available in your address", "Green", "Male", "L");
		clothingProduct.viewClothingDetails();
	}
}
