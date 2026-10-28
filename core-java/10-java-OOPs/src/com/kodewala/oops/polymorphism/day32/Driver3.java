package com.kodewala.oops.polymorphism.day32;

class Employee {
	public void markIn() {
		System.out.println("Employee.markIn()....Employee marking in");
	}
}

class HRManager extends Employee {
	@Override
	public void markIn() {
		System.out.println("HRManager.markIn()....HRManager marking in");
	}
}

public class Driver3 {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.markIn();
		
		Employee employee2 = new HRManager(); // Parent class can refer to child class obejct
		employee2.markIn(); // same method will behave differently based on the actual object
		// 1. at the time compilation, it will check the method exists in class Employee
		// 2. at the time of execution (while running), it will call the method on actual object
		int hashCode = employee2.hashCode();
		// 1. compiler will check in Employee class hashCode() is present or not, due to inheritance the Object class
		// hashCode() method is present inside Employee class
		//2. during run-time it will invoke the hashCode() method on HRManager object
		System.out.println(hashCode);
		// 3. first JVM will give priority to child class -> whether the method present or not
		// if method not present then it will call the parent class method
		
	}
}
