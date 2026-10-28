package com.kodewala.hotstar.user;

public class User {
	
	String userId;
	String userName;
	String type;
	
	public static int LiveUserCount = 0;
	
	static {
		System.out.println(" User class loaded successfully");
	}
	
	public User(String userId, String userName, String type) {
//		super();
//		2nd line -> execute instance block
		this.userId = userId;
		this.userName = userName;
		this.type = type;
	}

	public User(String userName, String type) {
//		super();
//		2nd line -> execute instance block
		this.userName = userName;
		this.type = type;
	}
	
//	executes for every object creation -- IIB -> instance init block
	{
		LiveUserCount++;
	}

}
