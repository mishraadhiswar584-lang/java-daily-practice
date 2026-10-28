package com.kodewala.oops.polymorphism.day33;

public class PremiumUser extends User {
	@Override
	public void calculateDiscount() {
//		some logic
		System.out.println("For premium user 15% discount applicable");
	}
}
