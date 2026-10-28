package com.kodewala.oops.polymorphism.day33;

/**
 * Responsible for calling the method based on run time object
 */
public class DiscountProcessor {
//	based on the User type it will call the calculateDiscount() method
	public void discountProcessor(User user) {
		user.calculateDiscount();
	}
}
