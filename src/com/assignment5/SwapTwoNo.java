package com.assignment5;

import java.util.Scanner;

public class SwapTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,c;
         Scanner sc = new Scanner(System.in);
	     System.out.println("Enter value of a:");  
	     a = sc.nextInt();
	     System.out.println("Enter value of b:");
	     b = sc.nextInt();
         c=a;
         a=b;
         b=c;
         System.out.println("Value of a "+a);
         System.out.println("Value of b "+b);
         
	}

}
