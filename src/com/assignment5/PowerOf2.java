package com.assignment5;

public class PowerOf2 {
	
	static void PowerTwo(int N) {
		for(int i=0;i<=N;i++) {
	    	   double j= Math.pow(2, i);
	    	   System.out.println(j+" ");
	       }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Take N value from command line argument");
     int N = Integer.parseInt(args[0]);
     if(N<31) {
    	 System.out.println("N is valid .");
    	 PowerTwo(N);
     }
     else {
    	 System.out.println("Invalid N value.Again enter n value between 0 to 31");
    	 System.exit(0);
     }
       
	}

}
