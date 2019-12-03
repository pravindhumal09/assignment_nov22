package com.assignment.nov22;							//package
import java.util.Scanner;								//import Scanner class of util package 

	public class Electricity {				
		
		/**
		 * . Calculate electricity bill : input-> 355 units 
		For 1st 100 units cost-100*5=500
		, for next 200 units ->200*10=2000 
		and for remaining units-> 55*20=1100
			Final bill -> 500+2000+1100=3600

		 * @author Pravin
		 */
		public static void main(String args[]) {
			long units;
			Scanner sc = new Scanner(System.in);						
			System.out.println("Enter number of units");
			units = sc.nextLong();
			double billpay = 0;
			if (units < 100)
				billpay = units * 5;							
			else if (units <= 300)
				billpay = 100 * 5 + (units - 100) * 10;
			else if (units > 300)
				billpay = 100 * 5 + 200 * 10 + (units - 300) * 20;
			System.out.println("Electricity consumption : " + billpay);
			sc.close();
		}
	}


