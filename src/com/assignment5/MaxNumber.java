package com.assignment5;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b,c;
         Scanner sc = new Scanner(System.in);
	     System.out.println("Enter value of a:");  
	     a = sc.nextInt();
	     System.out.println("Enter value of b:");
	     b = sc.nextInt();
	     System.out.println("Enter value of c:");
	     c = sc.nextInt();
	     
	     if(a>b && a>c) {
	    	 System.out.println("Largest number is"+a);
	     }
	     if(b>a && b>c) {
	    	 System.out.println("Largest number is"+b);
	     }
	     else {
	    	 System.out.println("Largest number is"+c);
	     }
	}

}
