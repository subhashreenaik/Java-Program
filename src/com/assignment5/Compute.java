package com.assignment5;

import java.util.Scanner;

public class Compute {

	public static void main(String[] args) {
		int a,b;
        Scanner sc = new Scanner(System.in);
	     System.out.println("Enter value of a:");  
	     a = sc.nextInt();
	     System.out.println("Enter value of b:");
	     b = sc.nextInt();
	     int quotient = a / b;
	     int remainder = a % b;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	  }
	}
