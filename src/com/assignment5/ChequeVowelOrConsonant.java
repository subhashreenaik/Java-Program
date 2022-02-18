package com.assignment5;

import java.util.Scanner;

public class ChequeVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any English letter");
	    Scanner scan =new Scanner(System.in);
	    String letter=scan.nextLine();
        switch(letter) {
        case "a" : System.out.print("This letter is vowel "); break;
		case "e": System.out.print("This letter is vowel "); break;
		case "i": System.out.print("This letter is vowel "); break;
		case "o": System.out.print("This letter is vowel "); break;
		case "u": System.out.print("This letter is vowel "); break;
		default: System.out.print("This letter is Consonant "); break;
	}
        scan.close();

}
}