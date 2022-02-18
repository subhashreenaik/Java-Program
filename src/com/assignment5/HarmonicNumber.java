package com.assignment5;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number ");
	      Scanner s = new Scanner(System.in);
	      int n = s.nextInt();
	      if(n ==0) {
	    	  System.out.println("n can not be zero");
	    	  System.exit(0);
	      }
	      double result = 0.0;
        
        System.out.println("The harmonic series is: ");
 
        
        while (n > 0) {
 
            result = result + (double)1 / n;
            n--;
            System.out.print(result + ", ");
        }
	}

}
