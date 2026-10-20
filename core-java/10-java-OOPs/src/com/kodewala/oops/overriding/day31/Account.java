package com.kodewala.oops.overriding.day31;

public class Account {
	
	int minBalance = 10000;
	public String openAccount(String name, int initBalance) {
		// some ... 1000 lines of code
		System.out.println("Account.openAccount()");
		return "some string";
	}

}

/*
 * Rules for method overriding:
 * 1. The method name must be the same.
 * 2. The parameters must be the same (type, order and number of arguments).
 * 3. The return type must be the same, or co-variant (a subtype of the original).
 * 4. The access modifier must be the same or wider
 *    (public -> public; protected -> protected or public).
 * 5. It cannot throw broader checked exceptions than the parent method.
 * 6. private method can't be overriden.
 */

class SavingAccount extends Account {
	@Override	//Introduced in 1.5V, we're telling compiler that we're overriding the method, plz check all the rules
	public String openAccount(String _name, int _initBalance) {
		// 200 lines of code
		System.out.println("SavingAccount.openAccount()");
		return "some other string";
	}
}
 