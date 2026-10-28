package com.kodewala.string.day25;

final class AccountMgmt {
//	naming convension of final variable (all in cap), final variables mean 'Constant' in java.
	int num1 = 55;
	final int MAX_VALUE = 100000 + 66 + num1;
	
	public void doSomething1() {
		num1 ++;
//		MAX_VALUE ++; // it's not possible because of final keyword in variable
	}
	
	public void doSomething2() {
		System.out.println("Parent implementation...");
	}	
}

class AccountStatus {
//	overriden method
	public final void doSomething1() {
		System.out.println("It can't be overriden");
	}
	
	public void doSomething2() {
		System.out.println("It can be changed...");
	}
}
/**
 * We can't override final class. i.e, final keyword in calss level prevents inheritence
 */
public class Driver1 extends AccountStatus {
//	overriding method : we can't override final method of parent class
//	public final void doSomething1() {
//		
//	}
	public static void main(String[] args) {
		
	}
}
