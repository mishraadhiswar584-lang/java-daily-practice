package com.kodewala.oops.polymorphism.day33;

public class RegisteredUser extends User {
	@Override
	public void calculateDiscount() {
//		some logic
		System.out.println("For registered user 5% discount applicable");
	}
}
