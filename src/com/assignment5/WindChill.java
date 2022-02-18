package com.assignment5;

public class WindChill {
	
	static void compute(double t, double v) {
		double result = 35.74+0.6215*t +(0.4275*t - 35.75)*Math.pow(v, 0.16);
		System.out.println("The result is "+ result);
	}

	public static void main(String[] args) {
	
		System.out.println("Take t and v value from command line argument");
	     int t = Integer.parseInt(args[0]);
	     int v = Integer.parseInt(args[1]);
	     
	         if(t>50 && v>120 && v<3) {
	    	 System.out.println("Its not valid");
	    	 int t1 = Integer.parseInt(args[0]);
		     int v1 = Integer.parseInt(args[1]);
	    	 compute(t1, v1);
	     }
	     else
	     {
	    	 compute( t,v);
	     }
	}

	 

}
