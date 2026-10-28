package com.kodewala.oops.encapsulation.day27;

public class Payment {
//	outside class can't access private variable directly
	private int balance;

	public Payment(int balance) {
		super();
		this.balance = balance;
		System.out.println(" Account balance INR " + this.balance + "/-");
	}

//	setter method (debit)
	public void doDebit(int amount) {
		if (amount > 0) {
			System.out.println(" Processing your debit request of INR " + amount + "/-");
			balance -= amount;
			System.out.println(" Debit process completed...");
		} else {
			System.err.println(" Invalid Debit Input");
		}
	}

//	setter method (credit)
	public void doCredit(int amount) {
		if (amount > 0) {
			System.out.println(" Processing your credit request of INR " + amount + "/-");
			balance += amount;
			System.out.println(" Credit process completed...");
		} else {
			System.err.println(" Invalid Credit Input");
		}
	}
//	getter method
	public void getBalance() {
		System.out.println(" Available balance INR " + balance + "/-");
	}
}
