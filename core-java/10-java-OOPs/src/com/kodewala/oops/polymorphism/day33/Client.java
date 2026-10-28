package com.kodewala.oops.polymorphism.day33;

/**
 * Request page :
 * processPayment() behaving differently based on the object type
 */
public class Client {
	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
//		for the user#1, he/she selected payment method as a CreditCard
		CreditCardPayment cardPayment = new CreditCardPayment();
		paymentProcessor.processPayment(cardPayment);
		
//		for the user#2, he/she selected payment method as a NetBankingPayment
		NetBankingPayment bankingPayment = new NetBankingPayment();
		paymentProcessor.processPayment(bankingPayment);
		
//		for the user#3, he/she selected payment method as a UPIPayment
		UPIPayment upiPayment = new UPIPayment();
		paymentProcessor.processPayment(upiPayment);
	}
}
