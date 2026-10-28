package com.kodewala.oops.polymorphism.day33;

public class NetBankingPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("NetBankingPayment.doPayment()...NetBankingPayment");
	}
}
