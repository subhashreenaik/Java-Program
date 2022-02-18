package com.assignment5;

import java.util.Scanner;

public class LeapYear {
	
	static void findLeapyear(int year) {
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println(year+"is a leap year");
	      else
	         System.out.println(year+" is not a leap year");
	}

	public static void main(String[] args) {
		int year;
	      System.out.println("Enter an Year ");
	      Scanner s = new Scanner(System.in);
	      year = s.nextInt();
	      if(year<1000) {
	    	  System.out.println("Please enter four digit number");
	    	  int year1=s.nextInt();
	    	  findLeapyear(year1);
	      }
	      else {
	    	  findLeapyear(year);
	      }
	      
	   }
	
	}