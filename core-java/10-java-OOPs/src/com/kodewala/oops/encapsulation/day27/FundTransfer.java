package com.kodewala.oops.encapsulation.day27;

public class FundTransfer {
	public static void main(String[] args) {
		Account account = new Account("Shovan", "852096314", 780000);
		
		account.doTransaction(5000);
		System.out.println(account.getFullDetails());
		
		account.doTransaction(8000);
		System.out.println(account.getFullDetails());
		
		account.doTransaction(-7777);
		
		int currentBalance = account.showBalance();
		System.out.println(currentBalance); 
	}
}
