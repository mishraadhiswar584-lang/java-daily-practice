package com.Adi.kodewala;

public class Driver 
{

	public static void main(String[] args) 
	{
   
		IDiscount discount = new FlightBooking();
		int result = discount.calculateDiscount(200, 10);
		System.out.println(result);
		
		FlightBooking fb = (FlightBooking) discount;
	}

}