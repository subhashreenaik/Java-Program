package com.assignment5;

import java.util.Scanner;

public class SumOfThreIsZero {
	static void triplet(int n,int arr[]){
		int count=0;
	    for(int i =0;i<n;i++) {
	    	for(int j=i+1;j<n;j++) {    //2 3 4 5
	    		for(int k=j+1;k<n;k++ ) {
	    			if(arr[i]+arr[j]+arr[k] == 0)
	    			{
	    				System.out.println("Triplet is " + arr[i] + " " + arr[j] + " " + arr[k]);
	    				count++;
	    			}
	    		}
	    	}
	    }
	    System.out.println("Number of triplet is "+ count);
		
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter the size of the array: ");
	    Scanner s = new Scanner(System.in);
	    int n =s.nextInt();
	    
	    int arr[] = new int[n];
	    System.out.println("Enter the elements of the array");
	    for(int i=0;i<n;i++) {
	    	arr[i] = s.nextInt();
	    	
	    }
	    triplet(n, arr);
	    
	       
	    
	}

}
