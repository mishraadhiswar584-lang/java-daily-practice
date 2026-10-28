package com.kodewala.oops.inheritance.day28;

public class SavingAccount extends Account {
	public void openSavingAccount(String name, String address, String type) {
//		reusing the existing functionality
//		calling the parent class method
		openBankAccount(name, address, type);
	}
}
