package com.neotech;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner test = new Scanner(System.in);

//		double salary;

		// String name;
		// int age;

		// System.out.println("What is your name?");
		// name = test.next();
		// System.out.println("Your name is: ");
		// System.out.println("what is your salary?");
		// salary = test.nextDouble();
		// System.out.println("Your age is: ");
		// System.out.println("How old are you?");

		// int day = 3;

		// switch(day) {

		// case1:
		// System.out.println("");

		Scanner scan = new Scanner(System.in);
		String country;
		
		System.out.println("Where are you from?");


		country = scan.next();
		
		
		if (country.equals("Azerbaijan")) {
			System.out.println("They speak Azerbaijani");

		}
		
		else if (country.equals("Turkiye")) {
			System.out.println("They speak Turkish");
		}

	}

}
