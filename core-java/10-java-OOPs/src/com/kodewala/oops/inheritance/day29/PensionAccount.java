package com.kodewala.oops.inheritance.day29;

public class PensionAccount extends SrCitAccount {
	
	public PensionAccount() {
		System.out.println("PensionAccount constructor()");
	}
	
	public void openAccount(String userId, String email) {
		System.out.println("PensionAccount.openAccount()");
	}
}
