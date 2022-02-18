package com.assignment5;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Take x and y value from command line argument");
	     int x = Integer.parseInt(args[0]);
	     int y = Integer.parseInt(args[1]);
	     
	     double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	     
	     System.out.println("The distance between two number is  "+ distance);
	}

}
