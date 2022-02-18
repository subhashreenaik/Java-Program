package com.assignment5;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    PrintWriter writer = new PrintWriter(System.out);

	    // enter row and column for array.
	    System.out.print("Enter row for the array : ");
	    int m = scan.nextInt();
	    System.out.print("Enter column for the array  : ");
	    int n = scan.nextInt();
	    
	    int arr[][] = new int[m][n];
	   
	    System.out.println("Enter " + (m * n) + " Array Elements : ");
	    for (int i = 0; i < m; i++) {
	      for (int j = 0; j < n; j++) {
	        arr[i][j] = scan.nextInt();
	      }
	    }

	    // 
	    System.out.print("The Array is :");
	    for (int i = 0; i <m ; i++) {
	      for (int j = 0; j <n ; j++) {     
	        writer.printf(arr[i][j] + "  "); 
	        System.out.println(arr[i][j] + "  ");//printing the output using printwriter
	      }
	      writer.printf(" ");
	      System.out.println(" ");
	    }
	  }
	}