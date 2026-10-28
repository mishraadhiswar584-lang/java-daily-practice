package com.kodewala.oops.polymorphism.day33;

public class PaymentProcessor {
//	this can accept any type of Payment object (CreditCard, DebitCard etc.)
	public void processPayment(Payment paymentType) {
		paymentType.doPayment(); // Polymorphism happening here
	}
}
