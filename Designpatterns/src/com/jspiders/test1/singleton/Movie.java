// 1.Write a program to book ,movie,tickets with the help of singleton design pattern.
package com.jspiders.test1.singleton;

public class Movie {
	static int ticket;
	
	private Movie(int a)
	{
		ticket +=a;
		System.out.println("Ticket has been booked");
	}
	public static int getticket()
	{
		new Movie(0);
		return ticket;
	}
}
	
	
	

