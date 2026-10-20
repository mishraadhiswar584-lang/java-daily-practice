package com.kodewala.static_block.day26;

public class UserDriver1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(" UserDriver1.main() STARTS");
		
		User user1 = new User("shovan2003", "kw7723", "8596789825"); // creating User object
		User user2 = new User("kodewala2022", "kd8790", "9865478965"); // another User object
		
		Account acc1 = new Account("58963247859");
		Account acc2 = new Account("25478963589");
		
		System.out.println(" UserDriver1.main() ENDS");
	}
}
