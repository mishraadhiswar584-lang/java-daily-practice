package com.kodewala.oops.polymorphism.day32;

class User {
	
}

class AdminUser extends User {
	
}

class FinanceUser extends User {
	
}

public class Driver {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		User user = new User(); // User class object is referred by type User class
		AdminUser adminUser = new AdminUser(); // AdminUser class Object is referred by type AdminUser
		
//		Parent class can refer child class object
		User user2 = new AdminUser(); // this is called 'auto up-casting'
		
		User user3 = new FinanceUser(); // there will not be any data loss, here it's just referring
		
		AdminUser adminUser2 = (AdminUser) new User(); // child class type is reffering to parent class object (not allwed in java)
							//	(AdminUser) is target, we've to exlplicitly tell to compiler
		
	}
}
