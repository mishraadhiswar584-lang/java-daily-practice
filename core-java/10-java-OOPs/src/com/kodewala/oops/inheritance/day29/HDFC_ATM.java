package com.kodewala.oops.inheritance.day29;

/**
 * HDFC_ATM and SBI_ATM extends ATM : it is hirerchical inheritance
 */
public class HDFC_ATM {
	
	public void depositeMoney() {
//		 min. depostite amount should be 1000
		System.out.println("HDFC_ATM.depositeMoney()");
	} 
	
	public void withdrawMoney() {
//		min withdraw avl. at 2000
		System.out.println("HDFC_ATM.withdrawMoney()");
	}
}
