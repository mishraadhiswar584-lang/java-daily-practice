package com.kodewala.hotstar;
import com.kodewala.hotstar.user.*;

/**
 * Counting number of object created
 */
public class Driver {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		User u1 = new User("guest", "free");
		User u2 = new User("guest", "free");
		
		for(int i = 0; i < 100; i++) {
			User user = new User("prime", "paid");
		}
		
		System.out.println(" LIVE USERS : " + User.LiveUserCount);
	}
}
