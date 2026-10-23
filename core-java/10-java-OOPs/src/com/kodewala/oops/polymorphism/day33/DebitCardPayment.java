package com.kodewala.oops.polymorphism.day33;

public class DebitCardPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("DebitCardPayment.doPayment()...DebitCardPayment");
	}
}
