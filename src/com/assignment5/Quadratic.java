package com.assignment5;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter numbers:");
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		double delta;
		delta =  b * b - 4.0 * a * c;
		
		if(delta >= 0) {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Roots are  "+x1+" and "+x2);
			
		}
		else {
			System.out.println("Roots are not real");
		}
		scan.close();
	}

}
