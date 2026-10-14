package com.kodewala.oops.encapsulation.day27;

public class Account {
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	public Account(String accountHolderName, String accountNumber, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println(" Account Number : " + accountNumber 
				+ " , Current Balance: " + balance + "/- ");
	}
	
//	setter method
	public void doTransaction(int amount) {
		if (amount <= balance && amount > 0) {
			System.out.println(" Processing your transaction of Rs. " + amount + "/- ");
			balance -= amount;
			System.out.println(" Transaction successful...");
		} else {
			System.err.println(" Invalid amount in input");
		}
	}
	 
//	getter  method
	public int showBalance() {
		return balance;
	}
	 
	public String getFullDetails() {
		return " Account holder's name : " + accountHolderName 
				+ " , Account Number : " + accountNumber + " , Avl. Balance : " + balance + "/- ";
	}
	
}
