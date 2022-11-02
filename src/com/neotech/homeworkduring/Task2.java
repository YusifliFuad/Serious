package com.neotech.homeworkduring;

public class Task2 {

	public static String method(String str) {

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reversed += str.charAt(i);

		}
		return reversed;

	}

	public static void main(String[] args) {

		Task2 demo = new Task2();

		Task2.method("Fuad");

	}

}
