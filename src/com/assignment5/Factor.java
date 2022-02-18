package com.assignment5;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		 
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      
	      int number = sc.nextInt();
	      System.out.println("Prime factors of number  "+number);
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.print(i+" ");
	            number = number/i;
	         }
	        
	      }
	      if(number >2) {
		         System.out.println(number);
		      }
	   }
	
	}


