package com.neotech.Homework;

public class TaskHome {

	public static String reverse(String str) {

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reversed += str.charAt(i);
		}

		return reversed;

	}

	public static void main(String[] args) {

		TaskHome str1 = new TaskHome();

		String day = "Fuad";

		System.out.println(TaskHome.reverse(day));

	}

}
