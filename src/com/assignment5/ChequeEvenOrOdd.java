package com.assignment5;

import java.util.Scanner;

public class ChequeEvenOrOdd {
	static void chequeOddOrEven(int digit) {
		if(digit== 0) {
	    	   System.out.println("Number is neither odd nor even");
	       }
	       if(digit == 1) {
	    	   System.out.println("Number is odd");
	       }
	       if(digit%2 == 0) {
	    	   System.out.println("Number is even");
	       }
	       
	       else {
	    	   System.out.println("Number is odd");
	       }
		

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("Enter a  digit number:");
	       Scanner scan =new Scanner(System.in);
	       int digit=scan.nextInt();
	       chequeOddOrEven(digit);
	       scan.close();
	}

}
