package com.Adi.kodewala;

public class FlightBooking extends Object implements IDiscount {

	@Override
	public int calculateDiscount(int amount, int rate) 
	{	
		int finalFare = amount - (amount * rate) / 100;
		return finalFare;

	}

	@Override
	public void calculateDiscountTax(int tax) {
		System.out.println("FlightBooking.calculateDiscountTax()");
		
	}

	@Override
	public void calculateDiscountTax(int tax, String type) {
		// TODO Auto-generated method stub
		
	}

}