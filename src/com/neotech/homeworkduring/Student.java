package com.neotech.homeworkduring;

public class Student {

	String name;
	int studentNr, gradeLevel;

	void study() {

		System.out.println(name + "  with this " + studentNr + " number is studying");

	}

	void sleep() {
		System.out.println(name + " and " + gradeLevel + " student of the school is sleeping");

	}

	void greetingwith(int b, String a) {

		for (int i = 1; i <= b; i++) {
			System.out.println(a);
		}

	}

}
