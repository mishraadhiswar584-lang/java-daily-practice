package com.kodewala.oops.inheritance.day28;

public class Employee {
	String name;
	String address;
	
	@SuppressWarnings("unused")
	private String sensitiveCode = "IC678";
	
	public Employee() {
		System.out.println(" Parent constructor called");
	}
	
	public void markIn(String empId) {
		System.out.println(" Parent markIn() called");
		System.out.println(" Marking IN " + empId);
	}
}
