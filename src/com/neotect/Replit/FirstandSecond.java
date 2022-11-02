package com.neotect.Replit;

import java.util.Scanner;

public class FirstandSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE

		// 1st way;
		// System.out.println(word.substring(0, 1) + word.substring(word.length()-1));

		// 2nd way
		char c = word.charAt(0);
		char v = word.charAt(word.length() - 1);

		System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));

	}

}
