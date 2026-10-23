package com.kodewala.oops.polymorphism.day33;

/**
 * Responsible for capturing the request
 */
public class Request {
	public static void main(String[] args) {
		DiscountProcessor processor = new DiscountProcessor();
		
//		User#1 is a Guest User 
		GuestUser guestUser = new GuestUser();
		processor.discountProcessor(guestUser);
		
//		User#2  is a Premium User
		PremiumUser premiumUser = new PremiumUser();
		processor.discountProcessor(premiumUser);
		
//		User#3 is a Registered User
		RegisteredUser registeredUser = new RegisteredUser();
		processor.discountProcessor(registeredUser);
		
//		same method discountProcessor() behaving differently, based on runtime object
	}
}
