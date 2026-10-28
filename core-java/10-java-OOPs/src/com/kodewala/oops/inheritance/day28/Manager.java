package com.kodewala.oops.inheritance.day28;
// Manager IS-A Employee
public class Manager extends Employee {
	
	public Manager(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void doSomething() {
		System.out.println(" Name : " + name);
		System.out.println(" Address : " + address);
		
//		System.out.println(" Sen. Code " + sensitiveCode); // this field is not visible as it's private
	}
	public void managerMarkIn(String empId) {
//		this method present in SuperClass (Employee)
		markIn(empId);
	}
}
