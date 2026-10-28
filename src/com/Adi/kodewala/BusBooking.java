package com.Adi.kodewala;

public class BusBooking implements IDiscount {

	@Override
	public int calculateDiscount(int amount, int rate) {

		return IDiscount.MAX_VALUE;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateDiscountTax(int tax, String type) {
		// TODO Auto-generated method stub
		
	}

}