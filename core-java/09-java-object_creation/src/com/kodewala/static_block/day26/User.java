package com.kodewala.static_block.day26;

public class User {
	String userName;
	String userId;
	String mobileNumber;

//	static block will get executed just after the class loading (only once)
	static {
		System.out.println(" static init block executed");
	}
	
	public User() {
		
	}
//	for every object creaton Constructor will get executed
	public User(String userName, String userId, String mobileNumber) {
		System.out.println(" User constructor got executed...");
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}

}
