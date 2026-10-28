package com.Adi.kodewala;


//java version 1.7 or 7 OR before
public interface IDiscount {
	
	public static final int MAX_VALUE = 100; // public static final --> constant
	
	// public abstract int calculateDiscount
	public abstract int calculateDiscount(int amount, int rate); // abstract --> idea or thought

	public abstract void calculateDiscountTax(int tax);
	public abstract void calculateDiscountTax(int tax, String type);

}

