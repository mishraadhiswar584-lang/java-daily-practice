package com.kodewala.oops.inheritance.day29;

public class SrCitAccount extends SavingAccount {
	
	public SrCitAccount() {
		System.out.println("SrCitAccount constructor()");
	}
	
	@Override
	public void openAccount(String userId, String email) {
		System.out.println("SrCitAccount.openAccount()");
	}
}
