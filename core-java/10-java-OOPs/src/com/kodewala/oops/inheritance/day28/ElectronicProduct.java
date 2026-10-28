package com.kodewala.oops.inheritance.day28;
/** 
 * This class is for Electronic section
 */
public class ElectronicProduct extends Product {
//	child specific fields
	boolean isWarranty;
	int warrantyInYears;
	
	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYears) {
		super(productName, description, quantity, status);
		this.isWarranty = isWarranty;
		this.warrantyInYears = warrantyInYears;
	}
	
	public void viewElectronicProductDetails() {
//		calling Parent method, code reusing
		viewProductDetails();
		System.out.println(" Having Warranty - " + isWarranty);
		System.out.println(" Warranty in years - " + warrantyInYears);
	}
	
	
	
}
