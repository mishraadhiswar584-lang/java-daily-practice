package com.kodewala.oops.polymorphism.day33;

public class GuestUser extends User {
	@Override
	public void calculateDiscount() {
//		some logic
		System.out.println("For guest user 0% discount");
	}
}
