package com.kodewala.oops.encapsulation.day27;

public class FundTransfer {
	public static void main(String[] args) {
		
		Account account = new Account("Shovan", "852096314", 780000);
		
		String details = account.getFullDetails();
		System.out.println(details);
		
		account.doTransaction(600);
		int currentBalance = account.showBalance();
		System.out.println(currentBalance);
	}
}
