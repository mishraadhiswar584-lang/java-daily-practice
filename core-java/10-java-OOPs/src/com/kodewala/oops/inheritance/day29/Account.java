package com.kodewala.oops.inheritance.day29;
/**
 * Parent of the remaining classes in the program ...
 */
public class Account {
	
	public Account() {
		System.out.println("Account constructor()");
	}
	
	public void openAccount(String userId, String email) {
		System.out.println("Account.openAccount()");
	}
}
