package com.kodewala.oops.inheritance.day29;
/**
 * Understanding disadvantages of Inheritence :
 * 1. Tightly coupled
 * 2. Heavy class loading of Parents
 */
public class AccountDriver1 {
	public static void main(String[] args) {
		PensionAccount account = new PensionAccount();
		account.openAccount("USER6748", "something@gmail.com");
	}
}
