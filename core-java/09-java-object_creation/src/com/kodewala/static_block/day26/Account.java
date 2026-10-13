package com.kodewala.static_block.day26;

class AccountMgmt {
	
	public AccountMgmt() {
		System.out.println(" AccountMgmt constructor executed...");
	}
}

public class Account extends AccountMgmt {
	
	String accountNumberString;

	public Account(String accountNumberString) {
		super(); // 1st line
//		call to instance block --> this is second line
		System.out.println(" Account class constructor executed");
		this.accountNumberString = accountNumberString;
	}
//	static block exectes only once at the time of class loading
	static {
		System.out.println("Account SIB exectued");
	}
	
//	instance init block --> this will get executed whenever object is created...
	{
		System.out.println(" Account IIB");
	}
}
