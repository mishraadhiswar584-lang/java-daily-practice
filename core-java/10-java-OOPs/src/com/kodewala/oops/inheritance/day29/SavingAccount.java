package com.kodewala.oops.inheritance.day29;

public class SavingAccount extends Account {
	
	public SavingAccount() {
		System.out.println("SavingAccount constructor()");
	}
	
	@Override
	public void openAccount(String userId, String email) {
		System.out.println("SavingAccount.openAccount()");
	}

}
