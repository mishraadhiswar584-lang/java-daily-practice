package com.kodewala.oops.encapsulation.day27;

public class PaymentDriver1 {

	public static void main(String[] args) {
		Payment payment = new Payment(1000);
		payment.doCredit(+250);
		payment.getBalance();
	}

}
