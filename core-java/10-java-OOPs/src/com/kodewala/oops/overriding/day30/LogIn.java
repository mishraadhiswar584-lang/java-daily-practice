package com.kodewala.oops.overriding.day30;
/**
 * Overloading rules
 * 1. Should have multiple versions of same method
 * 2. Same method name
 * 3. Order of args, number of args, type of args should be different
 * 4. no role of access modifiers
 * 5. no role of static keyword
 * 
 * -> checks method signature
 */

public class LogIn {
//	v1
	public void doLogIn(String mobile, int otp) {
		System.out.println("LogIn.doLogIn() version 1");
	}
//	v2
	public void doLogIn(String email, String passsword) {
		System.out.println("LogIn.doLogIn() version 2");
	}
//	v3
	public void doLogIn(String gmail) {
		System.out.println("LogIn.doLogIn() version 3");
	}
//	v4
	static void doLogIn() {
		System.out.println("LogIn.doLogIn() static method");
	}
}

class LogInDriver {
	public static void main(String[] args) {
		LogIn in = new LogIn();
		in.doLogIn("something@gmail.com");
		in.doLogIn("9878546271", 657732);
		in.doLogIn("somegmail@yahoo.com");
		LogIn.doLogIn();
	}
} 
