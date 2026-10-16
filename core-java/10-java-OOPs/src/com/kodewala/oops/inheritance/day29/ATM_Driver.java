package com.kodewala.oops.inheritance.day29;

public class ATM_Driver {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.depositeMoney();
		atm.withdrawMoney();
		
		SBI_ATM atm2 = new SBI_ATM();
//		overriden method in child
		atm2.withdrawMoney();
//		parent class method invoked as we're not overriding
		atm2.depositeMoney(); // ATM class method
		
		HDFC_ATM atm3 = new HDFC_ATM();
//		both methods have been overriden, hence overriding methods will be called
		atm3.withdrawMoney(); // HDF_ATM class method
		atm3.depositeMoney(); // HDF_ATM class method
		
		IDFC_ATM atm4 = new IDFC_ATM();
		atm4.depositeMoney(); // ATM class method
		atm4.withdrawMoney(); // IDFC_ATM class method (Overriding method)
		
		
//		BOI likes the implementation of withdrawMoney() method of HDFC_ATM class and depositeMoney() method of SBI_ATM class
//		if BOI want to extend both classes to aquire different methods of parent class it is impossible in java in case of method
//		it is called multiple inheritance in java. That creates DOD problem
		
		ATM atm5 = new Yono_SBI();
		atm5.depositeMoney();
		atm5.withdrawMoney();
	}

}
