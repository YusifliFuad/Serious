package com.neotech;

public class ArrayList {

	public static void main(String[] args) {

//		char[] herif = new char[6];
//
//		herif[0] = 'A';
//		herif[1] = 'B';
//		herif[2] = 'C';
//		herif[3] = 'D';
//		herif[4] = 'E';
//		herif[5] = 'F';
//
//		System.out.println("Your charachter is: " + herif[1]);
//
//		char[] herif2 = { 'A', 'B', 'C', 'D', 'E', 'F' };
//
//		System.out.println(herif2[1]);
//
//		System.out.println(herif2.length);

//		int[] reqem = { 20, 40, 60, 80, 1 };
//		int sum = 0;
//
//		for (int i = 0; i < reqem.length; i++) {
//
//			sum += reqem[i];
//
//			System.out.println(sum);
//
//		}
//		System.out.println();
//
//		// TODO Auto-generated method stub

		String a = "Is it saturday? Is it raining? Do we have a java class today?";

		String[] arr = a.split("[?!.]");

		System.out.println(arr.length);

	}

}
