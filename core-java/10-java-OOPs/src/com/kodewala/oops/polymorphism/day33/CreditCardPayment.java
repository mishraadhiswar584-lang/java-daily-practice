package com.kodewala.oops.polymorphism.day33;

public class CreditCardPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("CreditCardPayment.doPayment()...CreditCardPayement");
	}
}
