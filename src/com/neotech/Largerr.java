package com.neotech;

public class Largerr {

	void larger(int a, int b) {

		if (a > b) {
			System.out.println("The larger number is " + a);
		} else {

			System.out.println("The larger number is " + b);
		}
	}

	void math(int a) {

		if (a % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}

	}

	void hello(String language) {

		if (language.equals("Azerbaijan")) {
			System.out.println("Salam Aleykum");
		} else if (language.equals("Turkey")) {
			System.out.println("Merhaba");
		} else {
			System.out.println(" ");
		}
	}

	void fact(int a) {

		int sum = 1;

		for (int i = a; i >= 1; i--) {

			sum += a * i;

			System.out.println(sum);
		}

	}

}
