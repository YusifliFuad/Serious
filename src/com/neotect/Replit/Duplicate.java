package com.neotect.Replit;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();

		System.out.println(word1.concat(word2 + word2.concat(word1)));

	}

}
